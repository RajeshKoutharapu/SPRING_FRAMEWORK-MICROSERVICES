package com.SpringSecority.Encryptingpassward.SecurityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@Configuration
@EnableWebSecurity
public class SecorityConfiguration {

	@Autowired
	private UserDetailsService service;
	
	@Bean
	public SecurityFilterChain securityfil(HttpSecurity http) throws Exception {
		
		http.csrf(Customizer->Customizer.disable())
		   .authorizeHttpRequests(request->request
				   .requestMatchers("/register").permitAll()
				   .anyRequest().authenticated())
					//http.formLogin(Customizer.withDefaults())
					.httpBasic(Customizer.withDefaults())
					.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
				          return http.build();
		
		
		         //return http.build();
	}
	@Bean
	public AuthenticationProvider authprov() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(service);
	    provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
	    return provider;
	}
}
