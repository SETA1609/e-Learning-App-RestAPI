package dev.seta.eapi.dtos;

import dev.seta.eapi.dao.users.Role;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.dao.users.MyUser}
 */
public record AuthenticationResponse(
        String email,
        Role role,
        String token
) implements Serializable {
}