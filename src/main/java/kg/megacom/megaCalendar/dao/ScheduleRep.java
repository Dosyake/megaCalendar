package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRep extends JpaRepository<Schedule, Long> {
}
