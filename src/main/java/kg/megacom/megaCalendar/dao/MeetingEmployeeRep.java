package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.MeetingEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingEmployeeRep extends JpaRepository<MeetingEmployee, Long> {
}
