package kg.megacom.megaCalendar.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_meeting_employee")
public class MeetingEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  status;
    private String memberType;

    @ManyToOne
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
