package dev.seta.eapi.domain.msg;

import dev.seta.eapi.domain.users.Student;
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
public class Msg {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String Content;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private LocalDateTime dateCreated;

}
