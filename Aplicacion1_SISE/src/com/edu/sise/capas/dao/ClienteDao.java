/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sise.capas.dao;

import com.edu.sise.capas.entity.Cliente;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author SEBASTIAN
 */
public class ClienteDao {
    
    Connection cn = null;
    
    public Cliente obtenerClientexID(int id){
        
        cn = new Conexion().getConn();
        
        String sql = "Select * from cliente where id_cliente =" + id;
        Cliente objCliente = null;
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                objCliente = new Cliente();
                objCliente.setId_cliente(rs.getInt("id_cliente"));
                objCliente.setNombre(rs.getString("nombre"));
                objCliente.setClave(rs.getString("clave"));
                
            }
        } catch (SQLException ex) {
            System.out.println("Error en Statement: " + ex);
        }finally{
            if(cn!=null){
                try {
                    cn.close();
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion: " + ex);
                }
            }
        }
        return objCliente;
    }
     public Cliente validarAcceso(Cliente objCliente){
        cn = new Conexion().getConn();
        
        String sql = "select * from cliente "+" where nombre ='"+objCliente.getNombre()+ "' and clave ='"+objCliente.getClave()+"'";
        Cliente rptaCliente = null;
        try {
            Statement st = cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                
                rptaCliente = new Cliente(rs.getInt("id_cliente"), rs.getString("nombre"), rs.getString("clave"));
                
            }
        } catch (SQLException ex) {
            System.out.println("Error en Statement: " + ex);
        }finally{
            if(cn!=null){
                try {
                    cn.close();
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion: " + ex);
                }
            }
        }
       
        
        return rptaCliente;
    }
     
     public List obtenerTodos(){
         cn = new Conexion().getConn();
         
         String sql = "Select * from cliente";
         
         List  listaClientes = new ArrayList<Cliente>();
         Cliente objCliente = null;
         
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                objCliente = new Cliente(rs.getInt("id_cliente"),rs.getString("nombre"),rs.getString("clave"));
                
                listaClientes.add(objCliente);
                
            }
        } catch (SQLException ex) {
            System.out.println("Error en Statement");
        }finally{
            if(cn!=null){
                try {
                    cn.close();
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion: " + ex);
                }
            }
        }
        return listaClientes;
     }
}
