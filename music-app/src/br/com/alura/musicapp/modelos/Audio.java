package br.com.alura.musicapp.modelos;

import java.util.Scanner;

public class Audio {

    private String titulo;
    private String genero;
    private int duracao;
    private float totalDeReproducoes;
    private float curtidas;
    private float classificacao;
    private Scanner leitor = new Scanner(System.in);

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public float getCurtidas() {
        return curtidas;
    }

    public void setCurtidas() {
        System.out.println("Eaí? Curtiu? sim ou não");
        String leitura = leitor.next();
        if (leitura.equals("sim")) {
            curtidas++;
        }
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao() {
        classificacao = (curtidas / totalDeReproducoes) * 100;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo áudio...");
        totalDeReproducoes++;
        setCurtidas();
    }
}
