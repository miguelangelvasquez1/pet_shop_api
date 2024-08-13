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

    public void saveOwner(Owner owner) {
        ownerCrudRepository.save(owner);
    }

    public void deleteOwner(Owner owner) {
        ownerCrudRepository.delete(owner);
    }

    public boolean existsOwner(int id) {
        return ownerCrudRepository.existsById(id);
    }

    public int countAllOwners() {
        return (int) ownerCrudRepository.count();
    }
}
