package com.petShop.domain.dto;

import lombok.Data;

@Data
public class PetDTO { //Llama los objetos de la base de datos

    private Integer id;
    private String name;
    private String species;
    private int age;
    private String gender;
    private Integer ownerId; // Representa el id del propietario
}