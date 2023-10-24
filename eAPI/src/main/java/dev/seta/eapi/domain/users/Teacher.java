package dev.seta.eapi.domain.users;

import dev.seta.eapi.domain.course.Course;
import dev.seta.eapi.domain.modul.Module;
import dev.seta.eapi.domain.msg.Msg;
import dev.seta.eapi.domain.ticket.Ticket;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@DiscriminatorValue("TEACHER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher extends MyUser{

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

    @OneToMany(mappedBy = "teacher")
    private List<Module> modules;

    @OneToOne
    private Ticket ticket;

    @OneToOne
    private Msg msg;

}
