package kg.megacom.megaCalendar.models.dto;

import kg.megacom.megaCalendar.models.Room;
import lombok.Data;

@Data
public class RoomDto {

    private Long id;
    private String roomNumber;
    private int roomCapacity;
    private Room room;
}
