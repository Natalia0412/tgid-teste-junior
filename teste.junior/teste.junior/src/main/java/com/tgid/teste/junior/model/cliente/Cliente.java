package com.tgid.teste.junior.model.cliente;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name= "TB_CLIENTE", schema = "public")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String email;
//    @ManyToMany
//    @JoinTable(name= "cliente_empresa",
//            joinColumns = @JoinColumn(name = "cliente_id"),
//            inverseJoinColumns = @JoinColumn(name = "empresa_id"))
//    private List<Empresa> empresas;

}
