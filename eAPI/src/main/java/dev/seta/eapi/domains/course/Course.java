package dev.seta.eapi.domains.course;

import dev.seta.eapi.domains.description.Description;
import dev.seta.eapi.domains.myModule.MyModule;
import dev.seta.eapi.domains.users.teacher.Teacher;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToMany(mappedBy = "course")
    private List<MyModule> myModules;

    @OneToMany(mappedBy = "course")
    private List<Description> description;

}
