package dev.seta.eapi.domains.ticket;

import dev.seta.eapi.domains.users.admin.Admin;
import dev.seta.eapi.domains.users.teacher.Teacher;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Version
    private int version;

    @NonNull
    private TicketPriority ticketPriority;

    @NonNull
    private TicketStatus ticketStatus;

    @NonNull
    private TicketType ticketType;

    private String content;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private LocalDateTime dateCreated;

}
