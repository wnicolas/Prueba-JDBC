/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.techcamp.jdbc.repository;

import java.util.List;
import com.techcamp.jdbc.model.Cliente;

/**
 *
 * @author ASUS
 */
public interface ClienteRepository {

    int save(Cliente cliente);

    int update(Cliente cliente);

    Cliente findById(String tipo_documento, String numero_documento);

    int deleteById(String tipo_documento, String numero_documento);

    List<Cliente> findAll();

    int deleteAll();
}
