package edu.ldcollege.interceptor;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by shenli on 2017/2/24.
 */
public class FileUploadInterceptor extends HandlerInterceptorAdapter {
    private long maxSize;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==FileUploadInterceptor.preHandle REQ.URL=["+request.getRequestURL()+"] maxSize="+maxSize+",REQ.CNT_TYPE=["+request.getContentType()+"]");
        if(request!=null && ServletFileUpload.isMultipartContent(request)) {
            ServletRequestContext ctx = new ServletRequestContext(request);
            long requestSize = ctx.contentLength();
            System.out.println("requestSize = " + requestSize);
            if (requestSize > maxSize) {
                throw new MaxUploadSizeExceededException(maxSize);
            }
        }
        return true;
    }

    public void setMaxSize(long maxSize) {
        this.maxSize = maxSize;
    }
}
