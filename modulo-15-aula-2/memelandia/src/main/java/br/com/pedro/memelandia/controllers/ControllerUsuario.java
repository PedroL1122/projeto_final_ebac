package br.com.pedro.memelandia.controllers;

import br.com.pedro.memelandia.dto.NovoUsuarioDTO;
import br.com.pedro.memelandia.services.ServicoNovoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "usuarios")
public class ControllerUsuario {

    @Autowired
    private ServicoNovoUsuario servicoNovoUsuario;

    @GetMapping
    public Iterable<NovoUsuarioDTO> encontrarTodos(){
        return servicoNovoUsuario.encontrarTodos();
    }

    @PostMapping
    public NovoUsuarioDTO criarUsuario(@RequestBody NovoUsuarioDTO usuario){

        return servicoNovoUsuario.criarNovoUsuario(usuario);
    }
}
