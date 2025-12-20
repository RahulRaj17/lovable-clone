package com.codingshuttle.projects.lovable_clone.controller;

import com.codingshuttle.projects.lovable_clone.dto.auth.AuthResponse;
import com.codingshuttle.projects.lovable_clone.dto.auth.LoginRequest;
import com.codingshuttle.projects.lovable_clone.dto.auth.SignupRequest;
import com.codingshuttle.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.codingshuttle.projects.lovable_clone.service.AuthService;
import com.codingshuttle.projects.lovable_clone.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthController {

    AuthService authService;
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest signupRequest){
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }
}
