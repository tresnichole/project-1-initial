//Author: Tressa Ortiz
//Class: CSC205AA
//Date: 4/4/21
//Project 1

package com.csc205.project1;

public class Point {

    double x, y; // declare variables

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // calculate distance to point 2
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getY() - this.getY(), 2) + Math.pow(p.getX() - this.getX(), 2));

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //set points on coordinate
    public void setPoint(double x, double y) {
        this.setX(x);
        this.setY(y);
    }


    public void shiftX(double n) {
        this.setX(this.getX() + n);

    }

    public void shiftY(double n) {
        this.setY(this.getY() + n);
    }

    // rotates the point by a specified angle around the origin
    public void rotate(double rotation) {
        this.setX(this.getX() * Math.cos(rotation) - this.getY() * Math.sin(rotation));
        this.setY(this.getX() * Math.sin(rotation) + this.getY() * Math.cos(rotation));
    }

    public String toString() {
        return "Point {x = " + this.getX() + ", y = " + this.getY() + "}";
    }
}



