package com.bean;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;
@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    int candidateId;
    String name;
    @ManyToMany
    @JoinColumn
    List<Interviewer> interviewer;

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Interviewer> getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(List<Interviewer> interviewer) {
        this.interviewer = interviewer;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", name='" + name + '\'' +
                ", interviewer=" + interviewer +
                '}';
    }
}
