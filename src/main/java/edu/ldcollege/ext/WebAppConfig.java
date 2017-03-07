package edu.ldcollege.ext;

import edu.ldcollege.interceptor.AuthorizationInterceptor;
import edu.ldcollege.interceptor.FileUploadInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by shenli on 2017/2/24.
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Value(value = "${upload.maxSize}")
    private long maxSize;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("WebAppConfig.addInterceptors");
        FileUploadInterceptor fileUploadInterceptor = new FileUploadInterceptor();
        fileUploadInterceptor.setMaxSize(maxSize);
        registry.addInterceptor(fileUploadInterceptor).addPathPatterns("/**");

        AuthorizationInterceptor authorizationInterceptor = new AuthorizationInterceptor();
        registry.addInterceptor(authorizationInterceptor).addPathPatterns(
                "/ldhomework/**",
                "/ldhomeworkfb/**",
                "/ldClass/**");
        super.addInterceptors(registry);
    }

}
