package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.Account;
import kg.megacom.megaCalendar.models.dto.AccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper extends MainMapper<Account, AccountDto> {
    AccountMapper MAPPER = Mappers.getMapper(AccountMapper.class);
}
