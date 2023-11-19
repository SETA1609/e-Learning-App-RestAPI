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
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ticketId")
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
    @JoinColumn(name = "adminId")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "teacherId")
    private Teacher teacher;

    private LocalDateTime dateCreated;

}
