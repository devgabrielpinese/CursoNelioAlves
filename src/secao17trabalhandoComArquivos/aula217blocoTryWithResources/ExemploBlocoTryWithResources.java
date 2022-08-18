package secao17trabalhandoComArquivos.aula217blocoTryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploBlocoTryWithResources {
    public static void main(String[] args) {
        String path =  "C:\\Users\\gabri\\IdeaProjects\\NelioAlves\\text";

        //lancamos direto dentro do bloco try com parenteses
        // um BufferedReader br instaciamos BufferedReader com argumento ou parametro
        // uma nova instacia de FileReader com argumento ou parametro path
        //isso em vez de fazer separado como o outro exeplo, mandamos direto
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            //criamos a variavel para ler linha a linha com o while
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            // e tratamos a exception
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
