package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
    @Id
    private int answerId;
    private String answer;
    @ManyToOne
    private Questions questions;

    public Answers() {
    }

    public Answers(int answerId, String answer, Questions questions) {
        this.answerId = answerId;
        this.answer = answer;
        this.questions = questions;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }
}
