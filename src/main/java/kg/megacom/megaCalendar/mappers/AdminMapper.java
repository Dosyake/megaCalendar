package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.Admin;
import kg.megacom.megaCalendar.models.dto.AdminDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdminMapper extends MainMapper<Admin, AdminDto>{
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);
}
