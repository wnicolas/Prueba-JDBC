/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.techcamp.jdbc.repository;

import com.techcamp.jdbc.model.Cuenta;

/**
 *
 * @author ASUS
 */
public interface TransaccionRepository {
    public void retirar(String tipo_cuenta, String numero_cuenta, Double monto);
}
