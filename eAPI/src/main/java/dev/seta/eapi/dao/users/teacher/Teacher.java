package dev.seta.eapi.dao.users.teacher;

import dev.seta.eapi.dao.course.Course;
import dev.seta.eapi.dao.myModule.MyModule;
import dev.seta.eapi.dao.msg.Msg;
import dev.seta.eapi.dao.ticket.Ticket;
import dev.seta.eapi.dao.users.MyUser;
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
