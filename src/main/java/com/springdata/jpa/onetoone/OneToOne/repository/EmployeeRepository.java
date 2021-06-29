package com.springdata.jpa.onetoone.OneToOne.repository;

import com.springdata.jpa.onetoone.OneToOne.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
