package br.com.mappy.mappyapi.security;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import br.com.mappy.mappyapi.security.service.NossaUserDetailService;

@Configuration
@EnableWebSecurity

public class WebSecurityConfig {

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
                http.csrf().disable()
                                .requiresChannel(
                                channel -> channel.anyRequest().requiresSecure())
                                .authorizeHttpRequests(
                                                authorize -> authorize
                                                                .requestMatchers(HttpMethod.POST, "/criarUsuario")
                                                                .permitAll()
                                                                .requestMatchers(HttpMethod.GET, "/livreAcesso")
                                                                .permitAll())
                                .authorizeHttpRequests(
                                                authorize -> authorize.requestMatchers(HttpMethod.GET,
                                                                "/dados").authenticated())
                                .httpBasic(Customizer.withDefaults());
                return http.build();
        }

        @Bean
        public UserDetailsService nossaUserDetailsService() {
                return new NossaUserDetailService();
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
                return new BCryptPasswordEncoder();
        }
}
