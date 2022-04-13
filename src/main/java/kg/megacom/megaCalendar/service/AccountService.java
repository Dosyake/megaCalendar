package kg.megacom.megaCalendar.service;

import kg.megacom.megaCalendar.models.dto.AccountDto;

public interface AccountService {

    AccountDto save(AccountDto accountDto);

    AccountDto findById(Long id);

}
