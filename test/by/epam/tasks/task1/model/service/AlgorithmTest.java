package by.epam.tasks.task1.model.service;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class AlgorithmTest {
    static Algorithm algorithm = new Algorithm();

    @Test
    public void testFindLastNumOfSquare() {
        int expected = 4;
        int number = 89768;
        int actual = algorithm.findLastNumOfSquare(number);
        assertEquals(expected, actual);

    }

    @Test
    public void testDaysInMonth() {
        int month = 2;
        int year = 2020;
        int expected = 29;
        int actual = algorithm.daysInMonth(month, year);
        assertEquals(actual, expected);
    }

    @Test
    public void testAtLeastTwoEven() {
        boolean expected = false;
        boolean actual = algorithm.atLeastTwoEven(new int[]{12, 11, 9, 3});
        assertEquals(actual, expected);
    }

    @Test
    public void testIsPerfectNumber() {
        boolean expected = false;
        boolean actual = algorithm.isPerfectNumber(7);
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculateHoursMinutesSeconds() {
        int[] expected = {3, 18, 15};
        int[] actual = algorithm.calculateHoursMinutesSeconds(11895);
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculateFunction() {
        double expected = 0.5;
        double actual = algorithm.calculateFunction(2);
        assertEquals(actual, expected);
    }


    @Test
    public void testCreateTableForTan() {
        Map<Double, Double> expected = new HashMap<> ();
        expected.put(1.,1.5574077246549023);
        Map<Double, Double> actual = algorithm.createTableForTan(1, 1, 0.3);
        assertEquals(actual, expected);
    }
}