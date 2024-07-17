package com.himanshubhatt.ems.repository;

import com.himanshubhatt.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
