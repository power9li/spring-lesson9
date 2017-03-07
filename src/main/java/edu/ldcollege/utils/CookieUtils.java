package edu.ldcollege.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by shenli on 2017/3/7.
 */
public class CookieUtils {

    public static Cookie getCookie(HttpServletRequest req, String name) {
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie ck : cookies) {
                System.out.println("ck = " + ck.getName() + " == " + name);
                if (ck.getName().equals(name)) {
                    return ck;
                }
            }
        }
        return null;
    }
}
