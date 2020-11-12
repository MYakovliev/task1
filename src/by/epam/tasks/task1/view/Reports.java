package by.epam.tasks.task1.view;

import by.epam.tasks.task1.model.entity.Circle;
import by.epam.tasks.task1.model.entity.Point;
import by.epam.tasks.task1.model.entity.Square;
import by.epam.tasks.task1.model.service.Algorithm;
import by.epam.tasks.task1.model.service.CircleService;
import by.epam.tasks.task1.model.service.PointService;
import by.epam.tasks.task1.model.service.SquareService;

import java.util.Map;

public class Reports {
    static Algorithm algorithm = new Algorithm();
    static SquareService squareService = new SquareService();
    static PointService pointService = new PointService();
    static CircleService circleService = new CircleService();
    static Output output = new Output();

    public String task1(){
        StringBuilder sb = new StringBuilder();
        int num = 78561;
        int result = algorithm.findLastNumOfSquare(num);
        sb.append("Last number of squared ");
        sb.append(num);
        sb.append(" is");
        sb.append(result);
        return sb.toString();
    }
    public String task2(){
        StringBuilder sb = new StringBuilder();
        int month = 5, year = 1678;
        int result = algorithm.daysInMonth(month, year);
        sb.append("\n");
        sb.append(result).append(" days in ");
        sb.append(" month with number ").append(month);
        sb.append(" ").append(year).append(" year\n");
        return sb.toString();
    }
    public String task3(){
        StringBuilder sb = new StringBuilder();
        int[] arr = {2, 4, 6, 5, 71, 17};
        boolean res = algorithm.atLeastTwoEven(arr);
        sb.append(" In array ");
        for (int i :arr){
            sb.append(i).append(" ");
        }
        sb.append("at least two even");
        sb.append(res?" - right statement\n": " - wrong statement\n");
        return sb.toString();
    }
    public String task4(){
        int num = 998;
        StringBuilder sb = new StringBuilder();
        boolean res = algorithm.isPerfectNumber(num);
        sb.append(num).append(" is perfect number - ");
        sb.append(res?"right statement\n": "wrong statement\n");
        return sb.toString();
    }
    public String task5(){
        int num = 8996;
        StringBuilder sb = new StringBuilder();
        int[] arr = algorithm.calculateHoursMinutesSeconds(num);
        sb.append(num).append(" is ");
        sb.append(arr[0]).append(" hours, ");
        sb.append(arr[1]).append(" minutes, ");
        sb.append(arr[2]).append(" seconds\n");
        return sb.toString();
    }
    public String task6(){
        StringBuilder sb = new StringBuilder();
        int num = 78561;
        double func = algorithm.calculateFunction(num);
        sb.append("function with x = ").append(num).append(" equals ").append(func);
        return sb.toString();
    }
    public String task7(){
        StringBuilder sb = new StringBuilder();
        Map<Double, Double> map = algorithm.createTableForTan(0.1, 1.2, 0.3);
        sb.append("\nTable for tan:\n");
        for(Map.Entry<Double, Double> pair: map.entrySet()){
            sb.append(pair.getKey()).append("  -  ").append(pair.getValue()).append("\n");
        }
        return sb.toString();
    }
    public String task8(){
        StringBuilder sb = new StringBuilder();
        int num = 78561;
        Circle circle = new Circle(5);
        double func = circleService.calculateCircleSquare(circle);
        sb.append(circle).append(" has square: ").append(func);
        func = circleService.calculateCircleLength(circle);
        sb.append(" and length: ").append(func);
        return sb.toString();
    }
    public String task9(){
        StringBuilder sb = new StringBuilder();
        Square square = new Square(5);
        double func = squareService.findSquareInCircle(square);
        sb.append("\nSquare of square inner circle inner ").append(square).append(" is ").append(func);
        return sb.toString();
    }
    public String task10(){
        StringBuilder sb = new StringBuilder();
        Point point1 = new Point(12, 1);
        Point point2 = new Point(24, 6);
        Point point = pointService.findClosestPointToZero(point1, point2);
        sb.append("\n").append(point).append(" close to zero than ").append(point.equals(point1)?point2:point1);
        return sb.toString();
    }
}
