package by.epam.tasks.task1.model.service;

import java.util.HashMap;
import java.util.Map;

public class Algorithm {
    final static int SECONDS_IN_HOUR = 3600;
    final static int SECONDS_IN_MINUTE = 60;

    public int findLastNumOfSquare(int number) {
//        switch (Math.abs(number%10)) {
//            case 1:
//            case 9: number = 1; break;
//            case 2:
//            case 8: number = 4; break;
//            case 3:
//            case 7: number = 9; break;
//            case 4:
//            case 6: number = 6; break;
//            case 5: number = 5; break;
//            case 0: number = 0;
//        }
//        return number;
        return (number % 10) * (number % 10) % 10;
    }

    private boolean isBissextile(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
    }

    public int daysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("invalid data");
        }
        if (isBissextile(year)) {
            daysInMonth[1] = 29;
        }
        return daysInMonth[month - 1];
    }

    public boolean atLeastTwoEven(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("invalid data");
        }
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count >= 2;
    }

    public boolean isPerfectNumber(int number) {
        int sum = 0;
        int num = number;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum == number;
    }

    public int[] calculateHoursMinutesSeconds(int seconds) {
        int hours = seconds / SECONDS_IN_HOUR;
        int minutes = (seconds - hours * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        seconds -= (hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE);
        return new int[]{hours, minutes, seconds};
    }

    public double calculateFunction(double x) {
        double result;
        if (x >= 3) {
            result = -x * x + 3 * x + 9;
        } else {
            result = 1 / (x * x * x - 6);
        }
        return result;
    }

    public Map<Double, Double> createTableForTan(double x0, double xn, double h) {
        Map<Double, Double> table = new HashMap<>();
        double x = x0;
        while (x <= xn) {
            table.put(x, Math.tan(x));
            x += h;
        }
        return table;
    }


}
