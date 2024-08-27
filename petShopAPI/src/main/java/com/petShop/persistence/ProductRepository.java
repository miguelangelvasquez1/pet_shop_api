package com.petShop.persistence;

import com.petShop.persistence.crud.ProductCrudRepository;
import com.petShop.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();//select * from Owners
    }

    public Optional<Product> getById(int id) {
        return productCrudRepository.findById(id);
    }

    public void save(Product product) {
        productCrudRepository.save(product);
    }

    public void deleteById(int id) {
        productCrudRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return productCrudRepository.existsById(id);
    }

    public int countAllProducts() {
        return (int) productCrudRepository.count();
    }
}
