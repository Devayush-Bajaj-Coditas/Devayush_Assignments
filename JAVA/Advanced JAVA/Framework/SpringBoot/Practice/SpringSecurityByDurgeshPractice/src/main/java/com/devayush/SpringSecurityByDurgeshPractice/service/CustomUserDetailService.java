package com.devayush.SpringSecurityByDurgeshPractice.service;

import com.devayush.SpringSecurityByDurgeshPractice.entity.EmployeeEntity;
import com.devayush.SpringSecurityByDurgeshPractice.model.CustomUser;
import com.devayush.SpringSecurityByDurgeshPractice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private EmployeeRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        EmployeeEntity employee = repository.findByName(username).orElse(null);
         if(employee == null){
             throw new UsernameNotFoundException("NO USER");
         }
         return new CustomUser(employee);
    }
}
