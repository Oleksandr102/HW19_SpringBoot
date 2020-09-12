package com.company.config;

import com.company.dao.H2Dao;
import com.company.dao.H2DaoImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({H2Dao.class})
public class Config {
    @Bean
    public H2DaoImpl h2Dao(){
        return new H2DaoImpl();
    }
}
