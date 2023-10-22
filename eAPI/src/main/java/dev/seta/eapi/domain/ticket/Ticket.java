package dev.seta.eapi.domain.ticket;

import dev.seta.eapi.domain.users.Admin;
import dev.seta.eapi.domain.users.Teacher;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

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

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Admin admin;

    private Date date;

}
