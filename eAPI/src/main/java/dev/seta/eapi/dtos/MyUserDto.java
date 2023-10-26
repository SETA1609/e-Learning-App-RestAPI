package dev.seta.eapi.dtos;

import dev.seta.eapi.domain.users.Role;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.domain.users.MyUser}
 */
public record MyUserDto(
        String username,
        byte[] image,
        Role role
) implements Serializable {
}