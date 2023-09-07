package br.com.alura.appcompras.principal;

import br.com.alura.appcompras.modelos.Cartao;
import br.com.alura.appcompras.modelos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();
        Cartao cartao = new Cartao();
        Produto produto = new Produto();
        int i = 1;

        System.out.println("Digite o limite do cartão: ");
        cartao.setLimite(leitor.nextDouble());

        while (i == 1 && cartao.getLimite() > produto.getPreco()) {

            System.out.println("Digite o produto a ser comprado: ");
            produto.setNome(leitor.next());

            System.out.println("Digite o valor do produto: ");
            produto.setPreco(leitor.nextDouble());
            System.out.println(produto.getPreco());

            if (produto.getPreco() < cartao.getLimite()) {
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
            }

            lista.add(produto);

            System.out.println("Digite 0 para sair ou 1 para continuar");
            i = leitor.nextInt();

        }
    }
}