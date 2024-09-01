package br.com.pulse.mybatis_demo.controller;

import br.com.pulse.mybatis_demo.model.Usuario;
import br.com.pulse.mybatis_demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Long id) {
        System.out.println(id);
        return usuarioService.findUserById(id);
    }

}
