package com.devayush.ToolManagementSystem.config;

import com.devayush.ToolManagementSystem.entity.UserEntity;
import com.devayush.ToolManagementSystem.model.CustomerUserDetailsModel;
import com.devayush.ToolManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByName(username);
        System.out.println(user.getUsername()+"   "+user.getPassword()+"  "+user.getRole());
        if(user==null)
            throw  new UsernameNotFoundException("User Not Found");

        return new CustomerUserDetailsModel(user);

    }

}
