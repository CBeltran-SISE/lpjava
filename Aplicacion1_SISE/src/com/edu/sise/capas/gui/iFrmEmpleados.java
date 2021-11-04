
package com.edu.sise.capas.gui;

import com.edu.sise.capas.entity.Empleado;
import com.edu.sise.capas.logic.EmpleadoLogic;
import java.io.ByteArrayOutputStream;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/*@author SEBASTIAN*/

public class iFrmEmpleados extends javax.swing.JInternalFrame {

     
        
    EmpleadoLogic logic;
    int pagina = 0;   
    int contador =0;
    int total = 0;

    ResourceBundle rb = ResourceBundle.getBundle("com.edu.sise.capas.gui.Mensajes");
    public iFrmEmpleados() {
        initComponents();
        
        
//        logic = new EmpleadoLogic();
//        try {
//            logic.imprimirTB(tblista);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
//        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnagregar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dtpFechaNacimiento = new org.jdatepicker.JDatePicker();
        lblQR = new javax.swing.JLabel();
        btnQR = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblista = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtbusqueda = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btCargaMasiva = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboCantidadRegistros = new javax.swing.JComboBox<>();
        btnDerecha = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();

        setTitle("Mantenedor de Empleados");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        btnagregar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/capas/gui/resources/66825_note_add_icon.png"))); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnlistar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/capas/gui/resources/listar.png"))); // NOI18N
        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID:");

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtnombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombres:");

        txtSueldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sueldo:");

        txtPaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtMaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido Paterno");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Apellido Materno:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");

        lblQR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnQR.setText("Generar QR");
        btnQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(txtnombres, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaterno, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(dtpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnQR))
                            .addComponent(lblQR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(dtpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQR, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQR)
                        .addGap(50, 50, 50))))
        );

        btncerrar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/capas/gui/resources/cerrar.png"))); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        tblista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblista);

        btnmodificar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/capas/gui/resources/modificar.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/capas/gui/resources/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/capas/gui/resources/buscar2.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbuscar)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btCargaMasiva.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btCargaMasiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/capas/gui/resources/carga.png"))); // NOI18N
        btCargaMasiva.setText("Carga Masiva");
        btCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargaMasivaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("Cantidad de Registros:");

        cboCantidadRegistros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "50" }));
        cboCantidadRegistros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCantidadRegistrosItemStateChanged(evt);
            }
        });

        btnDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/capas/gui/resources/derecha.png"))); // NOI18N
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edu/sise/capas/gui/resources/izquierda.png"))); // NOI18N
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncerrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(192, 192, 192)
                                    .addComponent(btnIzquierda)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDerecha)
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboCantidadRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btCargaMasiva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnmodificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnlistar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(110, 110, 110))))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncerrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnlistar)
                        .addGap(18, 18, 18)
                        .addComponent(btnagregar)
                        .addGap(20, 20, 20)
                        .addComponent(btnmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btCargaMasiva))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboCantidadRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDerecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzquierda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
        
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        logic = new EmpleadoLogic();
        Empleado objEmpleado = null;
        try {
             objEmpleado=getEmpleado();
             objEmpleado.setId_empleado(0);
            logic.insertar(objEmpleado);
            logic.imprimirTB(tblista);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if(objEmpleado.getId_empleado()>0){
            JOptionPane.showMessageDialog(null,
                    rb.getString("mensaje_modificacion")+objEmpleado.getId_empleado());
        }
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        
        logic = new EmpleadoLogic();
        try {
            logic.imprimirTB(tblista);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
     
    }//GEN-LAST:event_btnlistarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        
        logic = new EmpleadoLogic();
        try {
            logic.modificar(getEmpleado());
            JOptionPane.showMessageDialog(null, rb.getString("mensaje_modificacion"),"AVISO",JOptionPane.INFORMATION_MESSAGE);
            logic.imprimirTB(tblista);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         logic = new EmpleadoLogic();
         int fila = 0;
         int id;
         if (fila>=0){
            id = Integer.parseInt(tblista.getValueAt(fila, 0)+"");
            
            int valor = JOptionPane.showConfirmDialog(null, "¿Deseas realmente eliminar el registro?",
                    "SISTEMA", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
         
            if (valor == JOptionPane.YES_OPTION){         
            try {
            logic.eliminar(getEmpleado());
            JOptionPane.showMessageDialog(null, 
                    rb.getString("mensaje_eliminar"),"AVISO",JOptionPane.INFORMATION_MESSAGE);
            logic.imprimirTB(tblista);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
          }
      }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblistaMouseClicked
           int fila;
        fila = tblista.getSelectedRow();
        int id;
        String nombre, ape_pat,ape_mat;
        LocalDate fnacimiento;
        double sueldo;
        if(fila>=0){
            
            id = Integer.parseInt(tblista.getValueAt(fila, 0)+"");
            nombre = tblista.getValueAt(fila, 1)+"";
            ape_pat = tblista.getValueAt(fila, 2)+"";
            ape_mat = tblista.getValueAt(fila, 3)+"";
            fnacimiento = LocalDate.parse(tblista.getValueAt(fila,4)+"");
            sueldo =Double.parseDouble(tblista.getValueAt(fila, 5)+"");
            txtID.setText(id+"");
            txtnombres.setText(nombre);
            txtPaterno.setText(ape_pat);
            txtMaterno.setText(ape_mat);
            dtpFechaNacimiento.getModel().setDate(fnacimiento.getYear(), 
                    fnacimiento.getMonthValue()-1,
                    fnacimiento.getDayOfMonth());
            dtpFechaNacimiento.getModel().setSelected(true);
            txtSueldo.setText(sueldo+"");
        }
    }//GEN-LAST:event_tblistaMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String v1 = txtbusqueda.getText();
        
        logic = new EmpleadoLogic();
        try {
            logic.imprimirTB(tblista, logic.obtenerBusqueda(v1));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargaMasivaActionPerformed
        // TODO add your handling code here:
        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(buscador);
        String rutaArchivo = buscador.getSelectedFile().getAbsolutePath();
        logic = new EmpleadoLogic();
        int reg_afectados = 0 ; 
        try {
            reg_afectados = logic.cargaMasiva(rutaArchivo);
            JOptionPane.showMessageDialog(null, "La cantidad de registros afectados son: " + reg_afectados);
            logic.imprimirTB(tblista);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCargaMasivaActionPerformed

    private void cboCantidadRegistrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCantidadRegistrosItemStateChanged
        // Toda la lógica para paginar 
        
        logic = new EmpleadoLogic();
        contador = 0;
        try {
            if(cboCantidadRegistros.getSelectedIndex()>=0){
                logic.imprimirTB(tblista,
                        logic.paginacion(0, Integer.parseInt(cboCantidadRegistros.getSelectedItem()+""))
                        );
            }
               
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cboCantidadRegistrosItemStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        cboCantidadRegistros.setSelectedIndex(1);
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        // TODO add your handling code here:
        
        logic =  new EmpleadoLogic();
             try {
               total   = logic.getCount();       
            if(cboCantidadRegistros.getSelectedIndex()>=0){
                int max = total/Integer.parseInt(cboCantidadRegistros.getSelectedItem()+"");
                contador++;
                if(max>=contador){
                    pagina = Integer.parseInt(cboCantidadRegistros.getSelectedItem()+"")*contador;
                   logic.imprimirTB(tblista, logic.paginacion(pagina, Integer.parseInt(cboCantidadRegistros.getSelectedItem()+"")));
                }else{
                    contador = max ;
                }
                
            }
               
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        // TODO add your handling code here:
        
         logic =  new EmpleadoLogic();
             try {
               total   = logic.getCount();       
            if(cboCantidadRegistros.getSelectedIndex()>=0){
                int max = total/Integer.parseInt(cboCantidadRegistros.getSelectedItem()+"");
                contador--;
                if(contador < 0) contador= 0;
                if(max>=contador){
                    pagina = Integer.parseInt(cboCantidadRegistros.getSelectedItem()+"")*contador;
                   logic.imprimirTB(tblista, logic.paginacion(pagina, Integer.parseInt(cboCantidadRegistros.getSelectedItem()+"")));
                }
                
            }else{
                logic.imprimirTB(tblista);
            }
               
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRActionPerformed
       String valor = "";
       valor=txtID.getText() + "|" + txtnombres.getText() +"|"+txtPaterno.getText()+"|"+txtMaterno.getText();
        ByteArrayOutputStream qr = QRCode.from(valor).to(ImageType.PNG).stream();
        ImageIcon icono = new ImageIcon(qr.toByteArray());
        lblQR.setIcon(icono);
    }//GEN-LAST:event_btnQRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCargaMasiva;
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton btnQR;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox<String> cboCantidadRegistros;
    private org.jdatepicker.JDatePicker dtpFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQR;
    private javax.swing.JTable tblista;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables

    Empleado getEmpleado(){
        //Construir la fecha a partir del JDATEPICKER
        
        int anio, mes,dia;
        anio = dtpFechaNacimiento.getModel().getYear();
        mes = dtpFechaNacimiento.getModel().getMonth()+1;
        dia = dtpFechaNacimiento.getModel().getDay();
        
        return new Empleado(
                Integer.parseInt(txtID.getText()),
                txtnombres.getText(),
                txtPaterno.getText(),
                txtMaterno.getText(),
                LocalDate.of(anio,mes,dia),
                Double.parseDouble(txtSueldo.getText())
                
             );
    }

}

