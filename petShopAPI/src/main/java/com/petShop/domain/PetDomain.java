package com.petShop.domain;

import lombok.Data;

@Data
public class PetDomain {

    private int id;
    private String name;
    private String specie;
    private int age;
    private String gender;
    private OwnerDomain owner;
}
