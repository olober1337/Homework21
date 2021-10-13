package homework21.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true, nullable = false)
    private String number;

    @Column(nullable = false)
    private double value;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", number=" + number +
                '}';
    }
}