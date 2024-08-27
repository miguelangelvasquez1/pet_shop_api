package com.petShop.persistence;

import com.petShop.persistence.crud.OwnerCrudRepository;
import com.petShop.persistence.entity.Owner;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OwnerRepository {

    private OwnerCrudRepository ownerCrudRepository;

    public List<Owner> getAll() {
        return (List<Owner>) ownerCrudRepository.findAll();//select * from Owners
    }

    public Optional<Owner> getById(int id) {
        return ownerCrudRepository.findById(id);
    }

    public void save(Owner owner) {
        ownerCrudRepository.save(owner);
    }

    public void deleteById(int id) {
        ownerCrudRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return ownerCrudRepository.existsById(id);
    }

    public int countAllOwners() {
        return (int) ownerCrudRepository.count();
    }
}
