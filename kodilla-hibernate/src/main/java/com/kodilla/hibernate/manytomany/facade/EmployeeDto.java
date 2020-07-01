package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import javax.persistence.NamedQuery;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Employee.retrieveEmployeesWithSpecificLastName",
        query = "FROM Employee WHERE lastName = %LASTNAME%")
public final class EmployeeDto {
    private String firstName;
    private String lastName;
    List<CompanyDto> companies = new ArrayList<>();

    public EmployeeDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addCompany(final CompanyDto companyDto) {
        companies.add(companyDto);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<CompanyDto> getCompanies() {
        return companies;
    }
}
