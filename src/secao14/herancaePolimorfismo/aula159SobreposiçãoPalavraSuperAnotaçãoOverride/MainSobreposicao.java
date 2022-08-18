package secao14.herancaePolimorfismo.aula159SobreposiçãoPalavraSuperAnotaçãoOverride;


import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.Account;
import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.SavingAccount;

public class MainSobreposicao {
    public static void main(String[] args) {
        Account acc = new Account(1001,"alex",1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc1= new SavingAccount(1002, "maria",1000.0,0.01);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
    }
}
