package secao17trabalhandoComArquivos.aula219manipulandoPastasComFile;

import java.io.File;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");

        //variavel que vai receber o caminnho da pasta
        String strPath = sc.nextLine();

        //cria e instancia a varivel em File
        File path = new File(strPath);

        //cria um vetor  que recebe essa variavel chamando a funcao listFiles(que essa chama uma funcao
        // que filtar os arquivo pegando somente os diretorios, pastas)com isDirectory
        //esse dois pontos é referenc metods que referencia metodo
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS:");

        for (File folder : folders) {//for para percorrer esse vetor
            System.out.println(folder);

        }//aqui é a mesma coisa so que com arquivos com o isFile
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);

        }//vamos criar uma subpasta a partir d pasta que for digitada
        //criamos uma variavel boolean que retorna true or false, se deu certo ou nao, é bem opcional da pra ir direto tbm
        //instaciamos a variavel que passamos la em cima strPath
        //e concatenamos com o nome que quisermos, o nome da pasta
        //e usamos o .mkdir para criaar essa subpasta
        boolean success = new File(strPath + "\\subdir").mkdir();

        //printa e concatena a variavel para retornar o true or false
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
