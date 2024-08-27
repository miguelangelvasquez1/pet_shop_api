package com.petShop.persistence;

import com.petShop.persistence.crud.BillCrudRepository;
import com.petShop.persistence.entity.Bill;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BillRepository {

    private BillCrudRepository billCrudRepository;

    public List<Bill> getAll() {
        return (List<Bill>) billCrudRepository.findAll();//select * from Owners
    }

    public Optional<Bill> getById(int id) {
        return billCrudRepository.findById(id);
    }

    public void save(Bill bill) {
        billCrudRepository.save(bill);
    }

    public void deleteById(int id) {
        billCrudRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return billCrudRepository.existsById(id);
    }

    public int countAllBills() {
        return (int) billCrudRepository.count();
    }
}
