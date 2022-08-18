package secao13Enumeracao.aula150e151.application;

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
        //vai formatar a data em um determinado formato
        SimpleDateFormat sdf = new SimpleDateFormat("(dd/MM/yyyy)");
        //scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("enter department name: ");

        String deptName = sc.next();
        System.out.println("enter worker data:");
        System.out.print("name: ");
        String name = sc.next();
        System.out.print("level: ");
        String level = sc.next();
        System.out.print("base salary: ");
        Double baseSalary = sc.nextDouble();
        //cria um objeto trabalhador com atributos name, level que é um valor int pois é uma classe enum, baseSalary, e instanciando o Objeto department com depName
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(deptName));
        System.out.println("how many contarcts to this worker? ");
        //cria uma variavel que vai ser a quantidade de contartos
        int n = sc.nextInt();
        //um for do tamanho da variavel
        for (int i = 0; i < n; i++) {
            System.out.println("enter contract #" + i + " data:");
            System.out.print("Date (dd/MM/yyyy): ");
            //vai criar uma nove data com o formato determinado no simpleDateFormat, e usar o que for digitado
            Date contractDate = sdf.parse(sc.next());
            System.out.print("value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("duration (hours): ");
            int hours = sc.nextInt();
            //cria um novo contract, instanciando ele com os atributos contractDate, valuePerHour, hours
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            //chama o metodo worker.addContract que vai adicionar o contarto na lista de contratos
            worker.addContract(contract);
        }
        System.out.print("enter month and year to calculate income(MM/YYYY)");
        String monthAndYear = sc.next();
        //cria uma variavel que vai pegar uma parte da string e transformar em int
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        //cria uma variavel que vai pegar uma parte da string e transformar em int
        int year = Integer.parseInt(monthAndYear.substring(3));
        //printa o nome usando o worker.getName
        System.out.print("name: " + worker.getName());
        //printa o department usando o worker.getDepartment().getName pq ele vai pegar o nome do department usando o getName e buscar ele no worker.getDepartment
        System.out.print("department: " + worker.getDepartment().getName());
        //printa o mes e ano e chama o metodo worker.income que os parametros mes e ano / esse metodo usa outro metodo o valueTotal
        //que multiplica as horas por valuePerHours
        System.out.print("income for " + monthAndYear + ": " + worker.income(year, month));


        sc.close();
    }
}
