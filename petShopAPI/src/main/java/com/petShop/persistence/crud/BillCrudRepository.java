package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillCrudRepository extends CrudRepository<Bill, Integer> {
}
