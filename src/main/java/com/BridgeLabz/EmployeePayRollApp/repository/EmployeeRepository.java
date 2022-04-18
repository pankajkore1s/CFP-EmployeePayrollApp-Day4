package com.BridgeLabz.EmployeePayRollApp.repository;

import com.BridgeLabz.EmployeePayRollApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
