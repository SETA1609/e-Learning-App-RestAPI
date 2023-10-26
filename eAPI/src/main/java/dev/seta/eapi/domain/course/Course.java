package dev.seta.eapi.domain.course;

import dev.seta.eapi.domain.modul.ModulE;
import dev.seta.eapi.domain.users.Teacher;
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

    private String description;



    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToMany(mappedBy = "course")
    private List<ModulE> modulES;


}
