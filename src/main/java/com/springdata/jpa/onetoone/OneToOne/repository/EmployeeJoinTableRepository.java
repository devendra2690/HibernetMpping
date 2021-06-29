package com.springdata.jpa.onetoone.OneToOne.repository;

import com.springdata.jpa.onetoone.OneToOne.entity.jointable.EmployeeJoinTable;
import com.springdata.jpa.onetoone.OneToOne.entity.sharedkey.EmployeeSharedKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJoinTableRepository extends JpaRepository<EmployeeJoinTable,Long> {
}
