package model;

public class FulTime {

    int fixSalary;
    int numOfHours;
    int extraSalary;

    int noOfExtraHours;

    public FulTime(int fixSalary, int numOfHours, int extraSalary, int noOfExtraHours) {
        this.fixSalary = fixSalary;
        this.numOfHours = numOfHours;
        this.extraSalary = extraSalary;
        this.noOfExtraHours = noOfExtraHours;
    }

    public int getNoOfExtraHours() {
        return noOfExtraHours;
    }

    public int getFixSalary() {
        return fixSalary;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public int getExtraSalary() {
        return extraSalary;
    }
}
