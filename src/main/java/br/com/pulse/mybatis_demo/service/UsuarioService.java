package br.com.pulse.mybatis_demo.service;

import br.com.pulse.mybatis_demo.mapper.UsuarioMapper;
import br.com.pulse.mybatis_demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public UsuarioMapper usuarioMapper;

    @Autowired
    public UsuarioService(UsuarioMapper usuarioMapper) {
        this.usuarioMapper = usuarioMapper;
    }

    public Usuario findUserById(Long id) {
        return usuarioMapper.findById(id);
    }


}
