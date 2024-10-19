package br.com.pulse.mybatis_demo.service;

import br.com.pulse.mybatis_demo.mapper.UsuarioMapper;
import br.com.pulse.mybatis_demo.model.Usuario;
import br.com.pulse.mybatis_demo.model.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private UsuarioMapper usuarioMapper;

    @Autowired
    public UsuarioService(UsuarioMapper usuarioMapper) {
        this.usuarioMapper = usuarioMapper;
    }


    public List<UsuarioDTO> findAllUsers() {
        return usuarioMapper.findAllUsers()
                .stream()
                .map(UsuarioDTO::fromUsuario) // Certifique-se de que a referência do método esteja correta
                .collect(Collectors.toList());
    }

    public UsuarioDTO findById(Long id) {
        Usuario usuario = usuarioMapper.findById(id);
        UsuarioDTO userDTO = UsuarioDTO.fromUsuario(usuario);
        return userDTO;
    }

    public List<UsuarioDTO> findUsersByAgeRange(int min, int max) {

        return usuarioMapper.findUserBetweenAges(min, max)
                .stream()
                .map(UsuarioDTO::fromUsuario)
                .collect(Collectors.toList());

    }
}
