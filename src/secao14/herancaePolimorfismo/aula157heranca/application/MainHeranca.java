package secao14.herancaePolimorfismo.aula157heranca.application;

import secao14.herancaePolimorfismo.aula157heranca.entities.Account;
import secao14.herancaePolimorfismo.aula157heranca.entities.BusinessAccount;

public class MainHeranca {
    public static void main(String[] args) {
        Account acc = new Account(1001,"alex",0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"maria",0.0,500.0);

        Account acc1 = bacc;

        Account acc2 =new BusinessAccount(1003,"jose",0.0,500.0);

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);




    }
}
