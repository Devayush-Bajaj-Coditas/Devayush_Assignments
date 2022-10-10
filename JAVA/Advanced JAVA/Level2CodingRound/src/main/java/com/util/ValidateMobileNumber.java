package com.util;

import com.exceptions.UserDoesNotExistException;
import com.model.SimUser;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.RequestDispatcher;

public class ValidateMobileNumber {
    public boolean validate(long mobileNumber) {
        Session session = new SessionGenerator().getSession();


        SimUser simUser = (SimUser) session.get(SimUser.class, mobileNumber);
        long numberFromDb = simUser.getMobileNumber();
        if (numberFromDb != mobileNumber){
            return false;
        }
        else
            return true;
    }
}
