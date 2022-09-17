package com.example.mycode.admin;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Admin {

    @Id
    @SequenceGenerator(
            name = "admin_gen",
            allocationSize = 1,
            sequenceName = "admin_gen"
    )
    @GeneratedValue(
            generator = "admin_gen",
            strategy = GenerationType.SEQUENCE
    )
    private  Long id;
    private  String email;
    private String password;


    public Admin() {
    }

    public Admin(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(id, admin.id) && Objects.equals(email, admin.email) && Objects.equals(password, admin.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
