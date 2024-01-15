package com.tgid.teste.junior.controller.cliente;

import com.tgid.teste.junior.dto.cliente.ClienteInserirDTO;
import com.tgid.teste.junior.model.cliente.Cliente;
import com.tgid.teste.junior.service.cliente.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @PostMapping()
    public Cliente inserirCliente(@RequestBody @Valid ClienteInserirDTO clienteDto){
        return clienteService.criarCliente(clienteDto);
    }
}
