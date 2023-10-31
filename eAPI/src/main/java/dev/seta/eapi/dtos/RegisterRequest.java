package dev.seta.eapi.dtos;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.domains.users.MyUser}
 */
public record RegisterRequest(
        String username,
        String email,
        String password
) implements Serializable {
}