package kg.megacom.megaCalendar.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String msisdn;
//    private String Status;
    private Boolean isActive;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
