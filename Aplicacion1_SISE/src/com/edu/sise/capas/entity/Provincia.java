/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sise.capas.entity;

/**
 *
 * @author SEBASTIAN
 */
public class Provincia {
    
    private Integer id_prov;
    private String  nombre;

    public Provincia() {
    }

    public Provincia(Integer id_prov, String nombre) {
        this.id_prov = id_prov;
        this.nombre = nombre;
    }

    public Integer getId_prov() {
        return id_prov;
    }

    public void setId_prov(Integer id_prov) {
        this.id_prov = id_prov;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
