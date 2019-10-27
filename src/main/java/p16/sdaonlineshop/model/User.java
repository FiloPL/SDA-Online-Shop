package p16.sdaonlineshop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(generator = "clientSeq")
    @SequenceGenerator(name = "clientSeq", sequenceName = "client_seq", allocationSize = 1)
    private int id;

    private String name;
    private String lastName;
    private String email;
    private String password;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User client = (User) o;
        return id == client.id &&
                Objects.equals(name, client.name) &&
                Objects.equals(lastName, client.lastName) &&
                Objects.equals(email, client.email) &&
                Objects.equals(password, client.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, email, password);
    }
}
