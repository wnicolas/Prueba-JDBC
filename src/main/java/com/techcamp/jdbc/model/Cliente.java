/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techcamp.jdbc.model;

/**
 *
 * @author ASUS
 */
public class Cliente {

    private String tipo_documento;
    private String numero_documento;
    private String nombres;
    private String apellidos;

    public Cliente() {

    }

    public Cliente(String tipo_documento, String numero_documento, String nombres, String apellidos) {
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public void setTipoDocumento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getTipoDocumento() {
        return tipo_documento;
    }

    public String getNumeroDocumento() {
        return numero_documento;
    }

    public void setNumeroDocumento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setapellidos(String isapellidos) {
        this.apellidos = isapellidos;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + tipo_documento + ", numero_documento=" + numero_documento + ", desc=" + nombres + ", apellidos=" + apellidos + "]";
    }

}
