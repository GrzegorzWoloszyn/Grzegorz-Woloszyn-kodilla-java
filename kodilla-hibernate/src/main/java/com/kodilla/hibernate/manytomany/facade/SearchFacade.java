package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SearchFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void processSearching(String beginning, String lastName) throws SearchProcessingException {

        try{
            if(companyDao.retrieveCompaniesWithTheSpecialBeginning(beginning) == null) {
                LOGGER.error(SearchProcessingException.ERR_COMP_NOT_FOUND);
            } else {
                LOGGER.info("Company with the special beginning" + beginning + "founded.");
            }

            if(employeeDao.retrieveEmployeesWithSpecificLastName(lastName) == null) {
                LOGGER.error(SearchProcessingException.ERR_EMPL_NOT_FOUND);
            } else {
                LOGGER.info("Employees with specific lastname" + lastName + "founded");
            }
        } finally {
            LOGGER.info("Ups.");
        }
    }
}
