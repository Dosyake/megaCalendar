package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.Weekday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekdayRep extends JpaRepository<Weekday, Long> {
}
