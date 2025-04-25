package io.duykhanh471.burogu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.duykhanh471.burogu.dto.request.UserDto;
import io.duykhanh471.burogu.entity.User;
import io.duykhanh471.burogu.repository.UserRepository;

@RestController
@RequestMapping("/")
public class AuthController {

    private AuthenticationManager authenticationManager;
    private PasswordEncoder passwordEncoder;
    private UserRepository userRepository;

    
    public AuthController(AuthenticationManager authenticationManager, PasswordEncoder passwordEncoder,
            UserRepository userRepository) {
        this.authenticationManager = authenticationManager;
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;

    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDto loginRequest){
        // TODO: Gotta fix it later
        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@RequestBody UserDto signupRequest){

        if(userRepository.existsByUsername(signupRequest.getUsername())){
            return new ResponseEntity<>("Email already used!", HttpStatus.BAD_REQUEST);
        }

        User user = new User();
        user.setUsername(signupRequest.getUsername());
        user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));
        user.setRole("user");
        userRepository.save(user);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }
}