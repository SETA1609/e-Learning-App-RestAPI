package dev.seta.eapi.dtos;

import dev.seta.eapi.domains.ticket.TicketPriority;
import dev.seta.eapi.domains.ticket.TicketStatus;
import dev.seta.eapi.domains.ticket.TicketType;
import dev.seta.eapi.domains.users.admin.Admin;
import dev.seta.eapi.domains.users.teacher.Teacher;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link dev.seta.eapi.domains.ticket.Ticket}
 */
public record TicketRequest(
        TicketPriority ticketPriority,
        TicketStatus ticketStatus,
        TicketType ticketType,
        String content,
        Admin admin,
        Teacher teacher,
        LocalDateTime dateCreated
) implements Serializable {
}