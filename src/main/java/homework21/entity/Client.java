package homework21.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    private int id;

    @Column
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private Long phone;

    @Column
    private String about;

    private int age;

    @OneToMany(mappedBy = "clients", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Account> accounts;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "client_status",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "status_id")})
    private Set<Status> statuses;

    @OneToOne(mappedBy = "clients", cascade = CascadeType.ALL)
    private ClientProfile clientProfile;

    public Client(String name) {
        this.name = name;
    }

    public Client() {
    }
}
