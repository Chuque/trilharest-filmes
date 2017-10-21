package com.opensanca.trilharest.filmes.filmes;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class FilmeTest {

    @Test
    public void foraDeExibicaoSeDatasNulas(){
        //Preparação dos dados
        Filme filme = new Filme(null, null, null, null, null, null);

        //Processamento dos dados
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean resultado = filme.emExibicao(referencia);

        //Verificação dos resultados
        Assert.assertFalse(resultado);
    }

    @Test
    public void emExibicaoSeDentroDeIntervaloDeDatas(){
        //Preparação dos dados
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 1),
                LocalDate.of(2017, 10, 30)
        );

        //Processamento dos dados
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean resultado = filme.emExibicao(referencia);

        //Verificação dos resultados
        Assert.assertTrue(resultado);
    }

    @Test
    public void foraDeExibicaoSeForaDeIntervaloDeDatas(){
        //Preparação dos dados
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2016, 10, 1),
                LocalDate.of(2016, 10, 30)
        );

        //Processamento dos dados
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean resultado = filme.emExibicao(referencia);

        //Verificação dos resultados
        Assert.assertFalse(resultado);
    }

    @Test
    public void foraDeExibicaoSeInicioExibicaoNulo(){
        //Preparação dos dados
        Filme filme = new Filme(null, null, null, null,
                null,
                LocalDate.of(2016, 10, 30)
        );

        //Processamento dos dados
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean resultado = filme.emExibicao(referencia);

        //Verificação dos resultados
        Assert.assertFalse(resultado);
    }

    @Test
    public void foraDeExibicaoSeFimExibicaoNulo(){
        //Preparação dos dados
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2016, 10, 1),
                null
        );

        //Processamento dos dados
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean resultado = filme.emExibicao(referencia);

        //Verificação dos resultados
        Assert.assertFalse(resultado);
    }

    @Test
    public void emExibicaoSeInicioExatamenteHoje(){
        //Preparação dos dados
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 21),
                LocalDate.of(2017, 10, 22)
        );

        //Processamento dos dados
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean resultado = filme.emExibicao(referencia);

        //Verificação dos resultados
        Assert.assertTrue(resultado);
    }

    @Test
    public void emExibicaoSeFimExatamenteHoje(){
        //Preparação dos dados
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 20),
                LocalDate.of(2017, 10, 21)
        );

        //Processamento dos dados
        LocalDate referencia = LocalDate.of(2017, 10, 21);
        boolean resultado = filme.emExibicao(referencia);

        //Verificação dos resultados
        Assert.assertTrue(resultado);
    }
}
