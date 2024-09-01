package br.com.pulse.mybatis_demo.mapper;

import br.com.pulse.mybatis_demo.model.Usuario;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsuarioMapper {

    Usuario findUserById(int id);
    List<Usuario> findAllUsers();

}