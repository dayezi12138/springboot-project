package com.zh.springweb.springweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Test {

    @Bean
    public String tst() {
        return "111";
    }

}
