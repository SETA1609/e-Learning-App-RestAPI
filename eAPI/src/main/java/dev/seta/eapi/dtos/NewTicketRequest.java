package dev.seta.eapi.dtos;

import dev.seta.eapi.domain.users.Admin;
import dev.seta.eapi.domain.users.Teacher;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.domain.ticket.Ticket}
 */
public record NewTicketRequest(
        String content,
        Admin admin,
        Teacher teacher
) implements Serializable {
}