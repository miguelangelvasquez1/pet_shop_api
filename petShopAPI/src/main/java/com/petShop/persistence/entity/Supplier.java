package com.petShop.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Proveedor")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String name;

    @OneToMany(mappedBy = "producto")
    private Product product;
    //get all, save,delete,exists,countAll
}
