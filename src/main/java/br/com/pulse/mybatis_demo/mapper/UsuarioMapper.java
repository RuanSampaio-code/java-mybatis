package br.com.pulse.mybatis_demo.mapper;

import br.com.pulse.mybatis_demo.model.Usuario;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsuarioMapper {

    Usuario findById(Long id);
}
