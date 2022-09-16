package com.csc205.project1;


/**
 * Point --- program creates methods used
 * by 'Project1.java'.
 *
 * @author    Spencer Hankerson
 */
public class Point {

    protected double x;
    private double y;

    public Point() {
    }

    public Point(double x1, double y1) {
        x = x1;
        y = y1;
    }

    // Returns the distance between two specified points.
    public double distance(Point p2) {
        return Math.sqrt(
                Math.pow(p2.getX() - x, 2) +
                        Math.pow(p2.getY() - y , 2));
    }

    //  Returns value of 'x' for specified point.
    public double getX() {
        return x;
    }

    //  Opens possibility for driver class to change value of 'x'.
    public void setX(double x2) {
        x = x2;
    }

    //  Returns value of 'y' for specified point.
    public double getY() {
        return y;
    }

    //  Opens possibility for driver class to change value of 'y'.
    public void setY(double y2) {
        y = y2;
    }

    //  Changes coordinates to specified (x, y) values.
    public void setPoint(double x3, double y3) {
        x = x3;
        y = y3;
    }

    //  Shifts 'x' by specified amount.
    public void shiftX(double n) {
        x += n;
    }

    //  Shifts 'y' by specified amount.
    public void shiftY(double n) {
        y += n;
    }

    //  Rotates point by specified angle.
    public void rotate(double angle) {
        x = (x * Math.cos(angle)) - (y * Math.sin(angle));
        y = (x * Math.sin(angle)) + (y * Math.cos(angle));
    }

    //  Prints values for 'x' & 'y'.
    @Override
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
