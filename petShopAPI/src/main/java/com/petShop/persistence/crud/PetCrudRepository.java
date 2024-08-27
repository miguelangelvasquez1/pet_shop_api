package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Owner;
import com.petShop.persistence.entity.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PetCrudRepository extends CrudRepository<Pet, Integer> {

    //Query nativo
    @Query(value = "SELECT * FROM dueño d WHERE d.id = :id ORDER d.nombre ASC", nativeQuery = true)
    List<Owner> findByIdOwnerOrderByNombreAsc(@Param("id") int idOwner);
    /*
    SELECT *
    FROM dueño d
    WHERE d.id = ?
    ORDER d.nombre ASC
    */
}
