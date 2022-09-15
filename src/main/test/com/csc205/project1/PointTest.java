package com.csc205.project1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PointTest {

    @Mock
    Point point;

    @Test
    void distanceTest() {
        String expected = "2.0";
        String actual = new Point(2.0, 0.0).distance(point);
        assertEquals(expected, actual);
    }

    @Test
    void shiftXTest() {
        Point point = new Point();
        point.shiftX(10.0);
        assertEquals(10.0, point.getX());
    }

    @Test
    void shiftYTest() {
        Point point = new Point();
        point.shiftY(8.0);
        assertEquals(8.0, point.getY());
    }

    @Test
    void rotateTest() {
        Point point = new Point(0.0, 5.0);
        point.rotate(90 * (Math.PI /180));
        assertEquals(-5.0, point.getX());

    }

}
