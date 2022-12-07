package com.devayush.JunitPractice;

public class Calculator {

    public int addition( int number1, int number2){
        int answer = number1 + number2;
        return answer;
    }


    public int product(int number1 , int number2){
        return number1*number2;
    }

    //compare two numbes
    public Boolean compare(int number1 ,int  number2){
         return number1 == number2;
    }
}
