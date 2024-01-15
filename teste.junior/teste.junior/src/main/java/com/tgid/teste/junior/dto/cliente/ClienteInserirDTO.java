package com.tgid.teste.junior.dto.cliente;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteInserirDTO {
    private String nome;
    private String cpf;
    private String email;
}
