package com.tgid.teste.junior.service.taxa;

import com.tgid.teste.junior.dto.taxa.TaxaInsertDTO;
import com.tgid.teste.junior.dto.taxa.TaxaRespostaDTO;
import com.tgid.teste.junior.model.taxa.Taxa;
import com.tgid.teste.junior.repository.taxa.TaxaRepository;
import com.tgid.teste.junior.utils.mapper.taxa.TaxaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxaService {
    @Autowired
    private TaxaRepository taxaRepository;

    public TaxaRespostaDTO criarTaxa(TaxaInsertDTO taxaDto){
        Taxa taxa = TaxaMapper.taxaDTOParaTaxa(taxaDto);
        taxaRepository.save(taxa);
        return  TaxaMapper.taxaParaTaxaRespostaDTO(taxa);
    }
}
