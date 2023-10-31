package dev.seta.eapi.domains.users.admin;

import dev.seta.eapi.domains.ticket.Ticket;
import dev.seta.eapi.domains.users.MyUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@DiscriminatorValue("ADMIN")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Admin extends MyUser {

    @OneToMany(mappedBy = "admin")
    private List<Ticket> receivedTickets;

}
