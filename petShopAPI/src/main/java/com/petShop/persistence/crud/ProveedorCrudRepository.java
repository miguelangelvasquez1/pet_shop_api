package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface ProveedorCrudRepository extends CrudRepository<Proveedor, Integer> {
}
