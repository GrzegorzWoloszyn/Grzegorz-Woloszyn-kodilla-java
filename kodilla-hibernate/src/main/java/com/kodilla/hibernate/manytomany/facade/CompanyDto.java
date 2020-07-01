package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import javax.persistence.NamedNativeQuery;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompaniesWithTheSpecialBeginning",
        query = "SELECT * FROM COMPANIES WHERE NAME LIKE %NAME%",
        resultClass = Company.class)

public final class CompanyDto {
    private String name;
    List<EmployeeDto> employees = new ArrayList<>();

    public CompanyDto(String name) {
        this.name = name;
    }

    public void addEmployee(final EmployeeDto employeeDto) {
        employees.add(employeeDto);
    }

    public String getName() {
        return name;
    }

    public List<EmployeeDto> getEmployees() {
        return employees;
    }
}















