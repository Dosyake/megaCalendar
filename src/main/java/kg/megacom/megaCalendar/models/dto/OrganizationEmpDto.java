package kg.megacom.megaCalendar.models.dto;

import kg.megacom.megaCalendar.models.Employee;
import kg.megacom.megaCalendar.models.Organization;
import lombok.Data;

@Data
public class OrganizationEmpDto {
    private Long id;
    private Employee employee;
    private Organization organization;
}
