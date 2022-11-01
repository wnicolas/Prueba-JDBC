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

/**
 *
 * @author ASUS
 */
@RestController
@Slf4j
public class ClienteController {
    
    @Autowired
    ClienteRepository clienteRepository;
    
    @GetMapping("/")
    public String inicio() {
        log.debug("Hola mundo");
        return "Hola mundo";
    }
    
    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> getAllClientes() {
        try {
            log.debug("Hola mundo");
            List<Cliente> Clientes = new ArrayList<Cliente>();
            
            clienteRepository.findAll().forEach(Clientes::add);
            
            if (Clientes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            
            return new ResponseEntity<>(Clientes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
