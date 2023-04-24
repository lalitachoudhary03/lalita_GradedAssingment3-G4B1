package com.greatlearning.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.ticket.Entity.Ticket;
import com.greatlearning.ticket.Repository.TicketRepository;
import com.greatlearning.ticket.Service.CreateTicketService;

@Service
public class CreateTicketServicesImpl implements CreateTicketService {
	@Autowired
	TicketRepository repository;

	@Override
	public Ticket createTicket(Ticket ticket) {
		return repository.saveAndFlush(ticket);
	}

	@Override
	public void saveTicket(Ticket ticket) {
		repository.save(ticket);
	}
}
