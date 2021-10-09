package homework21.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    private int id;

    @Column(name = "client_id", nullable = false)
    private int clientId;

    @Column(unique = true, nullable = false)
    private String number;

    @Column(nullable = false)
    private double value;

    public Account() {
    }
}