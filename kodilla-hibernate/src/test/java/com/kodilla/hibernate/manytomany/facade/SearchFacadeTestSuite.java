package com.kodilla.hibernate.manytomany.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Test
    public void testSearchFacade() {

        CompanyDto softwareMachine = new CompanyDto("Software Machine");
        CompanyDto dataMaesters = new CompanyDto("Data Maesters");
        CompanyDto greyMatter = new CompanyDto("Grey Matter");

        EmployeeDto johnSmith = new EmployeeDto("John", "Smith");
        EmployeeDto stephanieClarckson = new EmployeeDto("Stephanie", "Clarckson");
        EmployeeDto lindaKovalsky = new EmployeeDto("Linda", "Kovalsky");

        softwareMachine.addEmployee(johnSmith);
        softwareMachine.addEmployee(stephanieClarckson);
        dataMaesters.addEmployee(stephanieClarckson);
        dataMaesters.addEmployee(lindaKovalsky);
        greyMatter.addEmployee(johnSmith);
        greyMatter.addEmployee(lindaKovalsky);

        johnSmith.addCompany(softwareMachine);
        johnSmith.addCompany(greyMatter);
        stephanieClarckson.addCompany(softwareMachine);
        stephanieClarckson.addCompany(dataMaesters);
        lindaKovalsky.addCompany(dataMaesters);
        lindaKovalsky.addCompany(greyMatter);

        try {
                searchFacade.processSearchingCompany("eph");
        }catch (SearchProcessingException searchProcessingException) {
            System.out.println(searchProcessingException);
        }

        try {
            searchFacade.processSearchingCompany("val");
        }catch (SearchProcessingException searchProcessingException) {
            System.out.println(searchProcessingException);
        }

    }

}
