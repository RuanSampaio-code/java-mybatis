package br.com.pulse.mybatis_demo.mapper;

import br.com.pulse.mybatis_demo.model.Usuario;
import br.com.pulse.mybatis_demo.model.UsuarioDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsuarioMapper {

    List<Usuario> findAllUsers();
    Usuario findById(@Param("id") Long id);
    List<Usuario> findUserBetweenAges(@Param("minIdade") int minIdade, @Param("maxIdade") int maxIdade);
    void insertUser(Usuario usuario);
    void updateUser(Usuario usuario);
}
