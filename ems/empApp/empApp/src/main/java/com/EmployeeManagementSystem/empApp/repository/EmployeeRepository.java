package com.EmployeeManagementSystem.empApp.repository;

import com.EmployeeManagementSystem.empApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
