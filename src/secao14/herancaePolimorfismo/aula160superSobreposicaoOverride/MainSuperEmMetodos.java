package secao14.herancaePolimorfismo.aula160superSobreposicaoOverride;


import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.Account;
import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.BusinessAccount;
import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.SavingAccount;

public class MainSuperEmMetodos {
    public static void main(String[] args) {
        Account acc = new Account(1001,"alex",1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc1= new SavingAccount(1002, "maria",1000.0,0.01);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());


        //metodo @Override super
        Account acc2 = new BusinessAccount(1003,"roberto",1000.0,200.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
    }
}
