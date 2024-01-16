package com.tgid.teste.junior.utils.mapper.empresa;

import com.tgid.teste.junior.dto.empresa.EmpresaInserirDTO;
import com.tgid.teste.junior.dto.empresa.EmpresaRespostaDTO;
import com.tgid.teste.junior.model.empresa.Empresa;
import com.tgid.teste.junior.utils.mapper.taxa.TaxaMapper;

import java.util.ArrayList;

public class EmpresaMapper {

    public static Empresa empresaDTOParaEmpresa(EmpresaInserirDTO dto) {
        return Empresa.builder()
                .nome(dto.getNome())
                .cnpj(dto.getCnpj())
                .email(dto.getEmail())
                .saldo(dto.getSaldo())
                .taxaList(new ArrayList<>())
                .build();
    }

    public static Empresa empresaDTOParaEmpresa(EmpresaRespostaDTO dto) {
        return Empresa.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .cnpj(dto.getCnpj())
                .email(dto.getEmail())
                .saldo(dto.getSaldo())
                .taxaList(TaxaMapper.taxaDTOParaTaxa(dto.getTaxas()))
                .build();
    }

    public static EmpresaRespostaDTO empresaParaEmpresaRespostaDTO(Empresa empresa){
        return EmpresaRespostaDTO.builder()
                .id(empresa.getId())
                .nome(empresa.getNome())
                .cnpj(empresa.getCnpj())
                .email(empresa.getEmail())
                .saldo(empresa.getSaldo())
                .taxas(TaxaMapper.taxaParaTaxaRespostaDTO(empresa.getTaxaList()))
                .build();
    }
}
