package com.tgid.teste.junior.service.cliente;

import com.tgid.teste.junior.dto.cliente.ClienteInserirDTO;
import com.tgid.teste.junior.model.cliente.Cliente;
import com.tgid.teste.junior.repository.cliente.ClienteRepository;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente criarCliente(ClienteInserirDTO cliente){

        return  clienteRepository.save(cliente);
    }
}
