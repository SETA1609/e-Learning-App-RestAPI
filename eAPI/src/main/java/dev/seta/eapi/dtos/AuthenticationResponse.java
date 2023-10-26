package dev.seta.eapi.dtos;

import dev.seta.eapi.domain.users.Role;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.domain.users.MyUser}
 */
public record AuthenticationResponse(
        String email,
        Role role,
        String token
) implements Serializable {
}