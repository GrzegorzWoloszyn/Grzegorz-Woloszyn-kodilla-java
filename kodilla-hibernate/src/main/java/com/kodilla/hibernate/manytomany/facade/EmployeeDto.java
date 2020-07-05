package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import javax.persistence.NamedQuery;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Employee.retrieveEmployeesWithSpecificLastName",
        query = "FROM Employee WHERE lastName = %LASTNAME%")
class EmployeeDto {
    private String firstName;
    private String lastName;
    List<CompanyDto> companies = new ArrayList<>();

    public EmployeeDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void addCompany(final CompanyDto companyDto) {
        companies.add(companyDto);
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    List<CompanyDto> getCompanies() {
        return companies;
    }
}
