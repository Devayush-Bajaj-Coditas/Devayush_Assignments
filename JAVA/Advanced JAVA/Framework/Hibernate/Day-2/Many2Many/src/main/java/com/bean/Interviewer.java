package com.bean;

import javax.persistence.*;
import java.util.List;
@Entity
public class Interviewer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int interviewerId;
    String interviewerName;
    @ManyToMany
    List <Candidate>candidate;


    public int getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(int interviewerId) {
        this.interviewerId = interviewerId;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public List<Candidate> getCandidate() {
        return candidate;
    }

    public void setCandidate(List<Candidate> candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Interviewer{" +
                "interviewerId=" + interviewerId +
                ", interviewerName='" + interviewerName + '\'' +
                ", candidate=" + candidate +
                '}';
    }
}
