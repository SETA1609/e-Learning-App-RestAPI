package dev.seta.eapi.domain.users;

import dev.seta.eapi.domain.kurz.Course;
import dev.seta.eapi.domain.modul.Module;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@DiscriminatorValue("TEACHER")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher extends MyUser{

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

    @ManyToMany
    private Set<Module> modules;



}
