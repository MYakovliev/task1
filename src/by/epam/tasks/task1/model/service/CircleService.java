package by.epam.tasks.task1.model.service;

import by.epam.tasks.task1.model.entity.Circle;

public class CircleService {
    public double calculateCircleSquare(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    public double calculateCircleLength(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }
}
