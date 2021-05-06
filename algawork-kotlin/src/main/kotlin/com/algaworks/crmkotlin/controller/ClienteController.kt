package com.algaworks.crmkotlin.controller

import com.algaworks.crmkotlin.model.Cliente
import com.algaworks.crmkotlin.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clientes")
class ClienteController (
        @Autowired
        var clienteRepository: ClienteRepository
        ){

        @GetMapping
        fun listar(): List<Cliente>{
                return clienteRepository.findAll();
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        fun adicionar(@RequestBody cliente:Cliente): Cliente{
                return clienteRepository.save(cliente);
        }

}