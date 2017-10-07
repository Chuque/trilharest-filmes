package com.opensanca.trilharest.filmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration //essa anotaçao faz com que o springboot tome as decisoes sobre as configuraçoes do projeto
@ComponentScan //faz com que o spring procure controllers no diretorio e subdiretorios
public class FilmesApplication {

    public static void main(String[] args) {
        //System.out.println("Teste");
        SpringApplication.run(FilmesApplication.class, args);//Projetos springboot sempre começam dessa forma. aqui e ponto de entrada da aplicaçao
    }

}
