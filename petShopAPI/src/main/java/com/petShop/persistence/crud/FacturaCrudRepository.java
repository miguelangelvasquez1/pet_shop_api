package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaCrudRepository extends CrudRepository<Factura, Integer> {
}
