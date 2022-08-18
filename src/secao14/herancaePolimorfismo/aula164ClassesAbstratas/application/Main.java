package secao14.herancaePolimorfismo.aula164ClassesAbstratas.application;



import secao14.herancaePolimorfismo.aula164ClassesAbstratas.entities.Accounts;
import secao14.herancaePolimorfismo.aula164ClassesAbstratas.entities.BusinessAccounts;
import secao14.herancaePolimorfismo.aula164ClassesAbstratas.entities.SavingAccounts;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Accounts>listAcc= new ArrayList<>();

        listAcc.add(new BusinessAccounts(1001,"alex",1000.0,0.01));
        listAcc.add(new BusinessAccounts(1002,"maria",5000.0,0.01));
        listAcc.add(new SavingAccounts(1003,"bob",200.0,400.0));
        listAcc.add(new SavingAccounts(1004,"renato",2600.0,400.0));

        double sum =0;
        for (Accounts acc:listAcc
             ) {
            sum+=acc.getBalance();
        }
        System.out.printf("total balance : %.2f%n", sum);

        System.out.println();
        for (Accounts acc :
                listAcc) {
            acc.deposit(10.0);
            System.out.printf("update balance for account %d: %.2f%n", acc.getNumber(),acc.getBalance());
        }




        sc.close();
    }
}
