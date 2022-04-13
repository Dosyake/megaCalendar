package kg.megacom.megaCalendar.models.dto;

import kg.megacom.megaCalendar.models.Employee;
import kg.megacom.megaCalendar.models.Meeting;
import lombok.Data;

@Data
public class MeetingEmployeeDto {

    private Long id;
    private String  status;
    private String memberType;
    private Meeting meeting;
    private Employee employee;
}
