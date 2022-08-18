package secao14.herancaePolimorfismo.aula166e167exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> listPessoas = new ArrayList<>();
        System.out.print("enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("tax payer #" + i + " data:");
            System.out.print("individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("anual income: ");
            double renda = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("gasto saude: ");
                double gastoCSaude = sc.nextDouble();
                listPessoas.add(new PessoaFisica(name, renda, gastoCSaude));
            } else {
                System.out.print("number employees: ");
                int numFunc = sc.nextInt();
                listPessoas.add(new PessoaJuridica(name, renda, numFunc));
            }
        }
        double total = 0;
        for (Contribuinte pessoa : listPessoas) {
            System.out.print(pessoa.getName() + ": $ ");
            System.out.printf("%.2f",pessoa.imposto());

            total += pessoa.imposto();
        }
        System.out.println();
        System.out.println("total taxes: $ " + total);


        sc.close();
    }

}
