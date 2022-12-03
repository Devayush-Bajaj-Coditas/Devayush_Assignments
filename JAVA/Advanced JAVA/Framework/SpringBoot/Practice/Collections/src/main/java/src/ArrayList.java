package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class ArrayList {


    //adding numbers divisible by 1500

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int userInput;
        List<Integer> numbers = new java.util.ArrayList<>();
        do {
            System.out.println("Enter a number or -1 to EXIT : ");
            userInput = Integer.parseInt(bufferedReader.readLine());
            if (userInput % 1500 == 0) {
                numbers.add(userInput);
                System.out.println("yess!! divisible");
            } else
                System.out.println("non divisible");

        } while (userInput != -1);

        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("program ended");
    }
}
