package homework21.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }
}
