package dev.seta.eapi.dtos;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.domains.users.MyUser}
 */
public record FileUploadRequest(
        String image
) implements Serializable {
}