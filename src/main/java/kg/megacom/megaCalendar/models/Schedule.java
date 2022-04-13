package kg.megacom.megaCalendar.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date startTime;
    private Date endTime;

    @OneToOne
    @JoinColumn(name = "organization_emps_id")
    private OrganizationEmp organizationEmp;

    @ManyToOne
    @JoinColumn(name = "weekday_id")
    private Weekday weekdays;
}
