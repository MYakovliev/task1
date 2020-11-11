package by.epam.tasks.task1.model.service;

import by.epam.tasks.task1.model.entity.Square;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareServiceTest {
    static SquareService squareService = new SquareService();
    @Test
    public void testFindSquareInCircle() {
        Square square = new Square(5);
        double expected = 12.5;
        double actual = squareService.findSquareInCircle(square);
        assertEquals(actual, expected, 0.1);
    }

    @Test
    public void testGetSquare(){
        Square square = new Square(5);
        double expected = 25;
        double actual = squareService.getSquare(square);
        assertEquals(actual, expected, 0.1);
    }
}