package com.SpringSecurity.StateFull_StateLess.webLayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.DefaultSecurityFilterChain;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
@EnableWebSecurity
public class Configurationclass {
      
	@Bean
	public DefaultSecurityFilterChain getchain(HttpSecurity security) throws Exception {
//		security.csrf(Customizer->Customizer.disable())
//		.authorizeHttpRequests(request->request.anyRequest().authenticated())
//	.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		security.csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(authz -> authz
            .anyRequest().authenticated())
        .sessionManagement(session -> session
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    
		
		 
		return security.build();
	}
}
