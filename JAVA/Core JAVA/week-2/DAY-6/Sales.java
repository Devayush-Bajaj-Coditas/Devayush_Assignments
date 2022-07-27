/*Q1) Print the salary and details of WageEmployee. (Note: UsTe the previous Employee classes.
Accept the values from the user..Default, Parameterised Constructor and toString() to be written
        in all the classes)
*/
class Employee{
int id;
String Name;
Employee(int id, String name){
    this.id = id;
    this.name = name;

}
}

class WageEmployee extends Employee{
    int hrs, rate;
    void computeSalary(){

    }


}


/*
2. Create SalesPerson class extending WageEmployee with attributes as sales(int) and
commission (int).

Override the ComputeSalary() in Salesperson class and print the salary and details of
SalesPerson
 */

class WageEmployee{
    computeSalary(){
        System.out.println("compute salary under parent class");
    }
}

class SalesPerson extends WageEmployee{
    computeSalary(){

    }

}


public class Sales {
    public static void main(String[] args) {

    }
}
