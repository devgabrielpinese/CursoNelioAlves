package secao17trabalhandoComArquivos.aula221e222Exercicio;

import java.awt.event.TextEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> listProd = new ArrayList<>();
        //pede para digitar o cminho do arquivo
        System.out.println("enter file path: ");
        //variavel para receber ovalor digitado desse caminho
        String sourceFileStr = sc.nextLine();
        //outra variavel somente para organiazr que recebe o valor da pirmeira varivel com valor digitado
        File sourceFile = new File(sourceFileStr);
        //variavel que vai receber somente o caminho da pasta e nao do arquivo
        String sourceFolderStr = sourceFile.getParent();

        System.out.println(sourceFolderStr);
        //cria uma nova pasta com nome out
        boolean success = new File(sourceFolderStr + "\\out ").mkdir();
        //System.out.println("folder created: "+ success);

        //caminho para criar um novo arquivo que eu vou criar
        String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";

        // try para ver se da uma exception,
        // e mandamos um BufferedReader para acelerar o FileReader que é usado para ler arquivos
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            //craimos uma variavel itemCvs que recebe a variavel da BufferedReader
            String itemCvs = br.readLine();
            //fizemos um loop para enquanto i itemCvs nao for nulo
            while (itemCvs != null) {
                //criaos um vetor fields para a linha que recebe itemCvs.split(",")
                // que vai separar os itens toda vez que tiver um ","
                String[] fields = itemCvs.split(",");
                //outra variavel name para ocupuar a posicao [0];
                String name = fields[0];
                //outra variavel para oucpar a posicao [1]que originalmente era uma String
                //e forcamos a ser um double com o metodo Double.parseDouble()com argumento o valor da poisicao[1]
                double price = Double.parseDouble(fields[1]);
                //outra variavel para oucpar a posicao [1]que originalmente era uma String
                //e forcamos a ser um int com o metodo Integer.parseInt()com argumento o valor da poisicao[2]
                int quatity = Integer.parseInt(fields[2]);
                //metodo para adicionar a lista , com argumento onde ja instaciamos um new Product com seus atributos
                listProd.add(new Product(name, price, quatity));
                //itemCvs recebe a linha lida e passa para a proxima enquanto nao for nulo
                itemCvs = br.readLine();
            }
            //um outro try caso haja exception,
            // e mandamos um BufferedWriter par acelerar o Filewriter que constroi um arquivo numa determinada pasta
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                //um foreach dentro do try aninhado, só que no BufferedWriter que constroi,
                // passando item por item da list que fizemos no try de cima
                //só que nesse só vamos usar o name e o total para constriur, usando o getName() + total()
                for (Product item : listProd) {
                    bw.write(item.getName()+","+String.format("%.2f",item.total()));
                    //temos que mandar um newLine() pois ele controi uma nova linha ou pula para a proxima
                    bw.newLine();
                }
                //printa a caminho do arquivo que acabamos de criar e uma palavra de confirmacao de criada
                System.out.println(targetFileStr+" created");
            //catch que vai printar a mensagem de erro padrao
            } catch (IOException e) {
                System.out.println("error: " + e.getMessage());
            }

            //catch que vai printar a mensagem de erro padrao
        } catch (IOException e) {
            System.out.println("error writing file: " + e.getMessage());
        }


        sc.close();
    }
}
