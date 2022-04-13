package kg.megacom.megaCalendar.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "weekdays")
public class Weekday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String weekdays;
}
