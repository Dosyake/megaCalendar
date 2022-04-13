package kg.megacom.megaCalendar.models.dto;

import kg.megacom.megaCalendar.models.Room;
import lombok.Data;
import java.util.Date;

@Data
public class RoomAvailabilityDto {

    private Long id;
    private Date roomDate;
    private Date availableFrom;
    private Date availableTo;
    private Room room;

}
