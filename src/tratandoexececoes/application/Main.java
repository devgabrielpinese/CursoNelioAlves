package tratandoexececoes.application;

import tratandoexececoes.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ParseException {
        //throws ParseException meu metodo pode lancar essa exececao , ela vai ser propagada.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("room number");
        int number = sc.nextInt();
        System.out.print("check-in date (dd/MM/yyyy):  ");
        //sdf.parse da uma exeception  trata ela com o traycath ou propaga com throws ParseException
        Date checkIn = sdf.parse(sc.next());
        System.out.print("checkout date (dd/MM/yyyy):");
        Date checkout = sdf.parse(sc.next());

        //se checkout nao depois de checkin printa a frase error
        if (!checkout.after(checkIn)) {
            System.out.println("error in reservation: check-out date must be after checkin date ");
        } else {
            //cria o objeto da classe reservation e instancia na classe reservation com parametros do contrutor number, chechin , checkout
            Reservation reservation = new Reservation(number, checkIn, checkout);
            //printa reservation com o ToString() feito na classe
            System.out.println("reservation " + reservation);
            System.out.println();


            System.out.print("check-in date (dd/MM/yyyy):  ");//digite data de checkin
            checkIn = sdf.parse(sc.next());//reusa a variavel checkin
            System.out.print("checkout date (dd/MM/yyyy):");//digite data checlout
            checkout = sdf.parse(sc.next());//reusa a variavel checkout


            String error = reservation.UpdateDates(checkIn, checkout);//chama o metodo UpdateDates com parametros checkin e checkout
            if (error != null) {
                System.out.println("error in reservation: " + error);
            } else {
                System.out.println("reservation " + reservation);//printa reservation com o ToString()
            }
            sc.close();
        }

    }
}
