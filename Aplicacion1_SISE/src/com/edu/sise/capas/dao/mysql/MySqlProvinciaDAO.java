/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sise.capas.dao.mysql;

import com.edu.sise.capas.dao.DAOException;
import com.edu.sise.capas.dao.IProvinciaDAO;
import com.edu.sise.capas.entity.Provincia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SEBASTIAN
 */
public class MySqlProvinciaDAO implements IProvinciaDAO {
    
     final String INSERT ="INSERT INTO Provincias(nombre) VALUES (?)";
     final String GETALL="SELECT * FROM Provincias";
     final String COLUMNAS = "SELECT * FROM Provincias  LIMIT 0";
    
    private Connection cn;
    public MySqlProvinciaDAO(Connection cn){
        this.cn=cn;
        
        
    }

    @Override
    public void insertar(Provincia o) throws DAOException {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
         ps= cn.prepareStatement(INSERT,PreparedStatement.RETURN_GENERATED_KEYS);
         int i = 1;
         
         ps.setString(i, o.getNombre());
       if(ps.executeUpdate()==0)
                throw new DAOException("No se pudo registrar!!!");
                
                rs = ps.getGeneratedKeys();
                if(rs.next()){
                    o.setId_prov(rs.getInt(1));
                }else{
                    throw new DAOException("No se puede generar el ID del empleado");
                }
            
        } catch (SQLException ex) {
           throw new DAOException("Error en SQL", ex);
        }finally{
            try {
                if (rs!=null) rs.close();
                if (ps!=null) ps.close();
                        
                
            } catch (SQLException ex) {
                throw new DAOException("Error en SQL", ex);
            }
        }
    }

    @Override
    public void modificar(Provincia o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Provincia o) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Provincia> obtenerTodos() throws DAOException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Provincia> lista = new ArrayList<>();
        try {
            ps = cn.prepareStatement(GETALL);
            rs = ps.executeQuery();
            while(rs.next()){
                lista.add(getRS(rs));
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        }finally{
            try {
                if (rs!=null) rs.close();
                if (ps!=null) ps.close();
                        
                
            } catch (SQLException ex) {
                throw new DAOException("Error en SQL", ex);
            }
        }
        return lista;
    }
    
        private Provincia getRS(ResultSet rs) throws SQLException{
        return new Provincia(
                rs.getInt("id_prov"),
                rs.getString("nombre"));
        }
    @Override
    public Provincia obtenerxID(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> obtenerNombresColumnas() throws DAOException {
          PreparedStatement ps = null;
        ResultSet rs = null; 
        ResultSetMetaData rsmd = null;
        List <String> listaNomColumn = new ArrayList<>();
        try {
            
            ps = cn.prepareStatement(COLUMNAS);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            for(int i = 1;i<=rsmd.getColumnCount();i++)
                
                listaNomColumn.add(rsmd.getColumnName(i));
                
            
            
        }catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        }finally{
            try {
                if (rs!=null) rs.close();
                if (ps!=null) ps.close();
                
                        
                
            } catch (SQLException ex) {
                throw new DAOException("Error en SQL", ex);
            }
        }
        return listaNomColumn;
    }
    
    
}
