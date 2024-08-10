package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetCrudRepository extends CrudRepository<Pet, Integer> {
}
