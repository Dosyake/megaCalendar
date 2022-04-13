package kg.megacom.megaCalendar.models.dto;

import kg.megacom.megaCalendar.models.Room;
import lombok.Data;
import java.util.Date;

@Data
public class MeetingDto {

    private Long id;
    private String meetingTopic;
    private String description;
    private Date meetingDate;
    private Date meetingStartTime;
    private Date meetingEndTime;
    private Date createdDate;
    private Room room;
}
