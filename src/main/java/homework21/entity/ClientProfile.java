package homework21.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "client_profile")
public class ClientProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "client_country_of_residence", unique = true, nullable = false)
    private String clientCountryOfResidence;

    @Column(name = "marriage_status", nullable = false)
    private String marriageStatus;

    @Column(name = "number_of_kids", nullable = false)
    private String numberOfKids;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Client client;

    @Override
    public String toString() {
        return "PersonalData{" +
                "id=" + id +
                ", clientCountryOfResidence='" + clientCountryOfResidence + '\'' +
                ", marriageStatus='" + marriageStatus + '\'' +
                ", number_of_kids='" + numberOfKids + '\'' +
                '}';
    }
}
