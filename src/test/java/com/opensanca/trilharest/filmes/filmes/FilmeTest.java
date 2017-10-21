package com.opensanca.trilharest.filmes.filmes;

import org.junit.Assert;
import org.junit.Test;

public class FilmeTest {

    @Test
    public void foraDeExibicaoSeDatasNulas(){

        //Preparação dos dados
        Filme filme = new Filme();
        //Processamento dos dados
        boolean resultado = filme.emExibicao();
        //Verificação
        Assert.assertFalse(resultado);

    }

}
