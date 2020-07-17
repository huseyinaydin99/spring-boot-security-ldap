package com.huseyinaydin.springsecurityldap.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;

@Configuration
public class Beans {
    @Bean(name = "passwordEncoder")
    public LdapShaPasswordEncoder getLdapShaPasswordEncoder(){
        return new LdapShaPasswordEncoder();
    }
}
