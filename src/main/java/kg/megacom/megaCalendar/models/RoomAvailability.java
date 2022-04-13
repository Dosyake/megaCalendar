package kg.megacom.megaCalendar.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "room_availability")
public class RoomAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date roomDate;
    private Date availableFrom;
    private Date availableTo;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

}
