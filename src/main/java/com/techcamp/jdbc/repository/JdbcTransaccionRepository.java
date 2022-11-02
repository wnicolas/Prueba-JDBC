/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techcamp.jdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository
public class JdbcTransaccionRepository implements TransaccionRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void retirar(String tipo_cuenta, String numero_cuenta, Double monto) {
        jdbcTemplate.update("call PR_REALIZAR_RETIRO(?,?,?)", tipo_cuenta, numero_cuenta, monto);
    }

}
