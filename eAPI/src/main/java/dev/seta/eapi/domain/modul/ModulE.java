package dev.seta.eapi.domain.modul;

import dev.seta.eapi.domain.course.Course;
import dev.seta.eapi.domain.grade.Grade;
import dev.seta.eapi.domain.users.Teacher;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class ModulE {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "teacher_d")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToOne(mappedBy = "module")
    private Grade grade;


}
