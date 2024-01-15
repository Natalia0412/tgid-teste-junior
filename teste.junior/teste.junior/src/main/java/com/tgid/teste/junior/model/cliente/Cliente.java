package com.tgid.teste.junior.model.cliente;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;
@Data
@Entity
@Table(name= "TB_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name= "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cpf;
}
