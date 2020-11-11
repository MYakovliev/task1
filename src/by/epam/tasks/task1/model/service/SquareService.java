package by.epam.tasks.task1.model.service;

import by.epam.tasks.task1.model.entity.Square;

public class SquareService {
    public double findSquareInCircle(Square square) {
        return getSquare(new Square(square.getA() / Math.sqrt(2)));
    }

    public double getSquare(Square square) {
        return square.getA() * square.getA();
    }
}
