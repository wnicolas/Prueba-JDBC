/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techcamp.jdbc.controller;

import com.techcamp.jdbc.model.Cuenta;
import com.techcamp.jdbc.repository.JdbcTransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
public class TransaccionController {

    @Autowired
    JdbcTransaccionRepository transaccionRepository;

    @PostMapping("transaccion/retiro")
    public String realizarRetiro(@RequestBody Cuenta cuenta) {
        //return cuenta.getNumeroCuenta()+cuenta.getTipoCuenta()+cuenta.getSaldo();
        transaccionRepository.retirar(cuenta.getTipoCuenta(), cuenta.getNumeroCuenta(), cuenta.getSaldo());
        return cuenta.getNumeroCuenta() + cuenta.getTipoCuenta() + cuenta.getSaldo();
    }
}
