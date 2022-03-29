package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * 自定义web mvc的行为时，只需要添加@Configuration与实现WebMvcConfigurer接口
 * 不要添加EnableWebMvc注解，否则会让整个Web Mvc的自动配置失效
 */
@Configuration
//@ServletComponentScan(basePackages = "com.filter")
public class MyServletMvcConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT", "OPTIONS", "HEAD")
                .allowedOrigins("http://127.0.0.1:5500");
    }

/*    @Autowired
    private FirstInterceptor firstInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //第一种写法（类上面没有扫描用的注解）的时候的注册方法
        // registry.addInterceptor(new FirstInterceptor());

        //第二种方法就不需要new一个拦截器对象了。
        registry.addInterceptor(firstInterceptor)
                .order(Ordered.HIGHEST_PRECEDENCE)
                .excludePathPatterns("/login")
                .excludePathPatterns("/static/**");


    }*/

   /* @Bean
    public WebMvcRegistrations mvcRegistrations(){
        return new WebMvcRegistrations() {
            @Override
            public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
                return WebMvcRegistrations.super.getRequestMappingHandlerMapping();
            }

            @Override
            public RequestMappingHandlerAdapter getRequestMappingHandlerAdapter() {
                return WebMvcRegistrations.super.getRequestMappingHandlerAdapter();
            }

            @Override
            public ExceptionHandlerExceptionResolver getExceptionHandlerExceptionResolver() {
                return WebMvcRegistrations.super.getExceptionHandlerExceptionResolver();
            }
        };
    }*/

}
