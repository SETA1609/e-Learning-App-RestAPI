package dev.seta.eapi.domains.users.teacher;

import dev.seta.eapi.domains.course.Course;
import dev.seta.eapi.domains.myModule.MyModule;
import dev.seta.eapi.domains.msg.Msg;
import dev.seta.eapi.domains.ticket.Ticket;
import dev.seta.eapi.domains.users.MyUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@DiscriminatorValue("TEACHER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher extends MyUser {

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

    @OneToMany(mappedBy = "teacher")
    private List<MyModule> myModules;

    @OneToMany(mappedBy = "teacher")
    private List<Ticket> sentTickets;

    @OneToMany(mappedBy = "teacher")
    private List<Msg> receivedMessages;

}
