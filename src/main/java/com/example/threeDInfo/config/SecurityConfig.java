package com.example.threeDInfo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;




@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Отключаем CSRF для упрощения
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/posts/**").permitAll() // Разрешить доступ ко всем на стартовую страницу и страницы статей
                        .anyRequest().authenticated() // Остальные страницы доступны только авторизованным пользователям
                )
                .formLogin(form -> form
                        .loginPage("/login") // URL страницы логина
                        .permitAll()
                )
                .logout(logout -> logout
                        .permitAll()
                );

        return http.build();
    }
}
