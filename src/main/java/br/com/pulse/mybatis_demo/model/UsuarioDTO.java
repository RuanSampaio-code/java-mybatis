package br.com.pulse.mybatis_demo.model;


import lombok.*;

@Builder
public record UsuarioDTO(

        String nome,
        String email,
        int idade
) {

    public static UsuarioDTO fromUsuario(Usuario usuario) {
        return new UsuarioDTO(usuario.getNome(), usuario.getEmail(), usuario.getIdade());
    }
}
