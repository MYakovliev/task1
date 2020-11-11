package by.epam.tasks.task1.model.service;

import by.epam.tasks.task1.model.entity.Circle;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CircleServiceTest {
    static CircleService circleService = new CircleService();
    @Test
    public void testCalculateCircleSquare() {
        Circle circle = new Circle(7);
        double expected = 153.938;
        double actual = circleService.calculateCircleSquare(circle);
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void testCalculateCircleLength() {
        Circle circle = new Circle(5);
        double expected = 31.4159;
        double actual = circleService.calculateCircleLength(circle);
        assertEquals(actual, expected, 0.0001);
    }
}