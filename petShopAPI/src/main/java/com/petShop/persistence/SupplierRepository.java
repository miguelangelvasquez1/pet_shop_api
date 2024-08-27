package com.petShop.persistence;

import com.petShop.persistence.crud.SupplierCrudRepository;
import com.petShop.persistence.entity.Supplier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SupplierRepository {

    private SupplierCrudRepository supplierCrudRepository;

    public List<Supplier> getAll() {
        return (List<Supplier>) supplierCrudRepository.findAll();//select * from Owners
    }

    public Optional<Supplier> getById(int id) {
        return supplierCrudRepository.findById(id);
    }

    public void save(Supplier supplier) {
        supplierCrudRepository.save(supplier);
    }

    public void deleteById(int id) {
        supplierCrudRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return supplierCrudRepository.existsById(id);
    }

    public int countAllSuppliers() {
        return (int) supplierCrudRepository.count();
    }
}
