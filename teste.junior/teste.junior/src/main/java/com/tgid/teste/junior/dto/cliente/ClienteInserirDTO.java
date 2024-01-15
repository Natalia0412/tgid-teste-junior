package com.tgid.teste.junior.dto.cliente;

import com.tgid.teste.junior.utils.anottations.CpfCnpj;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteInserirDTO {
    private String nome;
    @Size(min = 11, max = 14)
    @CpfCnpj
    private String cpf;
    private String email;
}
