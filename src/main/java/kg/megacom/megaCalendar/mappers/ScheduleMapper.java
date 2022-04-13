package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.Schedule;
import kg.megacom.megaCalendar.models.dto.ScheduleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScheduleMapper extends MainMapper<Schedule, ScheduleDto>{
    ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);
}
