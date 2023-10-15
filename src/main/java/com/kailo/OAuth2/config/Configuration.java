package com.kailo.OAuth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@org.springframework.context.annotation.Configuration
@EnableWebSecurity

public class Configuration {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return  http
            .authorizeRequests(auth -> {
                auth.requestMatchers("/").permitAll();
                auth.anyRequest().authenticated();
    })
                .oauth2Login(withDefaults())
                .formLogin(withDefaults())
            .build();
    }
}
