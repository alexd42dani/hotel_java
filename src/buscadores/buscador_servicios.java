/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadores;

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

/**
 *
 * @author hpnotebook
 */
public class buscador_servicios extends javax.swing.JInternalFrame {

    conexion.conexion con = new conexion.conexion();
    javax.swing.table.DefaultTableModel t;
    DecimalFormat num = new DecimalFormat("#,##0");
    SimpleDateFormat fec = new SimpleDateFormat("dd/MM/yyyy");
    
     private String id_tabla="nada";
     
     private String formulario="";
    String join="";
    public buscador_servicios(String formulario) {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        t= (javax.swing.table.DefaultTableModel) tabla_servicios.getModel();
        //cargar_tabla("nombre","nombre","RIGHT JOIN servicios_cama_extra sce ON s.id = sce.servicios_id");
        tabla_servicios.getTableHeader().setReorderingAllowed(false);
        jRadioButton1.setSelected(true);
        this.formulario = formulario;
        combos();
        combo_detalle.requestFocus();
        combo_detalle.setSelectedItem("CAMA EXTRA");
        btn_agregar_detalle.doClick();
        if(formulario.equals("servicios")){
            btn_agregar.setEnabled(false);
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
        tabla_servicios = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        combo_detalle = new javax.swing.JComboBox<>();
        btn_agregar_detalle = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 565));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla_servicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Fecha", "Realizado", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_serviciosMousePressed(evt);
            }
        });
        tabla_servicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_serviciosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_serviciosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_servicios);

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        jLabel1.setText("Buscar");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nombre");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Descripcion");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Fecha");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Realizado");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Precio");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton1)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton2)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton3)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton4)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton7)
                        .addGap(0, 129, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_actualizar.setBackground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/repetir.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
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
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
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
        jLabel3.setText("Buscador de Servicios");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setText("Detalle :");

        combo_detalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_detalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combo_detalleFocusGained(evt);
            }
        });
        combo_detalle.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_detallePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combo_detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_detalleActionPerformed(evt);
            }
        });
        combo_detalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_detalleKeyPressed(evt);
            }
        });

        btn_agregar_detalle.setBackground(new java.awt.Color(255, 255, 255));
        btn_agregar_detalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/buscar3.png"))); // NOI18N
        btn_agregar_detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_detalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel20)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(566, 566, 566)
                .addComponent(btn_agregar_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(344, 344, 344)
                    .addComponent(combo_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agregar_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(combo_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       id_tabla="nada";
       pasar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        jRadioButton1.setSelected(true);
        txt_buscar.setText("");
        cargar_tabla("nombre","nombre","RIGHT JOIN servicios_cama_extra sce ON s.id = sce.servicios_id");
        combo_detalle.setSelectedItem("CAMA EXTRA");
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        menu.menu.llamar_internal(new movimientos.servicios.servicios());
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
       // referenciales.huespedes.buscador_personas("1");
       if(tabla_servicios.getSelectedRow()>-1){
       id_tabla= tabla_servicios.getValueAt(tabla_servicios.getSelectedRow(), 0).toString();
       
       }else{
           JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila"); 
       }
       
       pasar();
       
       
       
       
       dispose();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
       if(jRadioButton1.isSelected()){
            cargar_tabla("nombre","nombre",join);
        }else if(jRadioButton2.isSelected()){
           cargar_tabla("descripcion","",join);
        } else if(jRadioButton3.isSelected()){
          // cargar_tabla("fecha","",join);
        } else if(jRadioButton4.isSelected()){
            cargar_tabla("realizado","",join);
        }else if(jRadioButton7.isSelected()){
           cargar_tabla("precio","",join);
        }
        
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void tabla_serviciosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_serviciosKeyReleased

       
    }//GEN-LAST:event_tabla_serviciosKeyReleased

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
      dispose();
       id_tabla="nada";
       pasar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tabla_serviciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_serviciosMousePressed
    }//GEN-LAST:event_tabla_serviciosMousePressed

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tabla_servicios.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No existe ningun registro", "Error", JOptionPane.ERROR_MESSAGE);
                txt_buscar.setText("");
                jRadioButton1.setSelected(true);
            } else {
                
                if(jRadioButton3.isSelected() && !txt_buscar.getText().trim().isEmpty()){
                    if(con.validarFecha(txt_buscar.getText())){
                        cargar_tabla("fecha","fecha",join);
                    }else{
                    JOptionPane.showMessageDialog(null, "No es una fecha");
                    txt_buscar.setText("");
                    }
                }
                
                //comando para seleccionar la primera fila 
                //de la tabla
                tabla_servicios.getSelectionModel().setSelectionInterval(0, 0);
                //para enviar el cursor a la tabla
                tabla_servicios.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_buscarKeyPressed

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
        
        
       if(jRadioButton1.isSelected()){
            con.validar_campos(new int[]{39, 126},"letras_y_numeros", evt, new int[]{47, 164, 165, 209, 241});
           // cargar_tabla("nombre","");
        }else if(jRadioButton2.isSelected()){
           // cargar_tabla("apellido","");
           con.validar_campos(new int[]{39, 126},"letras_y_numeros", evt, new int[]{47, 164, 165, 209, 241});
        } else if(jRadioButton3.isSelected()){
            //cargar_tabla("nro_cedula","");
            con.validar_campos("numeros", evt, new int[]{47});
        } else if(jRadioButton4.isSelected()){
            //cargar_tabla("fecha_nacimiento","fecha");
              con.validar_campos(new int[]{39, 126},"letras_y_numeros", evt, new int[]{47, 164, 165, 209, 241});
        }else if(jRadioButton7.isSelected()){
            //cargar_tabla("fecha_nacimiento","fecha");
             con.validar_campos("numeros", evt);
        }
       
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void tabla_serviciosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_serviciosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_aceptar.doClick();
        }
    }//GEN-LAST:event_tabla_serviciosKeyPressed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void combo_detalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combo_detalleFocusGained
        combo_detalle.showPopup();
    }//GEN-LAST:event_combo_detalleFocusGained

    private void combo_detallePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_detallePopupMenuWillBecomeInvisible
     btn_agregar_detalle.doClick();
    }//GEN-LAST:event_combo_detallePopupMenuWillBecomeInvisible

    private void combo_detalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_detalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_detalleActionPerformed

    private void combo_detalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_detalleKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_agregar_detalle.requestFocus();
           
        }
    }//GEN-LAST:event_combo_detalleKeyPressed

    private void btn_agregar_detalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_detalleActionPerformed
       if (combo_detalle.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una servicio");
            combo_detalle.requestFocus();
        } /*else if(txt_cant.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Cargar cantidad");
            txt_cant.requestFocus();
        }*/ else {
           
           //"CAMA EXTRA", "CONSUMICION", "EQUIPAJE",
            //"ESTACIONAMIENTO", "LAVANDERIA", "LLAMADAS DESPERTADOR", "MANTENIMIENTO", "MENSAJES", "SPA Y SAUNA",
            //"SUPERVICION Y LIMPIEZA", "TRASLADO", "TURISMO"
            
           join="";
           
           if(combo_detalle.getSelectedItem().equals("CAMA EXTRA")){
               join="RIGHT JOIN servicios_cama_extra sce ON s.id = sce.servicios_id";
           }else if(combo_detalle.getSelectedItem().equals("CONSUMICION")){
               join="RIGHT JOIN servicios_consumicion sc ON s.id = sc.servicio_id";
           }else if(combo_detalle.getSelectedItem().equals("EQUIPAJE")){
               join="RIGHT JOIN servicios_equipaje se ON s.id = se.servicios_id";
           }else if(combo_detalle.getSelectedItem().equals("ESTACIONAMIENTO")){
               join="RIGHT JOIN servicios_estacionamiento se ON s.id = se.servicio_id";
           }else if(combo_detalle.getSelectedItem().equals("LAVANDERIA")){
               join="RIGHT JOIN servicios_lavanderia sl ON s.id = sl.servicios_id";
           }else if(combo_detalle.getSelectedItem().equals("LLAMADAS DESPERTADOR")){
               join="RIGHT JOIN servicios_llamadas_despertador ll ON s.id = ll.servicio_id";
           }else if(combo_detalle.getSelectedItem().equals("MANTENIMIENTO")){
               join="RIGHT JOIN servicios_mantenimiento sm ON s.id = sm.servicios_id";
           }else if(combo_detalle.getSelectedItem().equals("MENSAJES")){
               join="RIGHT JOIN servicios_mensajes sm ON s.id = sm.servicios_id";
           }else if(combo_detalle.getSelectedItem().equals("SPA Y SAUNA")){
               join="RIGHT JOIN servicios_spa_sauna ssp ON s.id = ssp.servicios_id";
           }else if(combo_detalle.getSelectedItem().equals("SUPERVICION Y LIMPIEZA")){
               join="RIGHT JOIN servicios_supervision_limpieza sl ON s.id = sl.servicios_id";
           }else if(combo_detalle.getSelectedItem().equals("TRASLADO")){
               join="RIGHT JOIN servicios_traslado st ON s.id = st.servicios_id";
           }else if(combo_detalle.getSelectedItem().equals("TURISMO")){
               join="RIGHT JOIN servicios_turismo st ON s.id = st.servicios_id";
           }
           
            cargar_tabla("nombre","nombre",join);
          //  combo_detalle.requestFocus();
        }

    }//GEN-LAST:event_btn_agregar_detalleActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_agregar_detalle;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo_detalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_servicios;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    private void cargar_tabla(String buscar, String boton, String join) {
        
        try {
            
            String sql="";
            
            if(boton.equals("")){
            
            sql = "SELECT s.id, sn.nombre, s.descripcion, s.fecha, s.realizado, s.precio\n" +
                    "FROM servicios s\n" +
                    "LEFT JOIN servicios_nombres sn ON s.nombre_id = sn.id\n" +
                    " "+join+" \n" +
                    "GROUP BY s.id\n" +
                   "having s."+buscar+" LIKE '%"+txt_buscar.getText()+"%' ORDER BY id";
            
            }else if(boton.equals("nombre")){
            
            sql = "SELECT s.id, sn.nombre, s.descripcion, s.fecha, s.realizado, s.precio\n" +
                    "FROM servicios s\n" +
                    "LEFT JOIN servicios_nombres sn ON s.nombre_id = sn.id\n" +
                    " "+join+" \n" +
                    "GROUP BY s.id\n" +
                   "having sn."+buscar+" LIKE '%"+txt_buscar.getText()+"%' ORDER BY id";
            
            }else if(boton.equals("fecha")){
            
            sql = "SELECT s.id, sn.nombre, s.descripcion, s.fecha, s.realizado, s.precio\n" +
                    "FROM servicios s\n" +
                    "LEFT JOIN servicios_nombres sn ON s.nombre_id = sn.id\n" +
                    " "+join+" \n" +
                    "GROUP BY s.id\n" +
                   "having s."+buscar+" LIKE '%"+con.convertir_fecha(txt_buscar.getText())+"%' ORDER BY id";
            
            }
            
            
            
            t.setRowCount(0);
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                t.addRow(new Object[]{con.resultado.getInt("s.id"), 
                    con.resultado.getString("sn.nombre"),
                    con.resultado.getString("s.descripcion"),
                    //num.format(con.resultado.getInt("p.nro_documento")),
                   fec.format(con.resultado.getDate("s.fecha")),
                    con.resultado.getString("s.realizado"),
                    num.format(con.resultado.getInt("s.precio"))});
                
            }  
        
        
        } catch (SQLException ex) {
            Logger.getLogger(buscador_servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
}

   

    
private void combos() {
        combo_detalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAMA EXTRA", "CONSUMICION", "EQUIPAJE",
            "ESTACIONAMIENTO", "LAVANDERIA", "LLAMADAS DESPERTADOR", "MANTENIMIENTO", "MENSAJES", "SPA Y SAUNA",
            "SUPERVICION Y LIMPIEZA", "TRASLADO", "TURISMO" }));
       // combo_detalle.setSelectedIndex(-1);
    }

    private void pasar() {
        if(formulario.equals("servicios")){
           movimientos.servicios.servicios.buscador_servicios(id_tabla, combo_detalle.getSelectedItem().toString());
       }if(formulario.equals("detalle_factura")){
           movimientos.facturacion.detalle_factura.buscador_servicios(id_tabla);
       }
    }

    
    

}