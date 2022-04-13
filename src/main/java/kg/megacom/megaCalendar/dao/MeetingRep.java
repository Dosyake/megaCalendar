package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRep extends JpaRepository<Meeting, Long> {
}
