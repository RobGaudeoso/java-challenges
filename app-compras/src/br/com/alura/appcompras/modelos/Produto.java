package br.com.alura.appcompras.modelos;

import java.util.Scanner;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;
    private Scanner leitor = new Scanner(System.in);

    public Produto() {
        System.out.println("Digite o produto a ser comprado: ");
        this.nome = this.leitor.next();
        System.out.println("Digite o valor do produto: ");
        this.preco = this.leitor.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.preco;
    }

    @Override
    public int compareTo(Produto novoProduto) {
        if (this.getPreco() < novoProduto.getPreco()) {
            return -1;
        } else if (this.getPreco() > novoProduto.getPreco()) {
            return 1;
        } else {
            return this.getNome().compareTo(novoProduto.getNome());
        }
        //return Double.valueOf(this.getPreco()).compareTo(Double.valueOf(novoProduto.getPreco()));
    }
}
