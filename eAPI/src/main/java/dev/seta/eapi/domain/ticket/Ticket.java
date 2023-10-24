package dev.seta.eapi.domain.ticket;

import dev.seta.eapi.domain.users.Admin;
import dev.seta.eapi.domain.users.Teacher;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
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

    private String text;

    @OneToOne
    private Teacher teacher;

    @OneToOne
    private Admin admin;

    private LocalDateTime dateCreated;

}
