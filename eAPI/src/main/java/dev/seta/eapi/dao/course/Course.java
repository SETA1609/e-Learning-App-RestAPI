package dev.seta.eapi.dao.course;

import dev.seta.eapi.dao.description.Description;
import dev.seta.eapi.dao.myModule.MyModule;
import dev.seta.eapi.dao.users.teacher.Teacher;
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
