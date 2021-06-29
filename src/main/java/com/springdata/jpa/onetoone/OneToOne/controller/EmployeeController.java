package com.springdata.jpa.onetoone.OneToOne.controller;

import com.springdata.jpa.onetoone.OneToOne.entity.Employee;
import com.springdata.jpa.onetoone.OneToOne.entity.jointable.EmployeeJoinTable;
import com.springdata.jpa.onetoone.OneToOne.entity.sharedkey.AddressSharedKey;
import com.springdata.jpa.onetoone.OneToOne.entity.sharedkey.EmployeeSharedKey;
import com.springdata.jpa.onetoone.OneToOne.repository.EmployeeJoinTableRepository;
import com.springdata.jpa.onetoone.OneToOne.repository.EmployeeRepository;
import com.springdata.jpa.onetoone.OneToOne.repository.EmployeeSharedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeSharedRepository employeeSharedRepository;

    @Autowired
    EmployeeJoinTableRepository employeeJoinTableRepository;

    @RequestMapping("/add")
    public Employee addStudent(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long employeeId) {

        employeeRepository.deleteById(employeeId);
        return "Deleted Employee "+employeeId;
    }


    @RequestMapping("/employeesharedkey/add")
    public EmployeeSharedKey addEmployeeSharedKey(@RequestBody EmployeeSharedKey employee) {

        employee.getAddress().setEmployee(employee);
        EmployeeSharedKey employeeSharedKey = employeeSharedRepository.save(employee);
        return employeeSharedKey;
    }

    @DeleteMapping("/employeesharedkey/delete/{id}")
    public String deleteEmployeeSharedKey(@PathVariable("id") Long employeeId) {

        employeeSharedRepository.deleteById(employeeId);
        return "Deleted Employee "+employeeId;
    }


    @RequestMapping("/employeejointable/add")
    public EmployeeJoinTable addEmployeejointable(@RequestBody EmployeeJoinTable employee) {

        EmployeeJoinTable employeeJoinTable = employeeJoinTableRepository.save(employee);
        return employeeJoinTable;
    }

    @DeleteMapping("/employeejointable/delete/{id}")
    public String deleteEmployeejointable(@PathVariable("id") Long employeeId) {

        employeeJoinTableRepository.deleteById(employeeId);
        return "Deleted Employee "+employeeId;
    }
}
