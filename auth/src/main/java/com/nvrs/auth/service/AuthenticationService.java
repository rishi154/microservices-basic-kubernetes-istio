package com.nvrs.auth.service;

import com.nvrs.auth.mapper.UserMapper;
import com.nvrs.auth.model.LoginUserDto;
import com.nvrs.auth.model.RegisterUserDto;
import com.nvrs.auth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private final UserMapper userMapper;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
            UserMapper userMapper,
            AuthenticationManager authenticationManager,
            PasswordEncoder passwordEncoder
    ) {
        this.authenticationManager = authenticationManager;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public User signup(RegisterUserDto input) {
       User user = new User();
       user.setFullName(input.getFullName());
       user.setEmail(input.getEmail());
       user.setPassword(passwordEncoder.encode(input.getPassword()));

       userMapper.save(user);

       return user;

    }

    public User authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );

        return userMapper.findByEmail(input.getEmail());
    }
}