package br.com.alura.appcompras.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cartao {
    private double limite;
    private double saldo;
    private Scanner leitor = new Scanner(System.in);
    private List<Produto> fatura = new ArrayList<>();

    public Cartao() {
        System.out.println("Digite o limite do cartão: ");
        this.limite = this.leitor.nextDouble();
        this.saldo = this.limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionaProduto(Produto novoProduto) {
        System.out.println("Compra realizada!");
        this.fatura.add(novoProduto);
        Collections.sort(this.fatura);
        this.setSaldo(this.getSaldo() - novoProduto.getPreco());
    }

    public List<Produto> getFatura() {
        return fatura;
    }
}
