package com.bean;

public class Triangle {
    public Point pointA;
    public Point pointB;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point pointC;

    public void display(){
        System.out.println("Point A ==> ("+getPointA().getX()+" "+ getPointA().getY()+ ")");
        System.out.println("Point B ==> ("+getPointA().getX()+" "+ getPointA().getY()+ ")");
        System.out.println("Point C ==> ("+getPointA().getX()+" "+ getPointA().getY()+ ")");
    }

}
