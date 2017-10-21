package com.opensanca.trilharest.filmes.filmes;

import com.opensanca.trilharest.filmes.FilmesApplication;
import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/filmes")//todas as requisições que baterem em /filmes vão cair nesse método
public class FilmesAPI {

    @Autowired//essa anotaçao faz uma ligaçao automatica com uma anotaçao @Repository(entre outras anotaçoes)
    private FilmesRepository filmesRepository;

    //sem Spring a linha de código acima ficaria como abaixo. Isso quebraria a Onion Architecture,
    //pois criaria uma dependencia da camada repositório na camada API. Sem Spring é impossível que as duas camadas
    //fiquem independentes:
    //private FilmesRepositoryRAM = new FilmesRepository();

    //isso é uma action do caminho /filmes
    //http://localhost:8080/filmes/em-exibicao?pagina=1&tamanhoDaPagina=3
    @RequestMapping(path = "/em-exibicao", method = RequestMethod.GET)
    public Pagina<Filme> getEmExibicao(ParametrosDePaginacao parametrosDePaginacao){
        if(parametrosDePaginacao == null){
            parametrosDePaginacao = new ParametrosDePaginacao();
        }
        return this.filmesRepository.buscarPaginaEmExibicao(parametrosDePaginacao);
    }

    //isso é outra action do caminho /filmes
    @GetMapping("/{id}")
    public Filme getPorId(@PathVariable UUID id) {
        return this.filmesRepository.buscarPorId(id);
    }



}
