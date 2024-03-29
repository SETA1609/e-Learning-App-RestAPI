package dev.seta.eapi.dtos;

import dev.seta.eapi.domains.ticket.TicketPriority;
import dev.seta.eapi.domains.ticket.TicketStatus;
import dev.seta.eapi.domains.ticket.TicketType;
import dev.seta.eapi.domains.users.admin.Admin;
import dev.seta.eapi.domains.users.teacher.Teacher;
import lombok.NonNull;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link dev.seta.eapi.domains.ticket.Ticket}
 */
public record NewTicketRequest(
        @NonNull
        String content,
        @NonNull
        Teacher teacher,
        @NonNull
        TicketType ticketType,
        @NonNull
        TicketPriority ticketPriority
) implements Serializable {
}