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

    private String text;

    @OneToOne
    private Teacher teacher;

    @OneToOne
    private Student student;

    private LocalDateTime dateCreated;

}
