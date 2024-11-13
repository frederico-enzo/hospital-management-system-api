package com.hospital.management_system.service;


import com.hospital.management_system.dto.LoginDto;
import com.hospital.management_system.dto.UserDto;
import com.hospital.management_system.model.Usuario;
import com.hospital.management_system.repository.LoginRepository;
import com.hospital.management_system.security.JwtServiceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private LoginRepository repository;
    @Autowired
    private JwtServiceGenerator jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserDto logar(LoginDto loginDTO) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginDTO.getUsername(),
                            loginDTO.getPassword()
                    )
            );
            Usuario user = repository.findByUsername(loginDTO.getUsername())
                    .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));

            String jwtToken = jwtService.generateToken(user);
            return toUserDTO(user, jwtToken);

        } catch (AuthenticationException e) {
            throw new IllegalArgumentException("Credenciais inválidas");
        }
    }

    public UserDto registrar(UserDto userDto) {
        // Verificar se o username já está em uso
        Optional<Usuario> existingUser = repository.findByUsername(userDto.getUsername());
        if (existingUser.isPresent()) {
            throw new IllegalArgumentException("Nome de usuário já está em uso");
        }

        // Criar novo usuário
        Usuario user = new Usuario();
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword())); // Criptografando a senha
        user.setRole(userDto.getRole());

        Usuario savedUser = repository.save(user);

        // Gerar token JWT para o usuário recém-registrado
        String jwtToken = jwtService.generateToken(savedUser);

        // Retornar o UserDto sem a senha
        return toUserDTO(savedUser, jwtToken);
    }

    private UserDto toUserDTO(Usuario user, String token) {
        UserDto userDTO = new UserDto();
        userDTO.setId(user.getId());
        userDTO.setRole(user.getRole());
        userDTO.setToken(token);
        userDTO.setUsername(user.getUsername());
        return userDTO;
    }
}