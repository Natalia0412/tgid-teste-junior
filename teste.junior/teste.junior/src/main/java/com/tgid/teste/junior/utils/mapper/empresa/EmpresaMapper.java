package com.tgid.teste.junior.utils.mapper.empresa;

import com.tgid.teste.junior.dto.empresa.EmpresaInserirDTO;
import com.tgid.teste.junior.dto.empresa.EmpresaRespostaDTO;
import com.tgid.teste.junior.model.empresa.Empresa;

public class EmpresaMapper {

    public static Empresa empresaDTOParaEmpresa(EmpresaInserirDTO dto) {
        Empresa empresa = new Empresa();
        empresa.setNome(dto.getNome());
        empresa.setCnpj(dto.getCnpj());
        empresa.setEmail(dto.getEmail());
        empresa.setSaldo(dto.getSaldo());
        return empresa;
    }

    public static EmpresaRespostaDTO empresaParaEmpresaRespostaDTO(Empresa empresa){
        EmpresaRespostaDTO dto = new EmpresaRespostaDTO();
        dto.setNome(empresa.getNome());
        dto.setCnpj(empresa.getCnpj());
        dto.setEmail(empresa.getEmail());
        dto.setSaldo(empresa.getSaldo());
        return dto;
    }
}
