package secao14.herancaePolimorfismo.aula165metodoAbstrato.application;

import secao14.herancaePolimorfismo.aula165metodoAbstrato.entities.Circle;
import secao14.herancaePolimorfismo.aula165metodoAbstrato.entities.Rectangle;
import secao14.herancaePolimorfismo.aula165metodoAbstrato.entities.Shape;
import secao14.herancaePolimorfismo.aula165metodoAbstrato.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape >list= new ArrayList<>();

        System.out.print("enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("shape #" + i + " data: ");
            System.out.print("rectangle or circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("color (BLACK/BLUE/GREEN): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.print("width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));

            }else{
                System.out.print("radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        for (Shape shape:list
             ) {
            System.out.printf("%.2f",shape.area());
        }








        sc.close();
    }
}
