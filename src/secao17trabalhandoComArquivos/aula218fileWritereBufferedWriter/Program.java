package secao17trabalhandoComArquivos.aula218fileWritereBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Program {
    public static void main(String[] args) {
        //vetror com valores
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        //variavel que recebe o local onde vai criar o arquivo
        String path =  "C:\\Users\\gabri\\IdeaProjects\\NelioAlves\\out.txt";

        //try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {//recria, zera e faz de novo

        //acrscenta arquivos a cada vez que rodar o programa
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {

            //for para percorrer o vetor
            for (String line : lines) {

                //bw.write(line ) para escrever a linha
                bw.write(line);

                //ele por padrao nao tem a quebra de linha entao mandamos um newLine()
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();//printamos o erro
        }
    }
}