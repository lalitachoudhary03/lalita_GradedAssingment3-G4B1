package services;

import java.util.List;

import co.greatlearning.ticket.entity.Ticket;

public interface GetTicketDetailService {
	
	List<Ticket> getTicketDetails();

	Ticket getTicketById(long id);

	Ticket getTicketByTitle(String title);
	

}
