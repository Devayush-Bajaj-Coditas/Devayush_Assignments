package com.devayush.SpringSecurityByDurgeshPractice.config;

import com.devayush.SpringSecurityByDurgeshPractice.model.CustomUser;
import com.devayush.SpringSecurityByDurgeshPractice.service.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)              //this annotation will enable use of other security annotations from other layers as well (e.g. Controller '@PreAuth')
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()       //csrf is an attack which is byDefault enabled by the spring  security. this leads to restrict the access of API through non browser based apps like postman.
                .authorizeHttpRequests()        //Authorize the incoming request
                .antMatchers( "/home/**").hasRole("USER")
                .antMatchers("/employee/**").hasRole("ADMIN")
                .antMatchers("/signin").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/signin")
                .loginProcessingUrl("/dologin").defaultSuccessUrl("/employee/getAll").and().logout().permitAll();
                ;
//
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {              //user has been configured l
        /*auth.inMemoryAuthentication().withUser("dev").password(this.passwordEncoder().encode("   ")).roles("NORMAL");
        auth.inMemoryAuthentication().withUser("adzy").password(this.passwordEncoder().encode("12345")).roles("ADMIN");*/
        auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());

     }

     @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10);
    }
}
