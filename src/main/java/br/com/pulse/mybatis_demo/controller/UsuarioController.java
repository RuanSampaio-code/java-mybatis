package br.com.pulse.mybatis_demo.controller;

import br.com.pulse.mybatis_demo.model.Usuario;
import br.com.pulse.mybatis_demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
       this.usuarioService = usuarioService;
    }

    @GetMapping("/{id}")
    public Usuario findUserById(int id) {
        return usuarioService.findUserById(id);
    }


    @GetMapping
    public List<Usuario> findAllUsers() {
        return usuarioService.findAllUsers();
    }

}
