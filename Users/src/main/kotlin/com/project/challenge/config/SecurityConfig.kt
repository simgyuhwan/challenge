package com.project.challenge.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun defaultSecurityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests {
                authorizeHttpRequests ->
                    authorizeHttpRequests.requestMatchers("/**").permitAll()
            }
            .csrf {
                csrf -> csrf.disable()
            }
            .formLogin(Customizer.withDefaults())
        return http.build()
    }
}