package dev.seta.eapi.domains.msg;

import dev.seta.eapi.domains.users.student.Student;
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
