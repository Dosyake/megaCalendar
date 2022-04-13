package kg.megacom.megaCalendar.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
