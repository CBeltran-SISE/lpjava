/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.edu.sise.capas.dao;

import com.edu.sise.capas.entity.Provincia;
import java.util.List;

/**
 *
 * @author SEBASTIAN
 */
public interface IProvinciaDAO extends GenericDAO<Provincia, Integer>{
    
    List <String> obtenerNombresColumnas() throws DAOException;
}
