package by.epam.tasks.task1.controller;

import by.epam.tasks.task1.view.Output;
import by.epam.tasks.task1.view.Reports;

public class Main {
    static Reports reports = new Reports();
    static Output output = new Output();

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
       try{
           sb.append(reports.task1());
           sb.append(reports.task2());
           sb.append(reports.task3());
           sb.append(reports.task4());
           sb.append(reports.task5());
           sb.append(reports.task6());
           sb.append(reports.task7());
           sb.append(reports.task8());
           sb.append(reports.task9());
           sb.append(reports.task10());

       } catch (Exception e){
           output.consolePrintLine(e.getMessage());
       } finally {
           output.consolePrintLine(sb);
       }
    }
}
