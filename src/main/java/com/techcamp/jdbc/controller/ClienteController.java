/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techcamp.jdbc.controller;

import com.techcamp.jdbc.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.techcamp.jdbc.repository.ClienteRepository;
import com.techcamp.jdbc.repository.JdbcClienteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author ASUS
 */
@RestController
@Slf4j
public class ClienteController {

    @Autowired
    JdbcClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> verTodos() {
        return new ResponseEntity(clienteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/clientes")
    public String guardar() {
        clienteRepository.save(new Cliente("C.C", "1234", "hOLA", "Mundo"));
        return "Guardado con éxito";
    }
}
