package kg.megacom.megaCalendar.models.dto;

import kg.megacom.megaCalendar.models.Organization;
import lombok.Data;

@Data
public class OrganizationDto {

    private Long id;
    private String title;
    private Organization organization;
}
