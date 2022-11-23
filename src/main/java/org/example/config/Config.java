package org.example.config;

import org.example.warehouse.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope("prototype")
    public Worker Mishka() {
        return new Worker() {
            @Override
            public void isTired() {

            }

            @Override
            public void addProduct() {

            }
        };
    }
    @Bean
    @Scope("prototype")
    public Worker Zelya() {
        return new Worker() {
            @Override
            public void isTired() {

            }

            @Override
            public void addProduct() {

            }
        };
    }

}
