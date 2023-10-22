package dev.seta.eapi.domain.modul;

import dev.seta.eapi.domain.kurz.Course;
import dev.seta.eapi.domain.noten.Grade;
import dev.seta.eapi.domain.users.Teacher;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private String description;

    @ManyToMany
    private Set<Teacher> teacherSet;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "module")
    private List<Grade> grades;
}
