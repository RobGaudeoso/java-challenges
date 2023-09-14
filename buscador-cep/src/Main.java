import br.com.buscadorcep.Buscador;
import br.com.buscadorcep.Endereco;
import br.com.buscadorcep.GeradorDeArquivo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = " ";
        Buscador buscador = new Buscador();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        List<Endereco> listaEndereco = new ArrayList<>();

        while (!(input.equalsIgnoreCase("sim"))) {
            input = JOptionPane.showInputDialog("Digite o CEP:");

            try {
                String json = buscador.buscarCep(input);

                Endereco endereco = gson.fromJson(json, Endereco.class);

                listaEndereco.add(endereco);

                input = JOptionPane.showInputDialog("Deseja sair? SIM ou NÃO.");
            } catch (RuntimeException e) {
                System.out.println("Não consegui encontrar o endereco a partir desse CEP\n" +
                        "Finalizando a aplicação");
                break;
            }
        }
        GeradorDeArquivo gerador = new GeradorDeArquivo();
        gerador.gerarArquivo(listaEndereco);
    }
}