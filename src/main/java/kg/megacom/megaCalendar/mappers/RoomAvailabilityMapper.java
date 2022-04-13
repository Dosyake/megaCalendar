package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.RoomAvailability;
import kg.megacom.megaCalendar.models.dto.RoomAvailabilityDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomAvailabilityMapper extends MainMapper<RoomAvailability, RoomAvailabilityDto>{
    RoomAvailabilityMapper INSTANCE = Mappers.getMapper(RoomAvailabilityMapper.class);
}
