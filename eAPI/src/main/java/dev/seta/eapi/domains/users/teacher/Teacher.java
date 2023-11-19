package dev.seta.eapi.domains.users.teacher;

import dev.seta.eapi.domains.course.Course;
import dev.seta.eapi.domains.myModule.MyModule;
import dev.seta.eapi.domains.msg.Msg;
import dev.seta.eapi.domains.ticket.Ticket;
import dev.seta.eapi.domains.users.MyUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@DiscriminatorValue("TEACHER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(builderMethodName = "teacherBuilder")
public class Teacher extends MyUser {

    @OneToMany(mappedBy = "teacher")
    private Set<Course> courses;

    @OneToMany(mappedBy = "teacher")
    private Set<MyModule> myModules;

    @OneToMany(mappedBy = "teacher")
    private Set<Msg> receivedMsg;

    @OneToMany(mappedBy = "teacher")
    private Set<Ticket> sentTicket;


}
