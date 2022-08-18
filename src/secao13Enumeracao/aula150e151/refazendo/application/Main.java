package secao13Enumeracao.aula150e151.refazendo.application;

import secao13Enumeracao.aula150e151.refazendo.entities.Department;
import secao13Enumeracao.aula150e151.refazendo.entities.HourContract;
import secao13Enumeracao.aula150e151.refazendo.entities.Worker;
import secao13Enumeracao.aula150e151.refazendo.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.print("entre department's name: ");
        String departmentName = sc.next();
        System.out.println("enter worked data: ");
        System.out.print("name: ");
        String name = sc.next();
        System.out.print("level: ");
        String level = sc.next();
        System.out.print("base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
        System.out.print("how many contract to this worker? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("value per hour: ");
            double valuePorHour = sc.nextDouble();
            System.out.print("duration: ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePorHour, hours);
            worker.addContract(contract);
        }
        System.out.println("entre month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("name: " + worker.getName());
        System.out.println("department" + worker.getDepartment().getName());
        System.out.println("income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        sc.close();
    }
}
