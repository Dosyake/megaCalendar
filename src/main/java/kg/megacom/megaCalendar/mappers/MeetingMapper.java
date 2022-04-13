package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.Meeting;
import kg.megacom.megaCalendar.models.dto.MeetingDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MeetingMapper extends MainMapper<Meeting, MeetingDto> {
    MeetingMapper INSTANCE = Mappers.getMapper(MeetingMapper.class);
}
