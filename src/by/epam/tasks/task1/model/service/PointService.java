package by.epam.tasks.task1.model.service;

import by.epam.tasks.task1.model.entity.Point;

public class PointService {
    public Point findClosestPointToZero(Point point1, Point point2) {
        return Math.hypot(point1.getX(), point1.getY()) < Math.hypot(point2.getX(), point2.getY()) ? point1 : point2;
    }

}
