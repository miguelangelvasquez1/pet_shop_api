package com.petShop.domain.mapper;

import com.petShop.domain.dto.PetDTO;
import com.petShop.persistence.entity.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring") //Puente entre la persistencia y el dominio
public interface PetMapper {

    @Mapping(source = "owner.id", target = "ownerId") //Base de datos a DTO
    PetDTO toPetDTO(Pet pet);

    @Mapping(source = "ownerId", target = "owner.id") //DTO a base de datos
    Pet toPet(PetDTO petDTO);
}
// ownerId: atributo en PetDTO
// owner.id: id de owner de la clase Pet de entity