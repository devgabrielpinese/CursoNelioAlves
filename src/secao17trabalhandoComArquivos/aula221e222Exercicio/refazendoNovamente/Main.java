package secao17trabalhandoComArquivos.aula221e222Exercicio.refazendoNovamente;

import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Produto> listProd = new ArrayList<>();
        System.out.println("enter com o caminho do arquivo");
        String caminhoDigitado = sc.nextLine();
        File caminho = new File(caminhoDigitado);
        String caminhoPasta = caminho.getParent();
        boolean pastaCriada = new File(caminhoPasta + "\\out").mkdir();
        if (pastaCriada == true) {
            System.out.println("created past: \n" + caminhoPasta);
        }
        String novoArquivo = caminhoPasta + "\\out\\sumary.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoDigitado))) {
            String itemLinha = br.readLine();
            while (itemLinha != null) {
                String[] campoDoItem = itemLinha.split(",");
                String name = campoDoItem[0];
                double price = Double.parseDouble(campoDoItem[1]);
                int quantity = Integer.parseInt(campoDoItem[2]);
                listProd.add(new Produto(name, price, quantity));
                itemLinha = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(novoArquivo))) {
                for (Produto item : listProd) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(novoArquivo + " created");
            } catch (IOException e) {
                System.out.println("error: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        sc.close();
    }
}
