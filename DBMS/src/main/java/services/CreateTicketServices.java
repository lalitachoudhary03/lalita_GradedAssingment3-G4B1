package services;

import co.greatlearning.ticket.entity.Ticket;

public interface CreateTicketServices {
	
	Ticket createTicket(Ticket ticket);

	void saveTicket(Ticket ticket);

}
