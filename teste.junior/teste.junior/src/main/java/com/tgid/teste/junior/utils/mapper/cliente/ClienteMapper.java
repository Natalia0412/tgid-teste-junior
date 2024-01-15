package com.tgid.teste.junior.utils.mapper.cliente;

import com.tgid.teste.junior.dto.cliente.ClienteInserirDTO;
import com.tgid.teste.junior.model.cliente.Cliente;

public class ClienteMapper {
    public static Cliente clienteDTOParaCliente(ClienteInserirDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setCpf(dto.getCpf());
        cliente.setEmail(dto.getEmail());
        return cliente;
    }
}
