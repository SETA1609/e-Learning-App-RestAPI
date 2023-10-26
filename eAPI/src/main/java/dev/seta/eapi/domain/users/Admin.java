package dev.seta.eapi.domain.users;

import dev.seta.eapi.domain.msg.Msg;
import dev.seta.eapi.domain.ticket.Ticket;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@Entity
@DiscriminatorValue("ADMIN")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Admin extends MyUser{

    @OneToMany(mappedBy = "admin")
    private List<Ticket> receivedTickets;

}
