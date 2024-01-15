package com.tgid.teste.junior.service.cliente;

import com.tgid.teste.junior.dto.cliente.ClienteInserirDTO;
import com.tgid.teste.junior.dto.cliente.ClienteRespostaDTO;
import com.tgid.teste.junior.model.cliente.Cliente;
import com.tgid.teste.junior.repository.cliente.ClienteRepository;
import com.tgid.teste.junior.utils.exception.ResourceConflict;
import com.tgid.teste.junior.utils.mapper.cliente.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteRespostaDTO criarCliente(ClienteInserirDTO clienteDto){
        Cliente cliente = ClienteMapper.clienteDTOParaCliente(clienteDto);
        if (this.verificarCpfExistente(clienteDto.getCpf())) {
            throw new ResourceConflict("CPF já cadastrado.");
        }
        clienteRepository.save(cliente);

        return  ClienteMapper.clienteParaClienteRespostaDTO(cliente);
    }

    public boolean verificarCpfExistente(String cpf){
        return clienteRepository.existsByCpf(cpf);
    }
}
