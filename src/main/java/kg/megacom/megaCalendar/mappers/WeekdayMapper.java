package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.Weekday;
import kg.megacom.megaCalendar.models.dto.WeekdayDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WeekdayMapper extends MainMapper<Weekday, WeekdayDto>{
    WeekdayMapper INSTANCE = Mappers.getMapper(WeekdayMapper.class);
}
