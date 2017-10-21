package com.opensanca.trilharest.filmes.filmes;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filmes")
public class FilmesAPI {

    @Autowired//essa anotaçao faz uma ligaçao automatica com uma anotaçao @Repository(entre outras anotaçoes)
    private FilmesRepository filmesRepository;

    @RequestMapping(path = "/em-exibicao", method = RequestMethod.GET)
    public Pagina<Filme> getEmExibicao(ParametrosDePaginacao parametrosDePaginacao){
        return filmesRepository.buscarPaginaEmExibicao(parametrosDePaginacao);
    }

}
