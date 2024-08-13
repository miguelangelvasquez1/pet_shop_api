package com.petShop.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="empleado")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombres")
    private String firstName;

    @Column(name = "apellidos")
    private String lastName;

    @Column(name = "email")
    private String email;
}
