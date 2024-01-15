package com.tgid.teste.junior.dto.taxa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TaxaInsertDTO {
    @NotBlank(message = "O tipo não pode estar em branco")
    private String tipo;
    @NotNull(message = "O valor não pode estar em branco")
    private Double valor;
}
