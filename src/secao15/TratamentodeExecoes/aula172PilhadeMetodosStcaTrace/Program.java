package secao15.TratamentodeExecoes.aula172PilhadeMetodosStcaTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();

        System.out.println("end of program, que está na classe program");
        /* como a exececao foi tratada o programa nao para
        caso contrario a exececao ia estourar e o programa parar,
        mostrando na tela essas exececoes
         */


    }


    public static void method1() {
        System.out.println(" method 1 star");

        method2();
        System.out.println("nethod 2 end");

    }
    public static void method2() {
        System.out.println(" method 2 star");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("input error");
            e.printStackTrace();
            sc.next();
        }
        sc.close();
        System.out.println("method2 end");
    }
}
