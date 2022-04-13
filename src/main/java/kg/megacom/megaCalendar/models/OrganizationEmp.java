package kg.megacom.megaCalendar.models;


import javafx.beans.value.WritableValue;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "organizatioin_emps")
public class OrganizationEmp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

}
