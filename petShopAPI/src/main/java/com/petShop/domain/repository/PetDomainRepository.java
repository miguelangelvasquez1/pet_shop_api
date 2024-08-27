package com.petShop.domain.repository;

import com.petShop.domain.OwnerDomain;
import com.petShop.domain.PetDomain;

import java.util.List;
import java.util.Optional;

public interface PetDomainRepository { //Aqui uso los métodos de la persistencia

    List<OwnerDomain> findByIdOwnerOrderByNombreAsc(int idOwner);
    public List<PetDomain> getAll();
    public Optional<PetDomain> getById(int id);
    public void save(PetDomain pet);
    public void deleteById(int id);
    public boolean existsById(int id);
    public int countAllPets();
}
