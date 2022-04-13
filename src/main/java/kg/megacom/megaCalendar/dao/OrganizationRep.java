package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRep extends JpaRepository<Organization, Long> {
}
