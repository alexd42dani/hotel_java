/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciales;

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
public class nro_documento extends javax.swing.JInternalFrame {

    conexion.conexion con = new conexion.conexion();
    javax.swing.table.DefaultTableModel t;
    int banPais, banDepartamento, banNuevo , baneditarnuevo= 0;
    
    public nro_documento() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        t= (javax.swing.table.DefaultTableModel) tabla_nro_documento.getModel();
        cargar_tabla();
        combos();
        visible(false);
        tabla_nro_documento.getTableHeader().setReorderingAllowed(false);
        Botones(false);
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
        tabla_nro_documento = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JButton();
        btn_grabar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txt_codigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_desde = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        combo_timbrado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_nro1 = new javax.swing.JTextField();
        txt_nro2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_hasta = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 411));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla_nro_documento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Codigo", "nro1", "nro2", "nro_desde", "nro_hasta", "timbrado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_nro_documento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_nro_documentoMousePressed(evt);
            }
        });
        tabla_nro_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_nro_documentoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_nro_documento);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_editar.setBackground(new java.awt.Color(255, 255, 255));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/editar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_grabar.setBackground(new java.awt.Color(255, 255, 255));
        btn_grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/grabar.png"))); // NOI18N
        btn_grabar.setText("Grabar");
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
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

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/atras5.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar)
                .addGap(5, 5, 5)
                .addComponent(btn_grabar)
                .addGap(5, 5, 5)
                .addComponent(btn_cancelar)
                .addGap(5, 5, 5)
                .addComponent(btn_salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(100, 130));

        txt_codigo.setEditable(false);
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        jLabel10.setText("Codigo :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        txt_desde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_desdeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_desdeKeyTyped(evt);
            }
        });

        jLabel17.setText("Nro Desde :");

        combo_timbrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_timbrado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combo_timbradoFocusGained(evt);
            }
        });
        combo_timbrado.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_timbradoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combo_timbrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_timbradoActionPerformed(evt);
            }
        });
        combo_timbrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_timbradoKeyPressed(evt);
            }
        });

        jLabel2.setText("Timbrado :");

        jLabel18.setText("Nro 1 :");

        txt_nro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nro1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nro1KeyTyped(evt);
            }
        });

        txt_nro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nro2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nro2KeyTyped(evt);
            }
        });

        jLabel20.setText("Nro 2 :");

        txt_hasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_hastaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hastaKeyTyped(evt);
            }
        });

        jLabel21.setText("Nro Hasta :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(42, 42, 42)
                        .addComponent(txt_nro1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(combo_timbrado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(10, 10, 10)
                        .addComponent(txt_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txt_nro2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel2)
                        .addComponent(combo_timbrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_nro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txt_nro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txt_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(79, 79, 79))
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
        jLabel3.setText("Numero de Documento");

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
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
       banNuevo = 2;
        Botones(true);
        visible(true);
        tabla_nro_documento.setEnabled(false);
        baneditarnuevo=1;
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose(); 
    }//GEN-LAST:event_btn_salirActionPerformed

    private void tabla_nro_documentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_nro_documentoKeyReleased
       if(baneditarnuevo==0){
        traeFila();
        Botones(true);
       }
    }//GEN-LAST:event_tabla_nro_documentoKeyReleased

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed

        if(vacio()==false){
        
        String idtimbrado = con.BuscaCol("SELECT id FROM timbrado WHERE nro = '" + combo_timbrado.getSelectedItem() + "'");

        if (banNuevo == 1) {
           // guardar(idDepartamento);
        }
        if (banNuevo == 2) {
            editar(idtimbrado);
        }
        btn_cancelar.doClick();
        
        }
    }//GEN-LAST:event_btn_grabarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       limpiaTxt();
        banNuevo = 0;
        Botones(false);
        visible(false);
        tabla_nro_documento.setEnabled(true);
        cargar_tabla();
        baneditarnuevo=0;
        combos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tabla_nro_documentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_nro_documentoMousePressed
        if(baneditarnuevo==0){
        traeFila();
        Botones(true);
        }
    }//GEN-LAST:event_tabla_nro_documentoMousePressed

    private void combo_timbradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_timbradoActionPerformed

    }//GEN-LAST:event_combo_timbradoActionPerformed
    
    private void combo_timbradoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_timbradoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            combo_timbrado.transferFocus();
        }
    }//GEN-LAST:event_combo_timbradoKeyPressed

    private void combo_timbradoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_timbradoPopupMenuWillBecomeInvisible
        if (combo_timbrado.getSelectedIndex()!=-1){
             combo_timbrado.transferFocus();
            }
    }//GEN-LAST:event_combo_timbradoPopupMenuWillBecomeInvisible

    private void combo_timbradoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combo_timbradoFocusGained
        combo_timbrado.showPopup(); 
    }//GEN-LAST:event_combo_timbradoFocusGained

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
       
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed
    
    }//GEN-LAST:event_txt_codigoKeyPressed

    private void txt_desdeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_desdeKeyTyped
        con.validar_campos("numeros", evt);
    }//GEN-LAST:event_txt_desdeKeyTyped

    private void txt_desdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_desdeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_grabar.doClick();
        }
    }//GEN-LAST:event_txt_desdeKeyPressed

    private void txt_nro1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nro1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nro1KeyPressed

    private void txt_nro1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nro1KeyTyped
        con.validar_campos("numeros", evt);
    }//GEN-LAST:event_txt_nro1KeyTyped

    private void txt_nro2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nro2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nro2KeyPressed

    private void txt_nro2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nro2KeyTyped
       con.validar_campos("numeros", evt);
    }//GEN-LAST:event_txt_nro2KeyTyped

    private void txt_hastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hastaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hastaKeyPressed

    private void txt_hastaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hastaKeyTyped
       con.validar_campos("numeros", evt);
    }//GEN-LAST:event_txt_hastaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_grabar;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo_timbrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_nro_documento;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion2;
    private javax.swing.JTextField txt_desde;
    private javax.swing.JTextField txt_hasta;
    private javax.swing.JTextField txt_nro1;
    private javax.swing.JTextField txt_nro2;
    // End of variables declaration//GEN-END:variables

    private void cargar_tabla() {
        
        try {
            
            String sql="";
            
            
            sql = "SELECT n.id, n.nro1, n.nro2, n.nro_utilizado, n.nro_hasta, t.nro\n" +
                    "FROM nro_documento n\n" +
                    "LEFT JOIN timbrado t ON t.id = n.timbrado_id\n" +
                    "ORDER BY id";
            
            
            
            
            
            t.setRowCount(0);
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                t.addRow(new Object[]{con.resultado.getString("n.id"),
                    con.resultado.getString("n.nro1"),
                    con.resultado.getString("n.nro2"),
                    con.resultado.getString("n.nro_utilizado"),
                    con.resultado.getString("n.nro_hasta"),
                    con.resultado.getString("t.nro")});
                
            }  
        
        
        } catch (SQLException ex) {
            Logger.getLogger(nro_documento.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    
    private void combos() {
        cargaCombo(combo_timbrado, "SELECT nro FROM timbrado ORDER BY nro");
    }
    
    
    private void cargaCombo(JComboBox cbo, String sql) {
        try {
            cbo.removeAllItems();
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                cbo.addItem(con.resultado.getString("nro"));
            }
            cbo.setSelectedIndex(-1);
        } catch (SQLException ex) {
            Logger.getLogger(nro_documento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void limpiaTxt() {
        txt_desde.setText("");
        txt_hasta.setText("");
        txt_nro1.setText("");
        txt_nro2.setText("");
        txt_codigo.setText("");
        combo_timbrado.setSelectedIndex(-1);
        t.setRowCount(0);
    }

    private void Botones(boolean b) {
        if (b == true) {
            btn_grabar.setEnabled(true);
            btn_salir.setEnabled(false);
            btn_cancelar.setEnabled(true);
            btn_editar.setEnabled(true);
        } else {
            btn_grabar.setEnabled(false);
            btn_salir.setEnabled(true);
            btn_cancelar.setEnabled(false);
            btn_editar.setEnabled(false);
        }
    }

    private void traeFila() {
        int idtimbrado;
        if (tabla_nro_documento.getSelectedRow() >= 0) {
            try {
                String sql = "SELECT * FROM nro_documento "
                        + "WHERE id ='" + tabla_nro_documento.getValueAt(tabla_nro_documento.getSelectedRow(), 0).toString() + "'";
                con.traeQuery(sql);
                if (con.resultado.next()) {
                    txt_desde.setText(con.resultado.getString("nro_utilizado"));
                    txt_hasta.setText(con.resultado.getString("nro_hasta"));
                    txt_nro1.setText(con.resultado.getString("nro1"));
                    txt_nro2.setText(con.resultado.getString("nro2"));
                    txt_codigo .setText(con.resultado.getString("id"));
                    idtimbrado = con.resultado.getInt("timbrado_id");
                    combo_timbrado.setSelectedItem(con.BuscaCol("SELECT nro FROM timbrado WHERE id = " + idtimbrado));
                        
                        
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(nro_documento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    

 /*  private void guardar(String idDepartamento) {
        String sql = "INSERT INTO ciudad "
                + "(descripcion,idDepartamento) "
                + "VALUES ('" + txt_desde.getText() + "'," + idDepartamento+ " ) ";
        System.out.println(sql);
        con.actualiza(sql);
    }*/

    private void editar(String idtimbrado) {
        String sql = "UPDATE nro_documento "
                + "SET nro1=" + txt_nro1.getText()+ ",nro2=" + txt_nro2.getText()+ ", "
                + "nro_utilizado=" + txt_desde.getText()+ ",nro_hasta=" + txt_hasta.getText()+ ", "
                + "timbrado_id=" + idtimbrado + " "
                + "WHERE id='" + tabla_nro_documento.getValueAt(tabla_nro_documento.getSelectedRow(), 0).toString() + "' ";
        System.out.println(sql);
        con.actualiza(sql);
    }
   
    
    

    private void visible(boolean b) {
        txt_desde.setEditable(b);
        txt_hasta.setEditable(b);
        txt_nro1.setEditable(b);
        txt_nro2.setEditable(b);
        //txt_codigo.setEditable(b);
        combo_timbrado.setEnabled(b);
    }

    private boolean vacio() {
        
        boolean vacio = false;
        String nombre="";
        
       
        
        if (combo_timbrado.getSelectedIndex() == -1) {
                nombre="combo";
                vacio=true;
            }
        
     
        
        if (txt_desde.getText().trim().isEmpty()) {
                nombre="desde";
                vacio=true;
            }
        
        if (txt_hasta.getText().trim().isEmpty()) {
                nombre="hasta";
                vacio=true;
            }
        
        if (txt_nro1.getText().trim().isEmpty()) {
                nombre="nro1";
                vacio=true;
            }
        
        if (txt_nro2.getText().trim().isEmpty()) {
                nombre="nro2";
                vacio=true;
            }
        
       
        
        if(vacio==true){
        
         JOptionPane.showMessageDialog(null, "Debe ingresar "+nombre);
         
        }
        
        return vacio;
        
    }

    
    

}
