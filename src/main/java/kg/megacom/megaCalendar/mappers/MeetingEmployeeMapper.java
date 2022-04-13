package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.MeetingEmployee;
import kg.megacom.megaCalendar.models.dto.MeetingEmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MeetingEmployeeMapper extends MainMapper<MeetingEmployee, MeetingEmployeeDto> {
    MeetingEmployeeMapper INSTANCE = Mappers.getMapper(MeetingEmployeeMapper.class);
}
