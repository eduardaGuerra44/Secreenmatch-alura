package br.com.alura.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        var filmeA = new Filme("A culpa é das estrelas", 2013);
        filmeA.avalia(8);
        var filmeB = new Filme("Barbie", 2023);
        filmeB.avalia(10);
        var filmeC = new Filme("Megatubarão 2", 2023);
        filmeC.avalia(9);
        var serie = new Serie("La Casa de Papel", 2017);


        var listaDeAssistidos = new ArrayList<Titulo>();
        listaDeAssistidos.add(filmeA);
        listaDeAssistidos.add(filmeC);
        listaDeAssistidos.add(filmeB);
        listaDeAssistidos.add(serie);


        for (Titulo item : listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme && filmeA.getClassificacao() > 2) {
                Filme filme = (Filme) item;
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }
    }
}
