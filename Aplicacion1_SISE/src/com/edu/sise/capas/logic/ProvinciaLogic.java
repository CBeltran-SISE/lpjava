/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sise.capas.logic;

import com.edu.sise.capas.dao.IProvinciaDAO;
import com.edu.sise.capas.dao.mysql.MySqlDAOManager;
import com.edu.sise.capas.entity.Provincia;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SEBASTIAN
 */
public class ProvinciaLogic {
    
    MySqlDAOManager factory = MySqlDAOManager.getInstancia(); //No ponemos new porque usamos Singleton
    IProvinciaDAO dao = factory.getProvinciaDAO();
    DefaultTableModel modelo = null; 
    
    public void insertar(Provincia o) throws Exception{
        
        dao.insertar(o);
        
    }
    
     private DefaultTableModel obtenerTodos() throws Exception{                   
        return getModelo(modelo, dao.obtenerTodos());
    }
    
       public void imprimirTB(JTable jtable) throws Exception{
       
    }
       
       public void imprimirTB(JTable jtable, DefaultTableModel modelo) throws Exception{
        jtable.setModel(modelo);
    }
       
       private DefaultTableModel getModelo(DefaultTableModel modelo,List<Provincia> lista) throws Exception{
          modelo = new DefaultTableModel();
          List<String>listaNomColumn = dao.obtenerNombresColumnas();
          //APE_PAT-->APE PAT
          
          for(String columna : listaNomColumn){
              modelo.addColumn(columna.toUpperCase().replace('_',' '));
          }
        //Llenar el modelo con la lista 
                for (Provincia obj : lista){
            Object data []={
                obj.getId_prov(),
                obj.getNombre(),
                
            };  
            modelo.addRow(data);
        }

        return modelo;
      }
}
