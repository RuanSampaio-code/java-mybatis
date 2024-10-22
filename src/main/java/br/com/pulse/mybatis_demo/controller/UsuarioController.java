package br.com.pulse.mybatis_demo.controller;

import br.com.pulse.mybatis_demo.model.Usuario;
import br.com.pulse.mybatis_demo.model.UsuarioDTO;
import br.com.pulse.mybatis_demo.service.UsuarioService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
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
    public UsuarioDTO findById(@Parameter(description = "ID do usuário") @PathVariable Long id) {
        return usuarioService.findById(id);
    }

    //Busca usuarios em um intervalo de idades
    @GetMapping("/idade/{min}/{max}")
    public List<UsuarioDTO> findUsersByAgeRange(@PathVariable int min, @PathVariable int max) {
        return usuarioService.findUsersByAgeRange(min, max);
    }
}
