package br.com.pulse.mybatis_demo.model;

public record UsuarioDTO(int id,
                         String nome,
                         String email,
                         int idade) {


    public static UsuarioDTO fromUsuario(Usuario usuario) {
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getIdade());
    }
}
