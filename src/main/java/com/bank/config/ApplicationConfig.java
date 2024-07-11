package com.bank.config;


import com.bank.Dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final UserDao userDao;
    @Bean
    public UserDetailsService userDetailsService() {
        return username -> userDao.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
    }
}
