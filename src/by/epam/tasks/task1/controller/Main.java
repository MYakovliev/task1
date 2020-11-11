package by.epam.tasks.task1.controller;

import by.epam.tasks.task1.model.service.Algorithm;
import by.epam.tasks.task1.model.service.CircleService;
import by.epam.tasks.task1.model.service.PointService;
import by.epam.tasks.task1.model.service.SquareService;
import by.epam.tasks.task1.view.Output;

import java.util.Map;

public class Main {
    static Algorithm algorithm = new Algorithm();
    static SquareService squareService = new SquareService();
    static PointService pointService = new PointService();
    static CircleService circleService = new CircleService();
    static Output output = new Output();

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
       try{
           int num = 78561;
           int result = algorithm.findLastNumOfSquare(num);
           sb.append("Last number of squared ");
           sb.append(num);
           sb.append(" is");
           sb.append(result);
           int month = 5, year = 1678;
           result = algorithm.daysInMonth(month, year);
           sb.append("\n");
           sb.append(result).append(" days in ");
           sb.append(" month with number ").append(month);
           sb.append(" ").append(year).append(" year\n");
           int[] arr = {2, 4, 6, 5, 71, 17};
           boolean res = algorithm.atLeastTwoEven(arr);
           sb.append(" In array ");
           for (int i :arr){
               sb.append(i).append(" ");
           }
           sb.append("at least two even");
           sb.append(res?" - right statement\n": " - wrong statement\n");
           res = algorithm.isPerfectNumber(num);
           sb.append(num).append(" is perfect number - ");
           sb.append(res?"right statement\n": "wrong statement\n");
           arr = algorithm.calculateHoursMinutesSeconds(num);
           sb.append(num).append(" is ");
           sb.append(arr[0]).append(" hours, ");
           sb.append(arr[1]).append(" minutes, ");
           sb.append(arr[2]).append(" seconds\n");
           double func = algorithm.calculateFunction(num);
           sb.append("function with x = ").append(num).append(" equals ").append(func);

           Map<Double, Double> map = algorithm.createTableForTan(0.1, 1.2, 0.3);
           sb.append("\nTable for tan:\n");
           for(Map.Entry<Double, Double> pair: map.entrySet()){
               sb.append(pair.getKey()).append("  -  ").append(pair.getValue()).append("\n");
           }


       } catch (Exception e){
           output.consolePrintLine(e.getMessage());
       } finally {
           output.consolePrintLine(sb);
       }
    }
}
