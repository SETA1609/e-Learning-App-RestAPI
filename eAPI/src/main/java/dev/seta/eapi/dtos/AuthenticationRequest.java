package dev.seta.eapi.dtos;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.dao.users.MyUser}
 */
public record AuthenticationRequest(
        String email,
        String password
) implements Serializable {
}