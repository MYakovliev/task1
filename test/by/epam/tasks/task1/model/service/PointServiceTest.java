package by.epam.tasks.task1.model.service;

import by.epam.tasks.task1.model.entity.Point;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {
    static PointService pointService = new PointService();
    @Test
    public void testFindClosestPointToZero() {
        Point expected = new Point(12, 1);
        Point point = new Point(15, 2);
        Point actual = pointService.findClosestPointToZero(expected, point);
        assertEquals(actual, expected);
    }
}