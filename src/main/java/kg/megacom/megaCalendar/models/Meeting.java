package kg.megacom.megaCalendar.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "tb_meeting")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String meetingTopic;
    private String description;
    private Date meetingDate;
    private Date meetingStartTime;
    private Date meetingEndTime;
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = true)
    private Room room;

}
