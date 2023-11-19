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
@Table
public class Msg {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "msgId")
    private String id;

    @Version
    private int version;

    private String Content;


    @ManyToOne
    @JoinColumn(name = "student_my_user_id")
    private Student student;


    @ManyToOne
    @JoinColumn(name = "teacher_my_user_id")
    private Teacher teacher;

    private LocalDateTime dateCreated;

}
