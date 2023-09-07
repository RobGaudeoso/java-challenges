package br.com.alura.appcompras.principal;

import br.com.alura.appcompras.modelos.Cartao;
import br.com.alura.appcompras.modelos.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 1;

        Cartao cartao = new Cartao();

        while (i == 1 && cartao.getSaldo() != 0) {
            Produto produto = new Produto();

            if (produto.getPreco() <= cartao.getSaldo()) {
                cartao.adicionaProduto(produto);
            } else {
                System.out.println("Saldo insuficiente!");
            }
            if (cartao.getSaldo() == 0) {
                System.out.println("Não há saldo para mais compras!");
            } else {
                System.out.println("Digite 0 para sair ou 1 para continuar");
                i = leitor.nextInt();
            }
        }

        System.out.println("""
                ***************************
                COMPRAS REALIZADAS:
                """);
        for (Produto produto:
                cartao.getFatura()) {
            System.out.println(produto);
        }
        System.out.println("""
                
                ***************************
                
                Saldo do cartão: """ + cartao.getSaldo() + """
                """);
    }
}