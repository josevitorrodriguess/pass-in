package evento.com.passin.repositories;

import evento.com.passin.domain.attendee.Attendee;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
   List<Attendee> findByEventId(String eventId);


   Optional<Attendee> findByEventIdAndEmail(String eventID, String email);
}
