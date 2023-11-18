package dev.seta.eapi.security;

import dev.seta.eapi.domains.users.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {


    private final JwtAuthenticationFilter jwtAuthFilter;

    private final AuthenticationProvider authenticationProvider;

    private final LogoutHandler logoutHandler;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // .cors (Customizer.withDefaults ())
                .csrf ()
                .disable ()
                .authorizeHttpRequests ()
                .requestMatchers (
                        "/",
                        "/api/v1/auth/**"

                )
                .permitAll ()
                .requestMatchers (
                        "/api/comment"
                )
                .hasAnyAuthority (Role.STUDENT.name (),Role.ADMIN.name (),Role.TEACHER.name ())
                .requestMatchers (
                        "/api/users/{username}/listOfUsers/**")
                .hasAuthority (Role.ADMIN.name ())
                .anyRequest ()
                .authenticated ()
                .and ()
                .sessionManagement ()
                .sessionCreationPolicy (SessionCreationPolicy.STATELESS)
                .and ()
                .authenticationProvider (authenticationProvider)
                .addFilterBefore (jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
                .logout ()
                .logoutUrl ("/api/v1/auth/logout")
                .addLogoutHandler (logoutHandler)
                .logoutSuccessHandler (
                        (request, response, authentication) ->
                                SecurityContextHolder.clearContext ()
                )
        ;

        return http.build ();
    }

    //TODO hier kann man eine beliebte endpoint in Frontend eingeben

    /*
      @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration configuration = new CorsConfiguration();

        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200/"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS","PATCH"));
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);

        return source;
    }
    * */




}