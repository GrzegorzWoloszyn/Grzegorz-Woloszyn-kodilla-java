package com.kodilla.hibernate.manytomany;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompaniesWithTheSpecialBeginning",
        query = "SELECT * FROM COMPANIES WHERE SUBSTRING(NAME, 1, 3) LIKE :NAME",
        resultClass = Company.class)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    @Id
    @GeneratedValue
    @NotNull
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
