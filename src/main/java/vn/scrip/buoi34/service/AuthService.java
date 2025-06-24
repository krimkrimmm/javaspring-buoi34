package vn.scrip.buoi34.service;
import vn.scrip.buoi34.dto.RegisterRequest;
import vn.scrip.buoi34.entity.Role;
import vn.scrip.buoi34.entity.User;
import vn.scrip.buoi34.repository.RoleRepository;
import vn.scrip.buoi34.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public String register(RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            return "Email already exists";
        }

        Role userRole = roleRepository.findByName("USER")
                .orElseThrow(() -> new RuntimeException("Default role USER not found"));

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setIsEnabled(false); // Chưa active
        user.setRoles(Collections.singleton(userRole));
        userRepository.save(user);
        return "User registered successfully. Please verify your email.";
    }
}
