package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRep extends JpaRepository<Room, Long> {
}
