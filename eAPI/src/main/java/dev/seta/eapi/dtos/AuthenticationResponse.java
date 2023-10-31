package dev.seta.eapi.dtos;

import dev.seta.eapi.domains.users.Role;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.domains.users.MyUser}
 */
public record AuthenticationResponse(
        String email,
        Role role,
        String token
) implements Serializable {
}