package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.OrganizationEmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationEmpRep extends JpaRepository<OrganizationEmp, Long> {
}
