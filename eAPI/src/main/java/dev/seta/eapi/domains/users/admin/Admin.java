package dev.seta.eapi.domains.users.admin;

import dev.seta.eapi.domains.ticket.Ticket;
import dev.seta.eapi.domains.users.MyUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@DiscriminatorValue("ADMIN")
@Getter
@Setter
@Builder(builderMethodName = "adminBuilder")
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends MyUser {

    @OneToMany(mappedBy ="admin")
    private Set<Ticket> receivedTicket;

}
