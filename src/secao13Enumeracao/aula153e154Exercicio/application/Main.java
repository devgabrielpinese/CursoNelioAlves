package secao13Enumeracao.aula153e154Exercicio.application;

import secao13Enumeracao.aula153e154Exercicio.entities.*;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static secao13Enumeracao.aula153e154Exercicio.entities.Client.sdf;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("enter client data: ");
        System.out.print("name: ");
        String name= sc.next();
        System.out.print("email: ");
        String email= sc.next();
        System.out.print("birth date (dd/MM/yyyy): ");
        Date birth = sdf.parse(sc.next());
        Client client = new Client(name,email,birth);
        System.out.println("enter order data: ");
        System.out.print("status: ");
        OrderStatus status= OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(),status, client);

        System.out.print("how many itms to this order ");
        int n = sc.nextInt();
        for (int i =0; i<n; i++){
            System.out.println(" enter #"+(i+1)+" item data: ");
            System.out.print("product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName,productPrice);
            OrderItem it = new OrderItem(quantity,productPrice,product);
            order.addItems(it);

        }
        System.out.println();
        System.out.println(order);



        sc.close();

    }
}
