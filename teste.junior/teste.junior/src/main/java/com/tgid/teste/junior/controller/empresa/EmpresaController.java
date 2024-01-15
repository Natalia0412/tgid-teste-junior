package com.tgid.teste.junior.controller.empresa;

import com.tgid.teste.junior.dto.empresa.EmpresaInserirDTO;
import com.tgid.teste.junior.dto.empresa.EmpresaRespostaDTO;
import com.tgid.teste.junior.service.empresa.EmpresaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;
    @PostMapping()
    public ResponseEntity<EmpresaRespostaDTO> inserirEmpresa(@RequestBody @Valid EmpresaInserirDTO empresaInserirDTO) {
        EmpresaRespostaDTO dtoRes = empresaService.criarEmpresa(empresaInserirDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(dtoRes);
    }
}
