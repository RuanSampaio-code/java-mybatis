package br.com.pulse.mybatis_demo.service;


import br.com.pulse.mybatis_demo.mapper.UsuarioMapper;
import br.com.pulse.mybatis_demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioMapper usuarioMapper;

    @Autowired
    public UsuarioService(UsuarioMapper usuarioMapper) {
        this.usuarioMapper = usuarioMapper;
    }

    public Usuario findUserById(int id) {
        return usuarioMapper.findUserById(id);
    }

    public List<Usuario> findAllUsers() {
        return usuarioMapper.findAllUsers();
    }
}
