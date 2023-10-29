package dev.seta.eapi.dao.ticket;

import dev.seta.eapi.dao.users.admin.Admin;
import dev.seta.eapi.dao.users.teacher.Teacher;
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

    private String content;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private LocalDateTime dateCreated;

}
