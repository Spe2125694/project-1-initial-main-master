package com.csc205.project1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * PointTest --- program to test methods from "Point.java".
 *
 * @author    Spencer Hankerson
 */

@ExtendWith(MockitoExtension.class)
class PointTest {

    @Mock
    Point origin;   //creates point at (0,0) on cartesian plane

    /*  Tests 'distance' method to ensure
     *  correct calculations using origin
     *  and (2,0).   */
    @Test
    void distanceTest() {
        double actual = new Point(2.0, 0.0).distance(origin);
        assertEquals(2.0, actual);
    }

    //  Tests 'shiftX' method by adding 10 to (0,0)
    @Test
    void shiftXTest() {
        Point point = new Point();
        point.shiftX(10.0);
        assertEquals(10.0, point.getX());
    }

    //  Tests 'shiftY' method by adding 10 to (0,0)
    @Test
    void shiftYTest() {
        Point point = new Point();
        point.shiftY(8.0);
        assertEquals(8.0, point.getY());
    }

    /*  Tests 'rotate' method by rotating (0, 5)
        90 degrees which returns (-y, x) */
    @Test
    void rotateTest() {
        Point point = new Point(0.0, 5.0);
        point.rotate(90 * (Math.PI /180));
        assertEquals(-5.0, point.getX());

    }

}
