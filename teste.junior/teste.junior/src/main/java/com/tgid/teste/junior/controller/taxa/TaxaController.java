package com.tgid.teste.junior.controller.taxa;

import com.tgid.teste.junior.dto.taxa.TaxaInsertDTO;
import com.tgid.teste.junior.dto.taxa.TaxaRespostaDTO;
import com.tgid.teste.junior.service.taxa.TaxaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/taxa")
public class TaxaController {
    @Autowired
    private TaxaService taxaService;
    @PostMapping()
    public ResponseEntity<TaxaRespostaDTO> inserirTaxa(@RequestBody TaxaInsertDTO taxaInsertDTO){
        TaxaRespostaDTO dtoRes= taxaService.criarTaxa(taxaInsertDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body(dtoRes);
    }
}
