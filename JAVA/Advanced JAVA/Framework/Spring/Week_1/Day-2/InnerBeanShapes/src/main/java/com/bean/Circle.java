package com.bean;


public class Circle {
    float radius;
    private Point center;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    void Display(){
        System.out.println();
    }

}
