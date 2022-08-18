package secao17trabalhandoComArquivos.aula216fileReaderAndBufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo {
    public static void main(String[] args) {

        //variavel String recebe o arquivo
        String path = "C:\\Users\\gabri\\IdeaProjects\\NelioAlves\\text";

        //criamo uma variavel br da classe BufferedReader com valor null
        BufferedReader br = null;

        //criamos uma variavel fr da classe FileReader com valor null
        FileReader fr = null;

        try {//abriamos um try pois sabiamos que ia gerar uma exception
            //instaciamos a fr usando path como paramentro
            fr = new FileReader(path);

            //instanciamos a br usando a fr como paramentro, um puxando, usando o outro
            br = new BufferedReader(fr);

            //criamos uma variavle line que recebe br.readline(); um metodo para ler uma linha, se o arquivo estever no final ele retorna null
            String line = br.readLine();

            while (line != null) {//fazemos um while dierente de null, ele leu comsucesso a linha
                //printa line, linha lida
                System.out.println(line);

                //e novamente le a proxima linha
                line = br.readLine();
            }


        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        } finally {

            try {//um outro try para finally pois br.close(); vai dar exception
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }catch (IOException e ){

                e.printStackTrace();//e se der erro nos vaor printar ele
            }
        }

    }
}
