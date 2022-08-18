package secao15.TratamentodeExecoes.aula178ea179exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter account data:");


        System.out.print("number: ");
        int number = sc.nextInt();
        System.out.print("holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        System.out.println();

        Account acc1 = new Account(number, holder, balance, withdrawLimit);

        System.out.print("enter amount for withdraw: ");
        double amount= sc.nextDouble();

        try {

            acc1.withdraw(amount);
            System.out.printf("new balance : %.2f%n", acc1.getBalance());

        }catch (DominianException e ){
            System.out.println(e.getMessage());
        }



        sc.close();
    }
}
