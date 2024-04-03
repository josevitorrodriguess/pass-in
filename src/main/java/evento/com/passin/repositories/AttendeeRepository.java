package evento.com.passin.repositories;

import evento.com.passin.domain.attendee.Attendee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
   List<Attendee> findByEventId(String eventId);
}