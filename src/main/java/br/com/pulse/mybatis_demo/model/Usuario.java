package br.com.pulse.mybatis_demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor


public class Usuario {

    private Long id;
    private String login;
    private String senha;
}
