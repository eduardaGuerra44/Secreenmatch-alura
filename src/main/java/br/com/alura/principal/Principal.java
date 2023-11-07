package br.com.alura.principal;

import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        // instância
        var filmeA = new Filme("A culpa é das estrelas",2013);
        filmeA.setDuracaoEmMinutos(130);
        filmeA.setIncluidoNoPlano(true);

        var filmeB = new Filme("Barbie", 2023);
        filmeB.setDuracaoEmMinutos(150);
        filmeB.setIncluidoNoPlano(true);

        var filmeC = new Filme("Megatubarão 2", 2023);
        filmeC.setDuracaoEmMinutos(190);
        filmeC.setIncluidoNoPlano(false);

      filmeA.exibeFichaTecnica();
      filmeA.avalia(8);
      filmeA.avalia(10);
      filmeA.avalia(5);

        System.out.println("Total de avaliações: " + filmeA.getTotalDeAvaliacoes());
        System.out.println(filmeA.pegaMedia());


        var serie = new Serie("La Casa de Papel", 2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);

        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);


        var calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeA);
        calculadora.inclui(filmeB);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtra(filmeA);

        var episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("la casa de papel");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

       var listaDeFilmes = new ArrayList<Filme>();
        listaDeFilmes.add(filmeA);
        listaDeFilmes.add(filmeC);
        listaDeFilmes.add(filmeB);

        System.out.println("Tamanho da lista "+ listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

      

    }

}





