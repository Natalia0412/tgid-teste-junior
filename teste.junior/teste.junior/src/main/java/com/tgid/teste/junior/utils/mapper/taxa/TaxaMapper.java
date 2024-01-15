package com.tgid.teste.junior.utils.mapper.taxa;

import com.tgid.teste.junior.dto.taxa.TaxaInsertDTO;
import com.tgid.teste.junior.dto.taxa.TaxaRespostaDTO;
import com.tgid.teste.junior.model.taxa.Taxa;

public class TaxaMapper {
    public static Taxa taxaDTOParaTaxa(TaxaInsertDTO dto){
        Taxa taxa = new Taxa();
        taxa.setTipo(dto.getTipo());
        taxa.setValor(dto.getValor());
        return taxa;
    }

    public static TaxaRespostaDTO taxaParaTaxaRespostaDTO(Taxa taxa) {
        TaxaRespostaDTO dto = new TaxaRespostaDTO();
        dto.setTipo(taxa.getTipo());
        dto.setValor(taxa.getValor());
        return dto;
    }
}
