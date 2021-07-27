package cn.withyyy.handtohand.config;

import cn.withyyy.handtohand.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    /**
     * 拦截器，拦截所有资源，
     * 特赦了：
     *  1.所有静态资源，
     *  2./login
     *  3./register
     *  4./test
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/css/**","/js/**","/img/**","/fonts/**","favicon.ico","/","/login","/register","/street","/test");
    }
}
