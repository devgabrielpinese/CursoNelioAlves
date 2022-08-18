package secao14.herancaePolimorfismo.aula158upcastDowncast.application;

import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.Account;
import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.BusinessAccount;
import secao14.herancaePolimorfismo.aula158upcastDowncast.entities.SavingAccount;

public class MainHeranca {
    public static void main(String[] args) {
        Account acc = new Account(1001,"alex",0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"maria",0.0,500.0);
        //com anotacoes


        //UpCast, uma sub classe sobe para uma super classe
        //classe account recebe uma BUsinessAccount que é uma subclasse dela mesma
        Account acc1 = bacc;

        Account acc2 =new BusinessAccount(1003,"jose",0.0,500.0);
        Account acc3 =new SavingAccount(1004,"roberto",0.0,.01);



        //DownCast uma subclasse recebe uma classe
        //classe BusinessAccount recebe uma account que é a classe super /
        //nesse caso vai dar erro e tem que fazer o cast manual

        BusinessAccount acc4 = (BusinessAccount)acc2;//cast manual que força o tipo da classe como BUsinessAccount
        acc4.loan(100.0);//nao da erro pq forcou o cast e agora da pra usar o metodo

        //BusinessAccount nao pode ser convertido em SavingAccount, vai dar esse erro e vai para o proximo if
        // o compilador nao sabe disso, tem que testar
        //BusinessAccount acc5=(BusinessAccount)acc3;//nao da eero de cara, mas compila da erro

        //tem que usar o if  com instanceof para vereficar o tipo da classe
        if (acc3 instanceof BusinessAccount){

            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("loan");
        }

        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.updatedBalence();
            System.out.println("update");
        }

    }
}
