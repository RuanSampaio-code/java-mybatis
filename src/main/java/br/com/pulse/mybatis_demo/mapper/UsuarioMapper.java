package br.com.pulse.mybatis_demo.mapper;

import br.com.pulse.mybatis_demo.model.Usuario;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsuarioMapper {

    List<Usuario> findAllUsers();
    Usuario findById(@Param("id") Long id);
}
