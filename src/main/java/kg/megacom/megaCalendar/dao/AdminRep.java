package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRep extends JpaRepository<Admin, Long> {
}
