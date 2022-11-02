/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techcamp.jdbc.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ASUS
 */
@Getter
@Setter
public class Cuenta {

    String tipoCuenta;
    String numeroCuenta;
    Double saldo;

    public Cuenta() {

    }

    public Cuenta(String tipoCuenta, String numeroCuenta, Double saldo) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

}
