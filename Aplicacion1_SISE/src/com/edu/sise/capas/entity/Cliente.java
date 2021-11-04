/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sise.capas.entity;

/**
 *
 * @author SEBASTIAN
 */
public class Cliente {
    
    private int id_cliente;
    private String nombre;
    private String clave;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String clave) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.clave = clave;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}

