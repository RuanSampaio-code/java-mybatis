package br.com.pulse.mybatis_demo.service;

import br.com.pulse.mybatis_demo.mapper.UsuarioMapper;
import br.com.pulse.mybatis_demo.model.Usuario;
import br.com.pulse.mybatis_demo.model.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private UsuarioMapper usuarioMapper;
    private Usuario usuario;

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

    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        usuario = Usuario.builder()
                .nome(usuarioDTO.nome())
                .email(usuarioDTO.email())
                .idade(usuarioDTO.idade())
                .build();
        usuarioMapper.insertUser(usuario);

        return usuarioDTO;

    }

    public UsuarioDTO update(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.findById(id);

        if (usuario == null) {
            throw new RuntimeException("Usuário não encontrado com id: " + id);
        }

        usuario.setNome(usuarioDTO.nome());
        usuario.setEmail(usuarioDTO.email());

        usuarioMapper.updateUser(usuario);

        return UsuarioDTO.fromUsuario(usuario);
    }

    public List<UsuarioDTO> findUsersByAgeRange(int min, int max) {

        return usuarioMapper.findUserBetweenAges(min, max)
                .stream()
                .map(UsuarioDTO::fromUsuario)
                .collect(Collectors.toList());

    }
}
