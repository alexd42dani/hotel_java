/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimientos.servicios;

import buscadores.*;
import referenciales.*;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import menu.menu;

/**
 *
 * @author hpnotebook
 */
public class detalle_cama_extra extends javax.swing.JInternalFrame {

    conexion.conexion con = new conexion.conexion();
    javax.swing.table.DefaultTableModel t;
    DecimalFormat num = new DecimalFormat("#,##0");
    SimpleDateFormat fec = new SimpleDateFormat("dd/MM/yyyy");
    
     private String id_tabla="nada";
     
     private String formulario="";
     
     int f = -1;
     int c = -1;
     String tabla[][];
     int precio=0;
     String idd="0";
    public detalle_cama_extra(String formulario, String pasar, String idhues) {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        t= (javax.swing.table.DefaultTableModel) tabla_cama.getModel();
       // cargar_tabla("nombre","");
        tabla_cama.getTableHeader().setReorderingAllowed(false);
       // jRadioButton1.setSelected(true);
        this.formulario = formulario;
       // txt_buscar.requestFocus();
       idd=idhues;
       combo();
       combo_camas.requestFocus();
       t.setRowCount(0);
       if(!pasar.equals("")){
           cargar_tabla(pasar);
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_cama = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        combo_camas = new javax.swing.JComboBox<>();
        btn_agregar_cama = new javax.swing.JButton();
        btn_quitar_cama = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        combo_habitacion = new javax.swing.JComboBox<>();
        btn_habitacion = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 580));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla_cama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cama", "precio", "Codigo", "Habitacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_cama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_camaMousePressed(evt);
            }
        });
        tabla_cama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_camaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_camaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_cama);

        jLabel20.setText("Camas :");

        combo_camas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_camas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combo_camasFocusGained(evt);
            }
        });
        combo_camas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_camasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combo_camas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_camasActionPerformed(evt);
            }
        });
        combo_camas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_camasKeyPressed(evt);
            }
        });

        btn_agregar_cama.setBackground(new java.awt.Color(255, 255, 255));
        btn_agregar_cama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/mas2.png"))); // NOI18N
        btn_agregar_cama.setText("Agregar");
        btn_agregar_cama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_camaActionPerformed(evt);
            }
        });

        btn_quitar_cama.setBackground(new java.awt.Color(255, 255, 255));
        btn_quitar_cama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/menos.png"))); // NOI18N
        btn_quitar_cama.setText("Quitar");
        btn_quitar_cama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitar_camaActionPerformed(evt);
            }
        });

        jLabel19.setText("Habitacion :");

        combo_habitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_habitacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combo_habitacionFocusGained(evt);
            }
        });
        combo_habitacion.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_habitacionPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combo_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_habitacionActionPerformed(evt);
            }
        });
        combo_habitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_habitacionKeyPressed(evt);
            }
        });

        btn_habitacion.setBackground(new java.awt.Color(255, 255, 255));
        btn_habitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/buscar3.png"))); // NOI18N
        btn_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_habitacionActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(255, 255, 255));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/edit1.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/delete2.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(10, 10, 10)
                        .addComponent(combo_camas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agregar_cama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_quitar_cama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpiar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(combo_camas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20)
                                .addComponent(jLabel19))
                            .addComponent(combo_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_quitar_cama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar_cama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_actualizar.setBackground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/repetir.png"))); // NOI18N
        btn_actualizar.setText("Deshacer");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(255, 255, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/agregar.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/aprobar.png"))); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_actualizar)
                .addGap(22, 22, 22)
                .addComponent(btn_cancelar)
                .addGap(22, 22, 22)
                .addComponent(btn_agregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/atras.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(8, 175, 178));
        jLabel3.setText("Cama Extra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       btn_aceptar.doClick();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
     /*   jRadioButton1.setSelected(true);
        txt_buscar.setText("");
        cargar_tabla("nombre", "");*/
     if(t.getRowCount()>0){
         t.setRowCount(0);
     }
     
     btn_limpiar.doClick();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
    //    menu.menu.llamar_internal(new referenciales.empleado());
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
       // referenciales.huespedes.buscador_personas("1");
       
       
       
       if(tabla_cama.getRowCount()<=0){
           JOptionPane.showMessageDialog(null, "No ha cargado ningun detalle"); 
       
       
       }else{
           
           f = tabla_cama.getRowCount();
           c = 2;
           tabla = new String[f][c];
           
           for (int c1=0; c1<c;c1++){
               for(int f1=0; f1<f;f1++){
                   if(c1==0){
                      tabla[f1][c1] = tabla_cama.getValueAt(f1,0).toString();
                      precio += Integer.parseInt(tabla_cama.getValueAt(f1,2).toString().replace(".", ""));
                   }else if(c1==1){
                      tabla[f1][c1] = tabla_cama.getValueAt(f1,3).toString();
                   }
               }
           }
           
       }
       
       if(formulario.equals("servicios")){
           movimientos.servicios.servicios.detalle_servicios(tabla, f, c, precio);
       }
       
       
       f = -1;
       c = -1;
       tabla = null;
       precio=0;
       
      // dispose();
        moveToBack();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void tabla_camaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_camaKeyReleased

    
       
    }//GEN-LAST:event_tabla_camaKeyReleased

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       //btn_aceptar.doClick();
       btn_actualizar.doClick();
       btn_aceptar.doClick();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tabla_camaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_camaMousePressed

    }//GEN-LAST:event_tabla_camaMousePressed

    private void tabla_camaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_camaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_aceptar.doClick();
        }
    }//GEN-LAST:event_tabla_camaKeyPressed

    private void combo_camasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combo_camasFocusGained
        combo_camas.showPopup();
    }//GEN-LAST:event_combo_camasFocusGained

    private void combo_camasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_camasPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_camasPopupMenuWillBecomeInvisible

    private void combo_camasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_camasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_camasActionPerformed

    private void combo_camasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_camasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            combo_habitacion.requestFocus();
            
        }
    }//GEN-LAST:event_combo_camasKeyPressed

    private void btn_agregar_camaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_camaActionPerformed
        if (combo_camas.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una cama");
            combo_camas.requestFocus();
        }else if (combo_habitacion.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una habitacion");
            combo_habitacion.requestFocus();
        }else {
            cargar_detalle();
            combo_camas.requestFocus();
        }
    }//GEN-LAST:event_btn_agregar_camaActionPerformed

    private void btn_quitar_camaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitar_camaActionPerformed
        if (tabla_cama.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar por lo menos una fila", "Atencion",
                JOptionPane.WARNING_MESSAGE);

        } else {
            int mensaje = JOptionPane.showConfirmDialog(null, "Desea eliminar la fila seleccionada", "Atencion",
                JOptionPane.WARNING_MESSAGE, JOptionPane.QUESTION_MESSAGE);
            if (mensaje == 0) {
                javax.swing.table.DefaultTableModel tab = (javax.swing.table.DefaultTableModel) tabla_cama.getModel();
                tab.removeRow(tabla_cama.getSelectedRow());

            }
            combo_camas.setSelectedIndex(-1);
            combo_habitacion.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_btn_quitar_camaActionPerformed

    private void combo_habitacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combo_habitacionFocusGained
        combo_habitacion.showPopup();
    }//GEN-LAST:event_combo_habitacionFocusGained

    private void combo_habitacionPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_habitacionPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_habitacionPopupMenuWillBecomeInvisible

    private void combo_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_habitacionActionPerformed
        if (!id_habitaciones.equals("") && !id_habitaciones.equals("nada")) {
                
                cargaCombo(combo_habitacion, "SELECT hh.descripcion\n" +
                                        "FROM huespedes h\n" +
                                        "LEFT JOIN estadia_huespedes eh ON eh.huespedes_id = h.id\n" +
                                        "LEFT JOIN estadia_habitaciones ehh ON eh.id_estadia = ehh.id_estadia\n" +
                                        "LEFT JOIN estadia e ON e.id = ehh.id_estadia \n" +
                                        "LEFT JOIN habitaciones hh ON hh.id = ehh.id_habitacion\n" +
                                        "WHERE eh.huespedes_id = "+idd+" AND e.estado ='A'\n" +
                                        "ORDER BY descripcion\n" +
                                        "","hh.descripcion");
       
                combo_habitacion.setSelectedItem(con.BuscaCol("SELECT descripcion FROM habitaciones WHERE id = " + id_habitaciones));
                
                
               id_habitaciones="";
               
               
            }else if(id_habitaciones.equals("nada")){
                cargaCombo(combo_habitacion, "SELECT hh.descripcion\n" +
                                        "FROM huespedes h\n" +
                                        "LEFT JOIN estadia_huespedes eh ON eh.huespedes_id = h.id\n" +
                                        "LEFT JOIN estadia_habitaciones ehh ON eh.id_estadia = ehh.id_estadia\n" +
                                        "LEFT JOIN estadia e ON e.id = ehh.id_estadia \n" +
                                        "LEFT JOIN habitaciones hh ON hh.id = ehh.id_habitacion\n" +
                                        "WHERE eh.huespedes_id = "+idd+" AND e.estado ='A'\n" +
                                        "ORDER BY descripcion\n" +
                                        "","hh.descripcion");
               id_habitaciones="";
            }
    }//GEN-LAST:event_combo_habitacionActionPerformed

    private void combo_habitacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_habitacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          btn_agregar_cama.requestFocus();
          btn_agregar_cama.doClick();
        }
    }//GEN-LAST:event_combo_habitacionKeyPressed

    private void btn_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_habitacionActionPerformed
     menu.llamar_internal(new buscadores.buscador_habitaciones("detalle_cama_extra"));
    }//GEN-LAST:event_btn_habitacionActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
         if (tabla_cama.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar por lo menos una fila", "Atencion",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
            
        if (combo_camas.getSelectedIndex()<0){ 
            JOptionPane.showMessageDialog(null, "Debe ingresar combo");
               
        } else if (combo_habitacion.getSelectedIndex()<0){ 
            JOptionPane.showMessageDialog(null, "Debe ingresar combo");
               
        }else {
      
        int mensaje = JOptionPane.showConfirmDialog(null, "Desea editar la fila seleccionada", "Atencion",
        JOptionPane.WARNING_MESSAGE, JOptionPane.QUESTION_MESSAGE);
        if (mensaje == 0) {
            javax.swing.table.DefaultTableModel tab = (javax.swing.table.DefaultTableModel) tabla_cama.getModel();
            tab.removeRow(tabla_cama.getSelectedRow());
            cargar_detalle();
            combo_camas.requestFocus();
        }else {
        btn_limpiar.doClick();
        }
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
       combo_camas.setSelectedIndex(-1);
       combo_habitacion.setSelectedIndex(-1);
    }//GEN-LAST:event_btn_limpiarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_agregar_cama;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_habitacion;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_quitar_cama;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo_camas;
    private static javax.swing.JComboBox<String> combo_habitacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_cama;
    // End of variables declaration//GEN-END:variables

    
     private void combo() {
        cargaCombo(combo_habitacion, "SELECT hh.descripcion\n" +
                                        "FROM huespedes h\n" +
                                        "LEFT JOIN estadia_huespedes eh ON eh.huespedes_id = h.id\n" +
                                        "LEFT JOIN estadia_habitaciones ehh ON eh.id_estadia = ehh.id_estadia\n" +
                                        "LEFT JOIN estadia e ON e.id = ehh.id_estadia \n" +
                                        "LEFT JOIN habitaciones hh ON hh.id = ehh.id_habitacion\n" +
                                        "WHERE eh.huespedes_id = "+idd+" AND e.estado ='A'\n" +
                                        "ORDER BY descripcion\n" +
                                        "","hh.descripcion");
        cargaCombo(combo_camas, "SELECT descripcion FROM cama order by descripcion", "descripcion");
    }
    
    
    private void cargaCombo(JComboBox cbo, String sql, String columna) {
        try {
            cbo.removeAllItems();
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                if(columna.equals("descripcion")){
                    cbo.addItem(con.resultado.getString("descripcion"));
                }else if(columna.equals("nombre")){
                    cbo.addItem(con.resultado.getString("nombre"));
                }else if(columna.equals("hh.descripcion")){
                    cbo.addItem(con.resultado.getString("hh.descripcion"));
                }
                
            }
            cbo.setSelectedIndex(-1);
        } catch (SQLException ex) {
            Logger.getLogger(tarifas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    static String id_habitaciones="";
    public static void buscador_habitaciones(String id){
        if (!id.equals("")) {
            //System.out.println(id);
            id_habitaciones = id; 
            combo_habitacion.setSelectedIndex(-1);
        }
    }
    
     private void cargar_detalle() {
        
        

        String idc = con.BuscaCol("SELECT id \n" +
                                    "FROM cama\n" +
                                    "WHERE descripcion = '" + combo_camas.getSelectedItem() + "'");
        
       String precioc =  con.BuscaCol("SELECT precio \n" +
                                    "FROM cama\n" +
                                    "WHERE descripcion = '" + combo_camas.getSelectedItem() + "'");
       
       
        precioc = num.format(Integer.parseInt(precioc));
        
        String idh = con.BuscaCol("SELECT h.id \n" +
                                    "FROM habitaciones h\n" +
                                    "WHERE h.descripcion = '" + combo_habitacion.getSelectedItem() + "'");
        
        
      /*  if (cuentaid(idc, tabla_cama, 0) || cuentaid(idh, tabla_cama, 2)) {
            t.addRow(new Object[]{idc, combo_camas.getSelectedItem().toString()});
        }*/
        
        
            t.addRow(new Object[]{idc, combo_camas.getSelectedItem().toString(),precioc, idh, combo_habitacion.getSelectedItem()});
        
        
    }
    
    
    
     
     /* private boolean cuentaid(String id,javax.swing.JTable tabla, int posicion) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            String vcod = tabla.getValueAt(i, posicion).toString();
            if (id.equals(vcod)) {
                JOptionPane.showMessageDialog(null, "Codigo ingresado ya existe en el detalle");
                return false;
            }
        }
        return true;
    }*/
     
     
     private void cargar_tabla(String id) {
        
        try {
            
            String sql="";
            
         
            
            sql = "SELECT c.id, c.descripcion, c.precio, h.id, h.descripcion\n" +
                    "FROM servicios_cama_extra s\n" +
                    "LEFT JOIN servicios ss ON s.servicios_id = ss.id\n" +
                    "LEFT JOIN cama c ON s.camas_id = c.id\n" +
                    "LEFT JOIN habitaciones h ON s.habitacion_id = h.id\n" +
                    "WHERE s.servicios_id = "+id+" ";
            
           
            
            t.setRowCount(0);
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                t.addRow(new Object[]{con.resultado.getInt("c.id"), 
                    con.resultado.getString("c.descripcion"),
                    num.format(con.resultado.getInt("c.precio")),
                    //num.format(con.resultado.getInt("p.nro_documento")),
                   con.resultado.getString("h.id"),
                    con.resultado.getString("h.descripcion")});
                
            }  
        
        
        } catch (SQLException ex) {
            Logger.getLogger(buscador_servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
}

   

    

}
