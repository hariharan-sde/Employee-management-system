package com.hari.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hari.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
