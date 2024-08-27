package com.petShop.persistence;

import com.petShop.persistence.crud.EmployeeCrudRepository;
import com.petShop.persistence.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository {

    private EmployeeCrudRepository employeeCrudRepository;

    public List<Employee> getAll() {
        return (List<Employee>) employeeCrudRepository.findAll();//select * from Owners
    }

    public Optional<Employee> getById(int id) {
        return employeeCrudRepository.findById(id);
    }

    public void save(Employee employee) {
        employeeCrudRepository.save(employee);
    }

    public void deleteById(int id) {
        employeeCrudRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return employeeCrudRepository.existsById(id);
    }

    public int countAllEmployees() {
        return (int) employeeCrudRepository.count();
    }
}
