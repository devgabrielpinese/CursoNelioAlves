package heranca.exemplos.polimorfismo.refazendo.ex01.application;

import heranca.exemplos.polimorfismo.exercicio.ex01.entities.OutsourceEmployee;
import heranca.exemplos.polimorfismo.refazendo.ex01.entities.Employee;
import heranca.exemplos.polimorfismo.refazendo.ex01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {

        List<Employee>listEmp= new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of employees: ");
        int n = sc.nextInt();

        for (int i =1; i<=n;i++){
            System.out.println("employee #" + i + " data:");
            System.out.print("outsoure (y/n)? ");
            char ch =sc.next().charAt(0);
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("hours: ");
            int hours = sc.nextInt();
            System.out.print("value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch =='y'){
                System.out.print("aditional charge: ");
                double aditionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, aditionalCharge);

                listEmp.add(emp);
            }else{
                Employee emp = new Employee(name, hours, valuePerHour);

                listEmp.add(emp);
            }
        }
        for (Employee emp :listEmp) {
            System.out.println(emp.getName() +" - $ "+emp.payment());
        }
    }
}
