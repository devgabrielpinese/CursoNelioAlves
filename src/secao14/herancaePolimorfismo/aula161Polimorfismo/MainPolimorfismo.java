package secao14.herancaePolimorfismo.aula161Polimorfismo;


import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.Account;
import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.SavingAccount;

public class MainPolimorfismo {
    public static void main(String[] args) {

        Account x = new Account(1020,"alex",1000.0);
        Account y = new SavingAccount(1021, "maria",1000.0,0.01);
         x.withdraw(50.0);
         y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
