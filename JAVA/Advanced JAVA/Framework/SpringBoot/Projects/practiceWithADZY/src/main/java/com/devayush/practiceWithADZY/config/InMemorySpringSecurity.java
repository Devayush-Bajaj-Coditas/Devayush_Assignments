package com.devayush.practiceWithADZY.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class InMemorySpringSecurity {

    @Bean
    public UserDetailsService userDetailsService (){
        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
        UserDetails userDetails = User.withUsername("admin")
                .password("12345")
                .authorities("read")
                .build();

        userDetailsManager.createUser(userDetails);
        return userDetailsManager;
    }


    @Bean
    public PasswordEncoder passwordEncoder(){       //Disabling default password encoder of Spring security
        return NoOpPasswordEncoder.getInstance();
    }
}
