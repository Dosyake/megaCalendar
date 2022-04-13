package kg.megacom.megaCalendar.models.dto;

import kg.megacom.megaCalendar.models.OrganizationEmp;
import kg.megacom.megaCalendar.models.Weekday;
import lombok.Data;
import java.util.Date;

@Data
public class ScheduleDto {

    private Long id;
    private Date startTime;
    private Date endTime;
    private OrganizationEmp organizationEmp;
    private Weekday weekdays;
}
