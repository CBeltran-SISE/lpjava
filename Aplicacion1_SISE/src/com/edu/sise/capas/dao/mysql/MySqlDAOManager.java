/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sise.capas.dao.mysql;

import com.edu.sise.capas.dao.Conexion;
import com.edu.sise.capas.dao.ICarreraDAO;
import com.edu.sise.capas.dao.IDAOManager;
import com.edu.sise.capas.dao.IEmpleadoDAO;
import com.edu.sise.capas.dao.IProvinciaDAO;
import java.sql.Connection;

/**
 *
 * @author SEBASTIAN
 */
public class MySqlDAOManager implements IDAOManager {
    
    //Patron Singleton - parte 1
    private static final MySqlDAOManager instancia = new MySqlDAOManager();
    private Connection cn;
    
   
    private MySqlDAOManager(){
        cn = new Conexion().getConn();
    }
    
//Patron Singleton - parte 2
    
    public static MySqlDAOManager getInstancia(){
        return instancia;
    }
    //factory
    
     private IEmpleadoDAO empleadoDAO=null;
     private IProvinciaDAO provinciaDAO = null;
     private ICarreraDAO carreraDAO = null;
     
    
     @Override
    public IEmpleadoDAO geteEmpleadoDAO() {
        if(empleadoDAO == null){
            empleadoDAO = new MySqlEmpleadoDAO(cn);
        }
        return empleadoDAO;
    }

    @Override
    public ICarreraDAO getCarreraDAO() {
        if(carreraDAO == null){
            carreraDAO = new MySqlCarreraDAO();
        }
        return carreraDAO;
    }

    @Override
    public IProvinciaDAO getProvinciaDAO() {
        if(provinciaDAO == null){
            provinciaDAO = new MySqlProvinciaDAO(cn);
        }
        return provinciaDAO;
    }
    
}
