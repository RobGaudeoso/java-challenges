package br.com.buscadorcep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorDeArquivo {

    public void gerarArquivo(List listaDeEndereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter escritor = new FileWriter("enderecos.json");
        escritor.write(gson.toJson(listaDeEndereco));
        escritor.close();
    }
}
