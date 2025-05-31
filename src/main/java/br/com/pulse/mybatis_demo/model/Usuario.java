package br.com.pulse.mybatis_demo.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private int idade;

}
