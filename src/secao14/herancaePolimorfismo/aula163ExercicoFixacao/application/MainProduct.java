package secao14.herancaePolimorfismo.aula163ExercicoFixacao.application;

import secao14.herancaePolimorfismo.aula163ExercicoFixacao.intities.ImportedProduct;
import secao14.herancaePolimorfismo.aula163ExercicoFixacao.intities.Product;
import secao14.herancaePolimorfismo.aula163ExercicoFixacao.intities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainProduct {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of products: ");
        int n = sc.nextInt();
        List<Product>listProd= new ArrayList<>();
        for (int i = 1; i <= n; i++){
            System.out.println("product #"+ i + " data:");
            System.out.print("common, used or import (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("price: ");
            double price= sc.nextDouble();
            if (ch=='c'){
                Product prod = new Product(name,price);
                listProd.add(prod);
            }else if (ch=='i'){
                System.out.print("custons Fee: ");
                double custonsFee= sc.nextDouble();
                Product prod = new ImportedProduct(name,price,custonsFee);
                listProd.add(prod);
            }else if (ch=='u'){
                System.out.print("manufacture date (dd/MM/yyyy): ");
                Date manufacture =sdf.parse(sc.next());
                Product prod = new UsedProduct(name,price,manufacture);
                listProd.add(prod);
            }else {

            }
        }
        System.out.println();
        for (Product prod :listProd) {
            System.out.println(prod.priceTag());

        }


        sc.close();

    }
}
