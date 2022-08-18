package secao15.TratamentodeExecoes.aula174e175e176e177.application;

import secao15.TratamentodeExecoes.aula174e175e176e177.entities.Reservation;
import secao15.TratamentodeExecoes.aula174e175e176e177.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)  {
        //throws ParseException meu metodo pode lancar essa exececao , ela vai ser propagada.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("room number");
            int number = sc.nextInt();
            System.out.print("check-in date (dd/MM/yyyy):  ");
            //sdf.parse da uma exeception  trata ela com o traycath ou propaga com throws ParseException
            Date checkIn = sdf.parse(sc.next());
            System.out.print("checkout date (dd/MM/yyyy):");
            Date checkout = sdf.parse(sc.next());

            //se checkout nao depois de checkin printa a frase error

            //cria o objeto da classe reservation e instancia na classe reservation com parametros do contrutor number, chechin , checkout
            Reservation reservation = new Reservation(number, checkIn, checkout);

            //printa reservation com o ToString() feito na classe
            System.out.println("reservation " + reservation);
            System.out.println();


            System.out.print("check-in date (dd/MM/yyyy):  ");//digite data de checkin
            checkIn = sdf.parse(sc.next());//reusa a variavel checkin
            System.out.print("checkout date (dd/MM/yyyy):");//digite data checlout
            checkout = sdf.parse(sc.next());//reusa a variavel checkout


            reservation.UpdateDates(checkIn, checkout);//chama o metodo UpdateDates com parametros checkin e checkout

            System.out.println("reservation " + reservation);//printa reservation com o ToString()

        }
        catch (ParseException e ){
            System.out.println("invalid day format");//esse erro eu sei que pode acontecer
        }
        catch (DomainException e){//tratamos essa exececao com a msg personalizada
            System.out.println("error in reservation: "+ e.getMessage());
        }
        catch (RuntimeException e){//e essa com um erro inesperados
            System.out.println("unexpected error");
        }
        sc.close();


    }
}
