package com.petShop.persistence;

import com.petShop.persistence.crud.OwnerCrudRepository;
import com.petShop.persistence.entity.Owner;

import java.util.List;
import java.util.Optional;

public class OwnerRepository {

    private OwnerCrudRepository ownerCrudRepository;

    public List<Owner> getAllOwners() {
        return (List<Owner>) ownerCrudRepository.findAll();//select * from Owners
    }

    public Optional<Owner> getOwnerById(int id) {
        return ownerCrudRepository.findById(id);
    }
}
