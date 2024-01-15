package com.tgid.teste.junior.model.taxa;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name= "TB_TAXA", schema = "public")
public class Taxa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String tipo;
    @Column
    private Double valor;
//    @ManyToOne
//    @JoinColumn(name = "empresa_id")
//    private Empresa empresa;

}
