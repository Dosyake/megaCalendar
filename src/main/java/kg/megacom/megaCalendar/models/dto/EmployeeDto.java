package kg.megacom.megaCalendar.models.dto;

import kg.megacom.megaCalendar.models.Account;
import lombok.Data;

@Data
public class EmployeeDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String msisdn;
    private String Status;
    private Boolean isActive;
    private Account account;
}
