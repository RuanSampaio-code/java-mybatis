package br.com.pulse.mybatis_demo.service;

import br.com.pulse.mybatis_demo.mapper.UsuarioMapper;
import br.com.pulse.mybatis_demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private UsuarioMapper usuarioMapper;

    @Autowired
    public UsuarioService(UsuarioMapper usuarioMapper) {
        this.usuarioMapper = usuarioMapper;
    }

    public List<Usuario> findAllUsers() {
        return usuarioMapper.findAllUsers();
    }

    public Usuario findById(Long id) {
        Usuario usuario = usuarioMapper.findById(id);
        return usuario;
    }
}
