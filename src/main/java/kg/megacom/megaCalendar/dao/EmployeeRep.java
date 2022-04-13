package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRep extends JpaRepository<Employee, Long> {
}
