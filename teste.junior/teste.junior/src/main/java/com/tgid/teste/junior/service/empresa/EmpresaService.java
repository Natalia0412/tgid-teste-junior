package com.tgid.teste.junior.service.empresa;

import com.tgid.teste.junior.dto.empresa.EmpresaInserirDTO;
import com.tgid.teste.junior.dto.empresa.EmpresaRespostaDTO;
import com.tgid.teste.junior.model.empresa.Empresa;
import com.tgid.teste.junior.repository.empresa.EmpresaRepository;
import com.tgid.teste.junior.utils.exception.ResourceConflict;
import com.tgid.teste.junior.utils.mapper.empresa.EmpresaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaRespostaDTO criarEmpresa(EmpresaInserirDTO empresaDto){
        Empresa empresa = EmpresaMapper.empresaDTOParaEmpresa(empresaDto);
        if(this.verificarCnpjExistente(empresaDto.getCnpj())){
            throw new ResourceConflict("CNPJ já cadastrado.");
        }
        empresaRepository.save(empresa);
        return EmpresaMapper.empresaParaEmpresaRespostaDTO(empresa);
    }

    public boolean verificarCnpjExistente(String cnpj){
        return empresaRepository.existsByCnpj(cnpj);
    }
}
