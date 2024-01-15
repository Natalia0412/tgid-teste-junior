package com.tgid.teste.junior.model.empresa;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "TB_EMPRESA", schema = "public")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cnpj;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private double saldo;
//    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
//    private List<Taxa> taxas = new ArrayList<>();
//    @ManyToMany(mappedBy = "empresas")
//    private List<Cliente> clientes;
}
