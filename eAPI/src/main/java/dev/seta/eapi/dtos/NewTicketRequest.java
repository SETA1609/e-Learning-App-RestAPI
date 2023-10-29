package dev.seta.eapi.dtos;

import dev.seta.eapi.dao.users.admin.Admin;
import dev.seta.eapi.dao.users.teacher.Teacher;
import lombok.NonNull;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.dao.ticket.Ticket}
 */
public record NewTicketRequest(
        @NonNull
        String content,
        @NonNull
        Admin admin,
        @NonNull
        Teacher teacher
) implements Serializable {
}