package com.kotlsov.production.planner.config;

import com.kotlsov.production.planner.ApiUrl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    private static final String WILDCARD = "/**";
    private static final String[] WHITE_LIST = {
        "/swagger-ui/**",
        "/v3/api-docs/**",
        "/actuator/**"
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        http
            .httpBasic().disable()
            .csrf().disable()
            .cors()
            .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
                .authorizeRequests()
                    .antMatchers(WHITE_LIST).permitAll()
                    .antMatchers(ApiUrl.Public.BASE + WILDCARD).permitAll()
                .anyRequest().authenticated();
        // @formatter:on
        return http.build();
    }
}
