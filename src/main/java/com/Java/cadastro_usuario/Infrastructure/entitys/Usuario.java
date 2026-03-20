package com.Java.cadastro_usuario.Infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;
import org.yaml.snakeyaml.events.Event;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity


public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name= "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;

}
