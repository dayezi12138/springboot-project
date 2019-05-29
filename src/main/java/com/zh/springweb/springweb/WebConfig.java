package com.zh.springweb.springweb;


import com.zh.springweb.springweb.component.LoginHandlerIntercetor;
import com.zh.springweb.springweb.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("main");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(new LoginHandlerIntercetor());
        // 排除配置
        addInterceptor.excludePathPatterns("/");
        addInterceptor.excludePathPatterns("/css/**");//排除静态资源
        addInterceptor.excludePathPatterns("/img/**");//排除静态资源
        addInterceptor.excludePathPatterns("/jquery-easing/**");//排除静态资源
        addInterceptor.excludePathPatterns("/js/**");//排除静态资源
        addInterceptor.excludePathPatterns("/scss/**");//排除静态资源
        addInterceptor.excludePathPatterns("/vendor/**");//排除静态资源
        addInterceptor.excludePathPatterns("/webjars/**");//排除静态资源
        addInterceptor.excludePathPatterns("/index.html");
        addInterceptor.excludePathPatterns("/login");

        // 拦截配置
        addInterceptor.addPathPatterns("/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Bean
    public LocaleResolver localeResolver() {
        LocaleResolver resolver = new MyLocalResolver();
        return resolver;
    }
}
