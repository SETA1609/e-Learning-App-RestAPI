package dev.seta.eapi.domains.myModule;

import dev.seta.eapi.domains.description.Description;
import dev.seta.eapi.domains.course.Course;
import dev.seta.eapi.domains.grade.Grade;
import dev.seta.eapi.domains.users.teacher.Teacher;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class MyModule {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToOne
    private Grade grade;

    @OneToMany(mappedBy = "myModule")
    private List<Description> description;
}
