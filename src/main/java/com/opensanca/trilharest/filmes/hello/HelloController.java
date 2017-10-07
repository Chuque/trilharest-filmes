package com.opensanca.trilharest.filmes.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/*
@Controller//define essa classe como um bean no spring, porem os metodos precisam retornar um template ou eles devem ser anotados com @RespondeBody
@RequestMapping("/hello")//mapeia essa classe na url /hello
public class HelloController {

    @RequestMapping(path = "", method = {RequestMethod.GET})
    public @ResponseBody String hello(){
        return "Ola!";
    }

}
*/
@RestController//define essa classe como um controller REST, que faz com que voce nao precise ficar adicionando @RespondeBody nos metodos que retornam plaintext
@RequestMapping("/hello")//mapeia essa classe na url /hello
public class HelloController {

    @RequestMapping(path = "", method = {RequestMethod.GET})
    public String hello(){
        return "Ola!";
    }

}