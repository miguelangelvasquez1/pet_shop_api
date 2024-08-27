package com.petShop.persistence;

import com.petShop.persistence.crud.PetCrudRepository;
import com.petShop.persistence.entity.Owner;
import com.petShop.persistence.entity.Pet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository { //Los repository son como los controladores de la persistencia

    private PetCrudRepository petCrudRepository;

    public List<Owner> findByIdOwnerOrderByNombreAsc(int idOwner) {
        return petCrudRepository.findByIdOwnerOrderByNombreAsc(idOwner);
    }

    public List<Pet> getAll() {
        return (List<Pet>) petCrudRepository.findAll();//select * from Owners
    }

    public Optional<Pet> getById(int id) {
        return petCrudRepository.findById(id);
    }

    public void save(Pet pet) {
        petCrudRepository.save(pet);
    }

    public void deleteById(int id) {
        petCrudRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return petCrudRepository.existsById(id);
    }

    public int countAllPets() {
        return (int) petCrudRepository.count();
    }
}
