package br.com.pulse.mybatis_demo.controller;

import br.com.pulse.mybatis_demo.model.UsuarioDTO;
import br.com.pulse.mybatis_demo.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@Tag(name = "open-ai")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<UsuarioDTO> findAllUsers(){
        return usuarioService.findAllUsers();
    }

    @GetMapping("/{id}")
    public UsuarioDTO findById(@PathVariable Long id) {
        return usuarioService.findById(id);
    }

    @PostMapping
    public UsuarioDTO save(@RequestBody UsuarioDTO usuarioDTO) {
        usuarioService.save(usuarioDTO);
        return usuarioDTO;
    }

    @PutMapping("/{id}")
    public UsuarioDTO update(@PathVariable Long id, @RequestBody UsuarioDTO usuarioDTO) {
        usuarioService.update(id, usuarioDTO);
        return usuarioDTO;
    }


    //Busca usuarios em um intervalo de idades
    @GetMapping("/idade/{min}/{max}")
    public List<UsuarioDTO> findUsersByAgeRange(@PathVariable int min, @PathVariable int max) {
        return usuarioService.findUsersByAgeRange(min, max);
    }
}
