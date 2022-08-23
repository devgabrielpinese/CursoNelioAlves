package secao17trabalhandoComArquivos.aula221e222Exercicio.file1;



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
        System.out.println("entre com o caminho do arquivo que vai ler: ");


        String caminhodigitado= sc.nextLine();

        //tenho que fazer um novo objeto da classe File e instacialo do tipo File
        File caminhoArquivo=new File(caminhodigitado);

        String caminhoPasta = caminhoArquivo.getParent();//se nao riar objeto e instanciar nao consigo usar o getParent();

        //criei uma variavel boolena  que retorna um true ou false , se instanciou uma nova pasta no caminhoDigitado com o nome \\out
        //usando o mkdir(), que cria uma nova pasta
        boolean success = new File( caminhoPasta+"\\out").mkdir();

        System.out.println(caminhoPasta);

        //criei uma variavel como nome e endereco do arquivo
        String nomeArquivo= caminhoPasta+"\\out\\sumary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(caminhodigitado))){

            //recebe a linha lida com o metodo readLine
            String itemLinha= br.readLine();

            while (itemLinha!=null){
                //criei um vetor campoItem que recebe o itemLinha seprando os campos com o metodo split
                //cada vez que tiver uma virgula vai separar como uma posicao de um vetor
                //entao o vetor campoItem tem suas posicoes dependendo de quantas virgulas tem na linha
                String[] campoItem= itemLinha.split(",");

                String name= campoItem[0];//atribuimos o valor da posicao a variavel name

                //double price = campoItem[1];  nao podemos mandar direto pois está interpretando como String
                double price = Double.parseDouble(campoItem[1]);//forcamos com o metodo parseDouble

                //int quantity = caminhoArquivo[2];//nao podemos mandar tbm temos que forca
                int quantity= Integer.parseInt(campoItem[2]);

                //itemLinha recebe linha lida
                itemLinha=br.readLine();

            }
            //mandamos um BufferedWriter  com nome bw e
            // instanciamos ele com um FileWriter com o nomeArquivo como argumento
            //esse BufferedWriter e FileWriter servem para construir um novo arquivo
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))){

                for (Product item :listProd) {
                    //bw.write(item.getName()+","+item.total());  //aqui falta o format para o total
                    bw.write(item.getName()+","+String.format("%.2f",item.total()));
                    bw.newLine();//criamos uma nova linha pois ele não cria sozinho
                }
                System.out.println(nomeArquivo+" created");


            }catch (IOException e){
                System.out.println("error: " + e.getMessage());
            }





        }catch(IOException e ){
            System.out.println("error: " + e.getMessage());
        }












        sc.close();
    }
}
