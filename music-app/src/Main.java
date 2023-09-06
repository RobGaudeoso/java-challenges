import br.com.alura.musicapp.modelos.Musica;
import br.com.alura.musicapp.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        //Primeira reprodução
        Musica musica1 = new Musica();
        Podcast podcast1 = new Podcast();

        musica1.setTitulo("Fast Car");
        musica1.setArtista("Luke Combs");

        podcast1.setTitulo("Entrevista com Steve Jobs");
        podcast1.setCanal("Flow Podcast");

        musica1.reproduzir();
        System.out.println("Total de reproduções: " + musica1.getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + musica1.getCurtidas());
        musica1.setClassificacao();
        System.out.println("Classificação: " + musica1.getClassificacao());

        podcast1.reproduzir();
        System.out.println("Total de reproduções: " + podcast1.getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + podcast1.getCurtidas());
        podcast1.setClassificacao();
        System.out.println("Classificação: " + podcast1.getClassificacao());

        //Segunda reprodução
        musica1.reproduzir();
        System.out.println("Total de reproduções: " + musica1.getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + musica1.getCurtidas());
        musica1.setClassificacao();
        System.out.println("Classificação: " + musica1.getClassificacao());

        podcast1.reproduzir();
        System.out.println("Total de reproduções: " + podcast1.getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + podcast1.getCurtidas());
        podcast1.setClassificacao();
        System.out.println("Classificação: " + podcast1.getClassificacao());
    }
}