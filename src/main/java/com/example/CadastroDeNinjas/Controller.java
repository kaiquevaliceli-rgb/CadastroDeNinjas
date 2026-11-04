package com.example.CadastroDeNinjas;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class Controller {
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Seja bem vindo. Essa é minha primeira mensagem nesta rota.";
}




}
