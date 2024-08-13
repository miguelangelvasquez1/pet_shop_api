package com.petShop.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="propietario")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_propietario")
    private Integer id;

    @Column(name="nombres")
    private String firtsName;

    @Column(name="apellidos")
    private String lastName;

    @Column(name="correo_electronico")
    private String email;

    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;

    /*
    Atributos
    id
    nombres del propietario
    apellidos del propietario
    correo electronico
    telefono / celular
    direccion
     */

    /*Entidades a crear
        Citas
        Productos
        Proveedores
        Factura
        Historia Medica (Opcional)
        Veterinario (Opcional)
        Las demas que considere.....

     */
}
