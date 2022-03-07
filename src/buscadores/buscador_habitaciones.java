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
public class buscador_habitaciones extends javax.swing.JInternalFrame {

    conexion.conexion con = new conexion.conexion();
    javax.swing.table.DefaultTableModel t, t1, t2;
    DecimalFormat num = new DecimalFormat("#,##0");
    SimpleDateFormat fec = new SimpleDateFormat("dd/MM/yyyy");
    
     private String id_tabla="nada";
     
     private String formulario="";
    public buscador_habitaciones(String formulario) {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        t= (javax.swing.table.DefaultTableModel) tabla_habitaciones.getModel();
        t1= (javax.swing.table.DefaultTableModel) tabla_caracteristicas.getModel();
        t2= (javax.swing.table.DefaultTableModel) tabla_camas.getModel();
        cargar_tabla("nombre","habitacion_nombres");
        tabla_habitaciones.getTableHeader().setReorderingAllowed(false);
        tabla_caracteristicas.getTableHeader().setReorderingAllowed(false);
        tabla_camas.getTableHeader().setReorderingAllowed(false);
        jRadioButton1.setSelected(true);
        this.formulario = formulario;
        txt_buscar.requestFocus();
        if(formulario.equals("habitaciones")){
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
        tabla_habitaciones = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_caracteristicas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_camas = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla_habitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Capacidad", "Tipo", "Ubicacion", "Precio", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_habitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_habitacionesMousePressed(evt);
            }
        });
        tabla_habitaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_habitacionesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_habitacionesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_habitaciones);

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
        jRadioButton2.setText("Desc.");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Capacidad");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Tipo");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Ubicacion");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Precio");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Estado");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
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
                .addComponent(jRadioButton5)
                .addGap(10, 10, 10)
                .addComponent(jRadioButton6)
                .addGap(10, 10, 10)
                .addComponent(jRadioButton7)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
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
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
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
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btn_actualizar)
                .addGap(22, 22, 22)
                .addComponent(btn_cancelar)
                .addGap(22, 22, 22)
                .addComponent(btn_agregar)
                .addContainerGap(80, Short.MAX_VALUE))
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
        jLabel3.setText("Buscador de Habitaciones");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Caracteristicas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 15), new java.awt.Color(8, 175, 178))); // NOI18N

        tabla_caracteristicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Caracteristica", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_caracteristicas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Camas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 15), new java.awt.Color(8, 175, 178))); // NOI18N

        tabla_camas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Cama", "Capacidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabla_camas);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
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
        cargar_tabla("nombre","habitacion_nombres");
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        //menu.menu.llamar_internal(new referenciales.habitaciones());
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
       // referenciales.huespedes.buscador_personas("1");
       if(tabla_habitaciones.getSelectedRow()>-1){
       id_tabla= tabla_habitaciones.getValueAt(tabla_habitaciones.getSelectedRow(), 0).toString();
       
       }else{
           JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila"); 
       }
       
       
       pasar();
       
       
       
       dispose();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
       if(jRadioButton1.isSelected()){
            cargar_tabla("nombre","habitacion_nombres");
        }else if(jRadioButton2.isSelected()){
            cargar_tabla("descripcion","");
        } else if(jRadioButton3.isSelected()){
            cargar_tabla("capacidad","");
        } else if(jRadioButton4.isSelected()){
            cargar_tabla("descripcion","tipos_habitacion");
        }else if(jRadioButton5.isSelected()){
            cargar_tabla("descripcion","ubicaciones");
        }else if(jRadioButton6.isSelected()){
            cargar_tabla("precio","");
        }else if(jRadioButton7.isSelected()){
            cargar_tabla("descripcion","habitacion_estado");
        }
        
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void tabla_habitacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_habitacionesKeyReleased

    cargar_tabla1();
    cargar_tabla2();
       
    }//GEN-LAST:event_tabla_habitacionesKeyReleased

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       dispose();
       id_tabla="nada";
       pasar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tabla_habitacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_habitacionesMousePressed
        cargar_tabla1();
        cargar_tabla2();
    }//GEN-LAST:event_tabla_habitacionesMousePressed

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tabla_habitaciones.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No existe ningun registro", "Error", JOptionPane.ERROR_MESSAGE);
                txt_buscar.setText("");
                jRadioButton1.setSelected(true);
            } else {
                
                //comando para seleccionar la primera fila 
                //de la tabla
                tabla_habitaciones.getSelectionModel().setSelectionInterval(0, 0);
                //para enviar el cursor a la tabla
                tabla_habitaciones.requestFocus();
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
            con.validar_campos("numeros", evt);
        } else if(jRadioButton4.isSelected()){
            //cargar_tabla("fecha_nacimiento","fecha");
            con.validar_campos(new int[]{39, 126},"letras_y_numeros", evt, new int[]{47, 164, 165, 209, 241});
        } else if(jRadioButton5.isSelected()){
            //cargar_tabla("fecha_nacimiento","fecha");
              con.validar_campos(new int[]{39, 126},"letras_y_numeros", evt, new int[]{47, 164, 165, 209, 241});
        }else if(jRadioButton6.isSelected()){
            //cargar_tabla("fecha_nacimiento","fecha");
             con.validar_campos("numeros", evt);
        }else if(jRadioButton7.isSelected()){
            //cargar_tabla("fecha_nacimiento","fecha");
             con.validar_campos(new int[]{39, 126},"letras_y_numeros", evt, new int[]{47, 164, 165, 209, 241});
        }
       
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void tabla_habitacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_habitacionesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_aceptar.doClick();
        }
    }//GEN-LAST:event_tabla_habitacionesKeyPressed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla_camas;
    private javax.swing.JTable tabla_caracteristicas;
    private javax.swing.JTable tabla_habitaciones;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    private void cargar_tabla(String buscar, String boton) {
        
        try {
            
            String sql="";
            
            if(boton.equals("")){
            
            sql = "SELECT h.id, hn.nombre, h.descripcion, h.capacidad, t.descripcion, \n" +
                    "u.descripcion, h.precio, he.descripcion\n" +
                    "FROM habitaciones h\n" +
                    "LEFT JOIN habitacion_nombres hn ON h.nombre_id = hn.id\n" +
                    "LEFT JOIN tipos_habitacion t ON h.id_tipo_hab = t.id\n" +
                    "LEFT JOIN ubicaciones u ON h.id_ubicacion = u.id\n" +
                    "LEFT JOIN habitacion_estado he ON h.estado_id = he.id\n" +
                    "WHERE h."+buscar+" LIKE '%"+txt_buscar.getText()+"%' ORDER BY id";
            
            }else if(boton.equals("habitacion_nombres")){
            
            sql = "SELECT h.id, hn.nombre, h.descripcion, h.capacidad, t.descripcion, \n" +
                    "u.descripcion, h.precio, he.descripcion\n" +
                    "FROM habitaciones h\n" +
                    "LEFT JOIN habitacion_nombres hn ON h.nombre_id = hn.id\n" +
                    "LEFT JOIN tipos_habitacion t ON h.id_tipo_hab = t.id\n" +
                    "LEFT JOIN ubicaciones u ON h.id_ubicacion = u.id\n" +
                    "LEFT JOIN habitacion_estado he ON h.estado_id = he.id\n" +
                    "WHERE hn."+buscar+" LIKE '%"+txt_buscar.getText()+"%' ORDER BY id";
            
            }else if(boton.equals("tipos_habitacion")){
            
            sql = "SELECT h.id, hn.nombre, h.descripcion, h.capacidad, t.descripcion, \n" +
                    "u.descripcion, h.precio, he.descripcion\n" +
                    "FROM habitaciones h\n" +
                    "LEFT JOIN habitacion_nombres hn ON h.nombre_id = hn.id\n" +
                    "LEFT JOIN tipos_habitacion t ON h.id_tipo_hab = t.id\n" +
                    "LEFT JOIN ubicaciones u ON h.id_ubicacion = u.id\n" +
                    "LEFT JOIN habitacion_estado he ON h.estado_id = he.id\n" +
                    "WHERE t."+buscar+" LIKE '%"+txt_buscar.getText()+"%' ORDER BY id";
            
            }else if(boton.equals("ubicaciones")){
            
            sql = "SELECT h.id, hn.nombre, h.descripcion, h.capacidad, t.descripcion, \n" +
                    "u.descripcion, h.precio, he.descripcion\n" +
                    "FROM habitaciones h\n" +
                    "LEFT JOIN habitacion_nombres hn ON h.nombre_id = hn.id\n" +
                    "LEFT JOIN tipos_habitacion t ON h.id_tipo_hab = t.id\n" +
                    "LEFT JOIN ubicaciones u ON h.id_ubicacion = u.id\n" +
                    "LEFT JOIN habitacion_estado he ON h.estado_id = he.id\n" +
                    "WHERE u."+buscar+" LIKE '%"+txt_buscar.getText()+"%' ORDER BY id";
            
            }else if(boton.equals("habitacion_estado")){
            
            sql = "SELECT h.id, hn.nombre, h.descripcion, h.capacidad, t.descripcion, \n" +
                    "u.descripcion, h.precio, he.descripcion\n" +
                    "FROM habitaciones h\n" +
                    "LEFT JOIN habitacion_nombres hn ON h.nombre_id = hn.id\n" +
                    "LEFT JOIN tipos_habitacion t ON h.id_tipo_hab = t.id\n" +
                    "LEFT JOIN ubicaciones u ON h.id_ubicacion = u.id\n" +
                    "LEFT JOIN habitacion_estado he ON h.estado_id = he.id\n" +
                    "WHERE he."+buscar+" LIKE '%"+txt_buscar.getText()+"%' ORDER BY id";
            
            }
            
            
            
            t.setRowCount(0);
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                t.addRow(new Object[]{con.resultado.getInt("h.id"), 
                    con.resultado.getString("hn.nombre"),
                    con.resultado.getString("h.descripcion"),
                    //num.format(con.resultado.getInt("p.nro_documento")),
                    con.resultado.getString("h.capacidad"),
                    con.resultado.getString("t.descripcion"),
                    con.resultado.getString("u.descripcion"),
                    num.format(con.resultado.getInt("h.precio")),
                    con.resultado.getString("he.descripcion")});
                
            }  
        
        
        } catch (SQLException ex) {
            Logger.getLogger(buscador_habitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    private void cargar_tabla1() {
        try {
            
            String sql="";
            
         
            
            sql = "SELECT hc.id, c.descripcion, hc.cantidad\n" +
                    "FROM habitacion_caracteristicas hc\n" +
                    "LEFT JOIN caracteristicas c ON hc.id_caracteristicas = c.id\n" +
                    "WHERE hc.id_habitacion= '"+tabla_habitaciones.getValueAt(tabla_habitaciones.getSelectedRow(),0).toString()+"' ORDER BY id";
            
            
            
            //System.out.println(sql);
            
            t1.setRowCount(0);
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                t1.addRow(new Object[]{con.resultado.getInt("hc.id"), 
                    con.resultado.getString("c.descripcion"),
                    con.resultado.getString("hc.cantidad")});
                
            }  
        
        
        } catch (SQLException ex) {
            Logger.getLogger(buscador_habitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    private void cargar_tabla2() {
        try {
            
            String sql="";
            
         
            
            sql = "SELECT hc.id, c.descripcion, c.capacidad\n" +
                    "FROM habitacion_camas hc\n" +
                    "LEFT JOIN cama c ON hc.cama_id = c.id\n" +
                    "WHERE hc.habitacion_id= '"+tabla_habitaciones.getValueAt(tabla_habitaciones.getSelectedRow(),0).toString()+"' ORDER BY id";
            
            
            
            //System.out.println(sql);
            
            t2.setRowCount(0);
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                t2.addRow(new Object[]{con.resultado.getInt("hc.id"), 
                    con.resultado.getString("c.descripcion"),
                    con.resultado.getString("c.capacidad")});
                
            }  
        
        
        } catch (SQLException ex) {
            Logger.getLogger(buscador_habitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void pasar() {
       if(formulario.equals("tarifas")){
           referenciales.tarifas.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("habitaciones")){
           referenciales.habitaciones.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_cama_extra")){
           movimientos.servicios.detalle_cama_extra.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_equipaje")){
           movimientos.servicios.detalle_equipaje.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_consumicion")){
           movimientos.servicios.detalle_consumicion.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_lavanderia")){
           movimientos.servicios.detalle_lavanderia.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_llamadas_despertador")){
           movimientos.servicios.detalle_llamadas_despertador.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_mantenimiento")){
           movimientos.servicios.detalle_mantenimiento.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_limpieza")){
           movimientos.servicios.detalle_limpieza.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_reserva")){
           movimientos.recepcion.detalle_reserva.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_reserva1")){
           movimientos.recepcion.detalle_reserva.buscador_habitaciones1(id_tabla);
       }else if(formulario.equals("detalle_estadia")){
           movimientos.recepcion.detalle_estadia.buscador_habitaciones(id_tabla);
       }else if(formulario.equals("detalle_estadia1")){
           movimientos.recepcion.detalle_estadia.buscador_habitaciones1(id_tabla);
       }
    }
    
    

}