package com.company.config;

import com.company.dao.H2;
import com.company.dao.H2Dao;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({H2.class})
public class Config {
    @Bean
    public H2Dao h2Dao(){
        return new H2Dao();
    }
}
