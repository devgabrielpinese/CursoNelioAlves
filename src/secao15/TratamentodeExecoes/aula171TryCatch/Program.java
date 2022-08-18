package secao15.TratamentodeExecoes.aula171TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //exemplo dando erro e excecoes
        /*String[]vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);*/
        //tratamento com trycatch,
        try{
            String[]vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("invalid position!");
        }
        catch(InputMismatchException e ){
            System.out.println("input error");
        }
        System.out.println("end of program");

        sc.close();
    }
}
