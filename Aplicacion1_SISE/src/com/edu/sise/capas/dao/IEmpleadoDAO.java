/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.edu.sise.capas.dao;

import com.edu.sise.capas.entity.Empleado;
import java.util.List;

/**
 *
 * @author SEBASTIAN
 */
public interface IEmpleadoDAO extends GenericDAO<Empleado, Integer> {
    
    double calcularBonificacion() throws DAOException;
    
    List<Empleado> obtenerBuscqueda(String v1)throws DAOException;
    
    int [] cargaMasiva(List<Empleado> lista) throws DAOException;
    
    List <String> obtenerNombresColumnas() throws DAOException;
    
    List<Empleado> paginacion(Integer posicion, Integer registros) throws DAOException;
    
    int getCount()throws DAOException;
    
    
    
}
