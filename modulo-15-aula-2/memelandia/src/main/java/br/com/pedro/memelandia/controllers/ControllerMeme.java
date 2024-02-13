package br.com.pedro.memelandia.controllers;

import br.com.pedro.memelandia.dto.MemeDTO;
import br.com.pedro.memelandia.entities.Meme;
import br.com.pedro.memelandia.services.ServicoMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/memes")
public class ControllerMeme {

    @Autowired
    private ServicoMeme servicoMeme;

    @GetMapping
    public Iterable<MemeDTO> buscaMemes() {
        return servicoMeme.encontrarTodos();
    }

    @PostMapping
    public MemeDTO novoMeme(@RequestBody MemeDTO meme) {
        return servicoMeme.criarNovoMeme(meme);
    }
}