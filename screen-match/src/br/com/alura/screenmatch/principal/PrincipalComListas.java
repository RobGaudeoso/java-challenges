package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);
        var filmeDoRob = new Filme("Top Gun", 2022);
        filmeDoRob.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoRob);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPeloArtista = new ArrayList<>();
        buscaPeloArtista.add("Adam Sandler");
        buscaPeloArtista.add("Tom Cruise");
        buscaPeloArtista.add("The Rock");
        System.out.println(buscaPeloArtista);

        Collections.sort(buscaPeloArtista);
        System.out.println("Depois da ordenação: "+ buscaPeloArtista);

        Collections.sort(lista);
        System.out.println("Depois da ordenação: "+ lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Depois da ordenação: "+ lista);
    }
}
