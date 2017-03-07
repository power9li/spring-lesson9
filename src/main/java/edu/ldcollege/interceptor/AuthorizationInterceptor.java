package edu.ldcollege.interceptor;

import edu.ldcollege.domain.User;
import edu.ldcollege.login.UserSessionRepository;
import edu.ldcollege.utils.CookieUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by shenli on 2017/3/3.
 */
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("AuthorizationInterceptor.preHandle");
        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);
        String xRequestWith = request.getHeader("X-Requested-With");
        System.out.println("xRequestWith = " + xRequestWith);
        String contentType = request.getContentType();
        System.out.println("contentType = " + contentType);
        HttpSession session = request.getSession();
        int maxInactiveInterval = session.getMaxInactiveInterval();

        System.out.println("session = " + session);
        System.out.println("session.maxInactiveInterval = " + maxInactiveInterval);

        Cookie sessionCk = CookieUtils.getCookie(request,"sessionId");
        System.out.println("cookie.sessionId = " + sessionCk);

        if (sessionCk != null) {
            String sessionId = sessionCk.getValue();
            User user = UserSessionRepository.getBySessionId(sessionId);
            if (user != null) {
                session.setAttribute("loginUser", user);
                return true;
            }
        }

        if (session != null) {
            Object user = session.getAttribute("loginUser");
            System.out.println("session.loginUser = " + user);
            if (user != null) {
                return true;
            }
            if (user == null) {
                response.setContentType("application/json");
                response.getWriter().print("{\"success\":false,\"handler\":\"location.href='/login.html'\"}");
                response.flushBuffer();
                return false;
            }
        }
        else{
            response.setContentType("application/json");
            response.getWriter().print("{\"success\":false,\"handler\":\"location.href='/login.html'\"}");
            response.flushBuffer();
        }
        return false;
    }


}
