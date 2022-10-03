package model;

public class PartTime {
    int id;
    String name;
    int hrsSalary;
    int noOfHrs;

    public PartTime(int id, String name, int hrsSalary, int noOfHrs) {
        this.id = id;
        this.name = name;
        this.hrsSalary = hrsSalary;
        this.noOfHrs = noOfHrs;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHrsSalary() {
        return hrsSalary;
    }

    public int getNoOfHrs() {
        return noOfHrs;
    }
}

