
import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;



public class Principal {
    public static void main(String[] args) {
        // instância
        Filme meuFilme = new Filme();

        meuFilme.setNome("A culpa é das estrelas");
        meuFilme.setAnoDeLancamento(2013);
        meuFilme.setDuracaoEmMinutos(130);
        meuFilme.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme();

        outroFilme.setNome("Barbie");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setIncluidoNoPlano(true);

      meuFilme.exibeFichaTecnica();
      meuFilme.avalia(8);
      meuFilme.avalia(10);
      meuFilme.avalia(5);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("la casa de papel");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }

}





