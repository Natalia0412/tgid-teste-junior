package com.tgid.teste.junior.dto.cliente;

import com.tgid.teste.junior.utils.anottations.CpfCnpj;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteInserirDTO {
    @NotBlank(message = "O nome não pode estar em branco")
    private String nome;
    @Size(min = 11, max = 14)
    @CpfCnpj
    @NotBlank(message = "O cpf não pode estar em branco")
    private String cpf;
    @NotBlank(message = "O email não pode estar em branco")
    private String email;
}
