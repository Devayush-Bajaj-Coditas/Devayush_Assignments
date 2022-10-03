package com.dao;

import com.bean.Candidate;
import com.bean.Interviewer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OperationDao implements CRUD{

    Interviewer interviewer = new Interviewer();
    Candidate candidate = new Candidate();
    BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));


    Configuration configuration = new Configuration().configure("app.cfg.xml" );

    @Override
    public void create() {
        System.out.println("Enter Interviewer details \n Name: ");
        try {
            Session session = configuration.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            String interviewerName = bufferedReader.readLine();
            interviewer.setInterviewerName(interviewerName);

            System.out.println("Enter Candidate Details " + "Name:" );

            String candidateName = bufferedReader.readLine();
            candidate.setName(candidateName);

            session.save(interviewer);
            session.save(candidate);
            transaction.commit();



        }catch (Exception e){e.printStackTrace();}

    }



}
