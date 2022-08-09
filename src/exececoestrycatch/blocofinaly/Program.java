package exececoestrycatch.blocofinaly;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            System.out.println(sc.nextLine());

        } catch (FileNotFoundException e) {
            System.out.println("error opening file : " + e.getMessage());
            ;
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
