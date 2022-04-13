package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.RoomAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomAvailabilityRep extends JpaRepository<RoomAvailability, Long> {
}
