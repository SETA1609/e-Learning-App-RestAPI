package dev.seta.eapi.dao.ticket;

import dev.seta.eapi.dao.ticket.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, String> {
}