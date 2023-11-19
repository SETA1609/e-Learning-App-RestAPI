package dev.seta.eapi.services.authService;

import dev.seta.eapi.domains.token.Token;
import dev.seta.eapi.domains.token.TokenRepository;
import dev.seta.eapi.domains.token.TokenType;
import dev.seta.eapi.domains.users.MyUser;
import dev.seta.eapi.domains.users.MyUserRepository;
import dev.seta.eapi.domains.users.Role;
import dev.seta.eapi.dtos.AuthenticationRequest;
import dev.seta.eapi.dtos.AuthenticationResponse;
import dev.seta.eapi.dtos.RegisterRequest;
import dev.seta.eapi.exeptions.UserAlreadyExistsException;
import dev.seta.eapi.exeptions.UserDoesntExistException;
import dev.seta.eapi.services.jwtService.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {


}