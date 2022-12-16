package Week_7.Day27.StreamApiPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenAndLargest {
    public static void main(String[] args) {
        List <Integer> myList = new <Integer> ArrayList();
        myList.add(12);
        myList.add(123);
        myList.add(4);
        myList.add(13);
        myList.add(11);
        myList.add(18);


        System.out.println(".filter --> filter even nd largest");
        myList.stream().filter(x -> x%2 == 0)
                .filter( x -> x > 10)
                .forEach(System.out::println);

        System.out.println(".map --> square the whole list ");
        List squareList = myList.stream().map(x -> x*x).collect(Collectors.toList());
        squareList.forEach(System.out::println);


        System.out.println(".allMatch --> all the elements in a list are even or not");
        boolean sameList = myList.stream().allMatch(x -> x%2 ==0);
        System.out.println(sameList);


        System.out.println("Count total number of elements in list");
        long countInt = myList.stream().count();
        System.out.println( countInt);
        System.out.println("Count the number of non-duplicate(distinct) elements");
        long distinctElements = myList.stream().distinct().count();
        System.out.println(distinctElements);

    }
}
