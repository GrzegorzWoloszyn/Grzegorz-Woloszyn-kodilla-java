package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import javax.persistence.NamedNativeQuery;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompaniesWithTheSpecialBeginning",
        query = "SELECT * FROM COMPANIES WHERE NAME LIKE %NAME%",
        resultClass = Company.class)

class CompanyDto {
    private String name;
    List<EmployeeDto> employees = new ArrayList<>();

     CompanyDto(String name) {
        this.name = name;
    }

    void addEmployee(final EmployeeDto employeeDto) {
        employees.add(employeeDto);
    }

    String getName() {
        return name;
    }

    List<EmployeeDto> getEmployees() {
        return employees;
    }
}















