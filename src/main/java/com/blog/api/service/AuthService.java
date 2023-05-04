package com.blog.api.service;

import com.blog.api.payload.LoginDto;
import com.blog.api.payload.RegisterDto;

public interface AuthService {
    String login (LoginDto loginDto);
    String register(RegisterDto registerDto);
}
