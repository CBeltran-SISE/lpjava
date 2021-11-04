/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sise.capas.entity;

import java.time.LocalDate;

/**
 *
 * @author SEBASTIAN
 */
public class Empleado {

    private Integer id_empleado ;
    private String nombre; 
    private String ape_pat; 
    private String ape_mat; 
    private LocalDate fnacimiento ;
    private Double sueldo; 

    public Empleado() {
    }

    public Empleado(Integer id_empleado, String nombre, String ape_pat, String ape_mat, LocalDate fnacimiento, Double sueldo) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.ape_pat = ape_pat;
        this.ape_mat = ape_mat;
        this.fnacimiento = fnacimiento;
        this.sueldo = sueldo;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe_pat() {
        return ape_pat;
    }

    public void setApe_pat(String ape_pat) {
        this.ape_pat = ape_pat;
    }

    public String getApe_mat() {
        return ape_mat;
    }

    public void setApe_mat(String ape_mat) {
        this.ape_mat = ape_mat;
    }

    public LocalDate getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(LocalDate fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }


    
}
