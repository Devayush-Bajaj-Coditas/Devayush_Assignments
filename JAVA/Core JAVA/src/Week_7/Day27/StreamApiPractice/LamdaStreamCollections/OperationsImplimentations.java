package Week_7.Day27.StreamApiPractice.LamdaStreamCollections;

import Week_4.Day17.Q2_Employee_Input_All_Ways.EmployeeDetails;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Random;

public class OperationsImplimentations implements Operations{
    DatabaseManagement databaseManagement = new DatabaseManagement();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    OperationsImplimentations(){

    }

    @Override
    public void insert() throws IOException {
        System.out.print("Enter below details: \nName : ");
        String name = bufferedReader.readLine();
        System.out.print("Salary");
        int salary = Integer.parseInt(bufferedReader.readLine());
        Random random = new Random(999999999);
        int id = random.nextInt();
        System.out.println("you have successfully registered!! Your Id is: "+ id);
        MyEmployee newEmployee = new MyEmployee(id,name,salary);
        databaseManagement.addEmployeeDatabase(newEmployee);
    }

    @Override
    public void display() {
        Iterator iterator = databaseManagement.userData.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    @Override
    public void update() throws IOException {
        System.out.print("What do you like to update?" +
                "\n1 --> Name" +
                "\n2 --> Salary" +
                "\n3 --> Id \nEnter: ");

        int choice = Integer.parseInt(bufferedReader.readLine());
        switch (choice){
            case 1:
                System.out.print("Enter new name : ");
                String newName = bufferedReader.readLine();
                //databaseManagement.userData.set(0,newName);
        }

    }

    @Override
    public void delete() {

    }
}
