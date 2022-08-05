package heranca.exemplos.polimorfismo.exercicio.ex01.application;

import heranca.exemplos.polimorfismo.exercicio.ex01.entities.Employee;
import heranca.exemplos.polimorfismo.exercicio.ex01.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("enter the number employees :");
        int numberEmployees = sc.nextInt();
        for (int i = 1; i <= numberEmployees; i++) {
            System.out.println("employee #" + i + "data: ");
            System.out.print("outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("hours: ");
            int hours = sc.nextInt();
            System.out.print("valuePerHour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("aditional charge:");
                double aditionalCharge = sc.nextDouble();
                //Employee emp = new OutsourceEmployee(name, hours, valuePerHour, aditionalCharge);
                //employees.add(emp);
                employees.add(new OutsourceEmployee(name, hours, valuePerHour, aditionalCharge));
            } else {
                //Employee emp = new Employee(name, hours, valuePerHour);
                //employees.add(emp);
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS");
        for (Employee emp  :employees) {
            System.out.println(emp.getName()+" - $ "+String.format("%.2f",emp.paymenT()));
        }


        sc.close();
    }
}
