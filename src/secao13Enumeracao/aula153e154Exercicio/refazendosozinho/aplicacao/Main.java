package secao13Enumeracao.aula153e154Exercicio.refazendosozinho.aplicacao;

import secao13Enumeracao.aula153e154Exercicio.refazendosozinho.entidades.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cliente data: ");
        System.out.print("nome: ");
        String nome = sc.next();
        System.out.print("email: ");
        String email = sc.next();
        System.out.print("data nascimento");
        Date dataNascimento = sdf.parse(sc.next());
        Cliente cliente = new Cliente(nome, email, dataNascimento);
        System.out.println("entre com dados do pedido");
        System.out.println("Status do Pedido: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.println("qual a quantidade de itens: ");
        int quantidadeItens = sc.nextInt();
        for (int i = 0; i < quantidadeItens; i++) {
            System.out.println("entre com os dados do produto");
            System.out.print("nome produto: ");
            String nomeProduto = sc.next();
            System.out.print("preco: ");
            double preco = sc.nextDouble();
            System.out.println("quantidade");
            int quatidade = sc.nextInt();
            Produto produto = new Produto(nomeProduto, preco);
            ItemPedido itemPedido = new ItemPedido(quatidade,preco,produto);
            pedido.addItem(itemPedido);


        }
        System.out.println();
        System.out.println(pedido);


        sc.close();
    }
}

