package dev.seta.eapi.dtos;

import dev.seta.eapi.domains.users.Role;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.domains.users.MyUser}
 */
public record MyUserDTO(
        String username,
        String image,
        Role role
) implements Serializable {
}