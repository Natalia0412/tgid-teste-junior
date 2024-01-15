package com.tgid.teste.junior.controller.cliente;

import com.tgid.teste.junior.model.cliente.Cliente;
import com.tgid.teste.junior.service.cliente.ClienteService;
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
    public Cliente inserirCliente(@RequestBody Cliente cliente){
        return clienteService.criarCliente(cliente);
    }
}
