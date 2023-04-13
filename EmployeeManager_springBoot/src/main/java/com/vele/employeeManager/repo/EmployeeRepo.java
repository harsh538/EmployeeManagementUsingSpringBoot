package com.vele.employeeManager.repo;

import com.vele.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository <Employee,Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
    //EntityManager EM = new EntityManager();

}
