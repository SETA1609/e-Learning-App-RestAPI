package dev.seta.eapi.domain.users;

import dev.seta.eapi.domain.course.Course;
import dev.seta.eapi.domain.modul.ModulE;
import dev.seta.eapi.domain.msg.Msg;
import dev.seta.eapi.domain.ticket.Ticket;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    private List<ModulE> modulES;

    @OneToMany(mappedBy = "teacher")
    private List<Ticket> sentTickets;

    @OneToMany(mappedBy = "teacher")
    private List<Msg> receivedMessages;

}
