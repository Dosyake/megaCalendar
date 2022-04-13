package kg.megacom.megaCalendar.dao;

import kg.megacom.megaCalendar.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRep extends JpaRepository<Account, Long> {
}
