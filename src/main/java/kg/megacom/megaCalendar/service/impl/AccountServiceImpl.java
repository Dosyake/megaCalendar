package kg.megacom.megaCalendar.service.impl;

import kg.megacom.megaCalendar.dao.AccountRep;
import kg.megacom.megaCalendar.mappers.AccountMapper;
import kg.megacom.megaCalendar.models.dto.AccountDto;
import kg.megacom.megaCalendar.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRep accountRep;

    @Override
    public AccountDto save(AccountDto accountDto) {
        return AccountMapper.MAPPER.toDto(accountRep.save(AccountMapper.MAPPER.toEntity(accountDto)));
    }

    @Override
    public AccountDto findById(Long id) {
        return AccountMapper.MAPPER.toDto(accountRep.findById(id).orElse(null));
    }
}
