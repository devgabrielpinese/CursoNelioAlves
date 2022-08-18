package secao17trabalhandoComArquivos.aula215lendoarquivosTxtComFileeScanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrimeiroExemplo {
    public static void main(String[] args) {
        //criamos uma variavel da classe File e instaciamos ela na classe file, atribuimos a ela o endereço de um arquivo
        File file = new File("C:\\Users\\gabri\\IdeaProjects\\NelioAlves\\text");

        //criamos uma variavel sc da classe Scanner que agora recebe null
        Scanner sc = null;

        try{//lancamos um atry pq ja sabiamos que iria dar excecao
            //atribuimos o valor da variavel file a sc
            sc= new Scanner(file);

            //lancamos um lop para verificar sc.NextLine(), se tem uma nova linha no arquivo
            while (sc.hasNextLine()){

                //se sim impreme essa linha
                System.out.println(sc.nextLine());
            }
        }
        //lancamos a excecao IOexception como e, com uma frase error + e.getMessage()
        catch (IOException e ){
            System.out.println("error: "+ e.getMessage());
        }
        //colocamos um finally para fechar o sc com sc.close se sc.for diferente de null
        finally {
            if (sc !=null){
                sc.close();
            }
        }
    }
}
