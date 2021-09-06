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

//Output: Project 1 : Point Tester
//
//Point 1: Point {x = 3.0, y = 1.0}
//Point 2: Point {x = 6.0, y = 5.0}
//
//Distance: 5.0
//
//Rotated a 1.5707963267948966: Point {x = -0.9999999999999998, y = -0.9999999999999997}
//Shifted b 4.47213595499958 away from original position: Point {x = 10.0, y = 3.0}
//
//Process finished with exit code 0

