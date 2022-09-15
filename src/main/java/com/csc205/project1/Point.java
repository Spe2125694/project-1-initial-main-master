package com.csc205.project1;


public class Point {
    double x;
    double y;

    public Point() {

    }

    public Point(double x1, double y1) {
        x = x1;
        y = y1;
    }

    public String distance(Point p2) {

        double dist = Math.sqrt(
                Math.pow(p2.getX() - x, 2) +
                        Math.pow(p2.getY() - y , 2));

        return String.valueOf(dist);
    }

    public double getX() {
        return x;
    }

    public void setX(double x2) {
        x = x2;
    }

    public double getY() {
        return y;
    }

    public void setY(double y2) {
        y = y2;
    }

    public void setPoint(double x3, double y3) {
        x = x3;
        y = y3;
    }

    public void shiftX(double n) {
        x += n;
    }

    public void shiftY(double n) {
        y += n;
    }

    public void rotate(double angle) {
        x = (x * Math.cos(angle)) - (y * Math.sin(angle));
        y = (x * Math.sin(angle)) + (y * Math.cos(angle));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
