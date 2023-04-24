package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.ticket.Entity.Ticket;

@Repository


public interface TIcketRepository extends JpaRepository<Ticket,Long>{
	
}
