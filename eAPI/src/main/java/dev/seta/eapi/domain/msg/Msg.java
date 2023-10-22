package dev.seta.eapi.domain.msg;

import dev.seta.eapi.domain.users.Student;
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
public class Msg {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String text;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Student student;

    private Date date;

}
