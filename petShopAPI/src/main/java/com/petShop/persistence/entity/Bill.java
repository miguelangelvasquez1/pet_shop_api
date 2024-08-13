package com.petShop.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Factura")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fecha")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "id_dueño", insertable = false,updatable = false)
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "id_mascota", insertable = false,updatable = false)
    private Pet pet;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "total")
    private double total;
}
