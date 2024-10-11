package br.com.pulse.mybatis_demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Usuario {

    private int id;
    private String nome;
    private String email;
}
