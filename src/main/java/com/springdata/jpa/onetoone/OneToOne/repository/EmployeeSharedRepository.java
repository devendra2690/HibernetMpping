package com.springdata.jpa.onetoone.OneToOne.repository;

import com.springdata.jpa.onetoone.OneToOne.entity.Employee;
import com.springdata.jpa.onetoone.OneToOne.entity.sharedkey.EmployeeSharedKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSharedRepository extends JpaRepository<EmployeeSharedKey,Long> {
}
