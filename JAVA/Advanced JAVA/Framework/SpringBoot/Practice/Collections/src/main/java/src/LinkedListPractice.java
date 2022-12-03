package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) throws IOException {
        LinkedList linkedList = new LinkedList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberInput;

        do {
            System.out.println("Enter number you want to check");
            numberInput = bufferedReader.read();
            if(numberInput % 1500 == 0){
               linkedList.add(numberInput);
                System.out.println("number is divisiable");
            }
            else
                System.out.println("number not divisiable");
        }while (numberInput != -1);
    }
}
