/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciales;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
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
public class huespedes extends javax.swing.JInternalFrame {

    conexion.conexion con = new conexion.conexion();
    javax.swing.table.DefaultTableModel t;
    int banPais, banDepartamento, banNuevo , baneditarnuevo= 0;
    String idPais = "", idDepartamento= "";
    DecimalFormat num = new DecimalFormat("#,##0");
    SimpleDateFormat fec = new SimpleDateFormat("dd/MM/yyyy");
    
    public huespedes() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        t= (javax.swing.table.DefaultTableModel) tabla_huespedes.getModel();
        cargar_tabla("nombre","");
        combos();
        visible(false);
        tabla_huespedes.getTableHeader().setReorderingAllowed(false);
        Botones(false);
        jRadioButton1.setSelected(true);
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
        tabla_huespedes = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_grabar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combo_personas = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txt_profesion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 436));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla_huespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Codigo", "Nombre y Apellido", "Cedula", "Fecha de Nacimiento", "Profesion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_huespedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_huespedesMousePressed(evt);
            }
        });
        tabla_huespedes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_huespedesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_huespedes);

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
        jRadioButton1.setText("Nombres");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Apellidos");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Cedula");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Fecha de Nacimiento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jRadioButton1)
                        .addGap(25, 25, 25)
                        .addComponent(jRadioButton2)
                        .addGap(25, 25, 25)
                        .addComponent(jRadioButton3)
                        .addGap(25, 25, 25)
                        .addComponent(jRadioButton4)
                        .addGap(0, 6, Short.MAX_VALUE)))
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
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        btn_borrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/borrar.png"))); // NOI18N
        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
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
                .addComponent(btn_borrar)
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
                    .addComponent(btn_borrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 130));

        jLabel2.setText("Personas :");

        combo_personas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_personas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combo_personasFocusGained(evt);
            }
        });
        combo_personas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_personasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combo_personas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_personasActionPerformed(evt);
            }
        });
        combo_personas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_personasKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_formularios/buscar3.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(combo_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combo_personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 130));

        jLabel17.setText("Profesion :");

        txt_profesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_profesionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_profesionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(txt_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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
        jLabel3.setText("Huespedes");

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
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        tabla_huespedes.setEnabled(false);
        baneditarnuevo=1;
        txt_buscar.setEnabled(false); 
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose(); 
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        if(jRadioButton1.isSelected()){
            cargar_tabla("nombre","");
        }else if(jRadioButton2.isSelected()){
            cargar_tabla("apellido","");
        } else if(jRadioButton3.isSelected()){
            cargar_tabla("nro_documento","");
        } else if(jRadioButton4.isSelected()){
            //cargar_tabla("fecha_nacimiento","fecha");
        }
        
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void tabla_huespedesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_huespedesKeyReleased
       if(baneditarnuevo==0){
        traeFila();
        Botones(true);
       }
    }//GEN-LAST:event_tabla_huespedesKeyReleased

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro", "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (mensaje == 0) {
            try {
                if (tabla_huespedes.getRowCount() >= 0) {
                    String sql = "DELETE FROM huespedes WHERE id=" + tabla_huespedes.getValueAt(tabla_huespedes.getSelectedRow(), 0).toString() + "";
                    System.out.println(sql);
                    con.actualiza2(sql);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar" + e);
            }
        }
        btn_cancelar.doClick();
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed

        if(vacio()==false){
        
        String idPersonas = con.BuscaCol("SELECT id FROM persona WHERE CONCAT(nombre, ' ',apellido) = '" + combo_personas.getSelectedItem() + "'");
        
        if (banNuevo == 1) {
            guardar(idPersonas);
        }
        if (banNuevo == 2) {
            editar(idPersonas);
        }
        btn_cancelar.doClick();
        
        }
    }//GEN-LAST:event_btn_grabarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       limpiaTxt();
        banNuevo = 0;
        Botones(false);
        visible(false);
        tabla_huespedes.setEnabled(true);
        cargar_tabla("nombre","");
        baneditarnuevo=0;
        combos();
        txt_buscar.setEnabled(true);
        jRadioButton1.setSelected(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tabla_huespedesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_huespedesMousePressed
        if(baneditarnuevo==0){
        traeFila();
        Botones(true);
        }
    }//GEN-LAST:event_tabla_huespedesMousePressed

    private void combo_personasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_personasActionPerformed
            if (!id_personas_buscador.equals("") && !id_personas_buscador.equals("nada")) {
                
                cargaCombo(combo_personas, "SELECT CONCAT(nombre, ' ',apellido) FROM persona");
       
               combo_personas.setSelectedItem(con.BuscaCol("SELECT CONCAT(nombre, ' ',apellido) FROM persona WHERE id = " + id_personas_buscador));
                
               id_personas_buscador="";
               
               txt_profesion.requestFocus();
            }else if(id_personas_buscador.equals("nada")){
                cargaCombo(combo_personas, "SELECT CONCAT(nombre, ' ',apellido) FROM persona");
                id_personas_buscador="";
            }
    }//GEN-LAST:event_combo_personasActionPerformed

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tabla_huespedes.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No existe ningun registro", "Error", JOptionPane.ERROR_MESSAGE);
                txt_buscar.setText("");
                jRadioButton1.setSelected(true);
            } else {
                if(jRadioButton4.isSelected() && !txt_buscar.getText().trim().isEmpty()){
                    if(con.validarFecha(txt_buscar.getText())){
                        cargar_tabla("fecha_nacimiento","fecha");
                    }else{
                    JOptionPane.showMessageDialog(null, "No es una fecha");
                    txt_buscar.setText("");
                    }
                }
                //comando para seleccionar la primera fila 
                //de la tabla
                tabla_huespedes.getSelectionModel().setSelectionInterval(0, 0);
                //para enviar el cursor a la tabla
                tabla_huespedes.requestFocus();
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
             con.validar_campos("numeros", evt, new int[]{47});
        }
        
       
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void txt_profesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_profesionKeyTyped
        con.validar_campos(new int[]{39, 126},"letras", evt, new int[]{164, 165, 209, 241});
    }//GEN-LAST:event_txt_profesionKeyTyped
    
    private void txt_profesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_profesionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_grabar.doClick();
        }
    }//GEN-LAST:event_txt_profesionKeyPressed

    private void combo_personasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_personasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            combo_personas.transferFocus();
        }
    }//GEN-LAST:event_combo_personasKeyPressed

    private void combo_personasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_personasPopupMenuWillBecomeInvisible
        if (combo_personas.getSelectedIndex()!=-1){
             combo_personas.transferFocus();
            }
    }//GEN-LAST:event_combo_personasPopupMenuWillBecomeInvisible

    private void combo_personasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combo_personasFocusGained
        combo_personas.showPopup(); 
    }//GEN-LAST:event_combo_personasFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu.llamar_internal(new buscadores.buscador_personas("huespedes"));
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_grabar;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JComboBox<String> combo_personas;
    private javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_huespedes;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_profesion;
    // End of variables declaration//GEN-END:variables

    private void cargar_tabla(String buscar, String boton) {
        
        try {
            
            String sql="";
            
            if(boton.equals("")){
            
            sql = "SELECT h.id, p.nro_documento, p.nombre, p.apellido, p.telefono, p.email, p.direccion,\n" +
                   "p.fecha_nacimiento, h.profesion\n" +
                   "FROM persona p\n" +
                   "RIGHT JOIN huespedes h ON h.persona_id = p.id\n" +
                   "WHERE p."+buscar+" LIKE '%"+txt_buscar.getText()+"%' ORDER BY id";
            
            }else if(boton.equals("fecha")){
            
            sql = "SELECT h.id, p.nro_documento, p.nombre, p.apellido, p.telefono, p.email, p.direccion,\n" +
                   "p.fecha_nacimiento, h.profesion\n" +
                   "FROM persona p\n" +
                   "RIGHT JOIN huespedes h ON h.persona_id = p.id\n" +
                   "WHERE p."+buscar+" LIKE '%"+con.convertir_fecha(txt_buscar.getText())+"%' ORDER BY id";
            
            }
            
            
            
            t.setRowCount(0);
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                t.addRow(new Object[]{con.resultado.getInt("h.id"), 
                    con.resultado.getString("p.nombre")+" "+con.resultado.getString("p.apellido"),
                    num.format(con.resultado.getInt("p.nro_documento")),
                    fec.format(con.resultado.getDate("p.fecha_nacimiento"))
                    , con.resultado.getString("h.profesion")});
                
            }  
        
        
        } catch (SQLException ex) {
            Logger.getLogger(huespedes.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    
    private void combos() {
        cargaCombo(combo_personas, "SELECT CONCAT(nombre, ' ',apellido) FROM persona");
        banPais = 1;
    }
    
    
    private void cargaCombo(JComboBox cbo, String sql) {
        try {
            cbo.removeAllItems();
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                cbo.addItem(con.resultado.getString("CONCAT(nombre, ' ',apellido)"));
            }
            cbo.setSelectedIndex(-1);
        } catch (SQLException ex) {
            Logger.getLogger(huespedes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void limpiaTxt() {
        txt_profesion.setText("");
        txt_buscar.setText("");
        combo_personas.setSelectedIndex(-1);
        jButton2.setEnabled(false);
        t.setRowCount(0);
    }

    private void Botones(boolean b) {
        if (b == true) {
            btn_grabar.setEnabled(true);
           // btn_nuevo.setEnabled(false);
            btn_salir.setEnabled(false);
            btn_cancelar.setEnabled(true);
            btn_editar.setEnabled(true);
            btn_borrar.setEnabled(true);
        } else {
            btn_grabar.setEnabled(false);
         //   btn_nuevo.setEnabled(true);
            btn_salir.setEnabled(true);
            btn_cancelar.setEnabled(false);
            btn_editar.setEnabled(false);
            btn_borrar.setEnabled(false);
        }
    }

    private void traeFila() {
       
        if (tabla_huespedes.getSelectedRow() >= 0) {
            try {
                String sql = "SELECT * FROM huespedes "
                        + "WHERE id ='" + tabla_huespedes.getValueAt(tabla_huespedes.getSelectedRow(), 0).toString() + "'";
                con.traeQuery(sql);
                if (con.resultado.next()) {
                    txt_profesion.setText(con.resultado.getString("profesion"));
                    combo_personas.setSelectedItem(con.BuscaCol("SELECT CONCAT(nombre, ' ',apellido) FROM persona WHERE id = " + con.resultado.getString("persona_id")));
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(huespedes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    

    private void guardar(String idpersona) {
        String sql = "INSERT INTO huespedes "
                + "(profesion,persona_id) "
                + "VALUES ('" + txt_profesion.getText() + "'," + idpersona + ") ";
        System.out.println(sql);
        con.actualiza(sql);
    }

    private void editar(String idpersona) {
        String sql = "UPDATE huespedes "
                + "SET profesion='" + txt_profesion.getText() + "',persona_id=" + idpersona + " "
                + "WHERE id='" + tabla_huespedes.getValueAt(tabla_huespedes.getSelectedRow(), 0).toString() + "' ";
        System.out.println(sql);
        con.actualiza(sql);
    }
    
    
    

    private void visible(boolean b) {

        txt_profesion.setEditable(b);
        combo_personas.setEnabled(b);
        jButton2.setEnabled(b);
    }



    private boolean vacio() {
        
        boolean vacio = false;
        String nombre="";
        
        
        
        if (combo_personas.getSelectedIndex() == -1) {
                nombre="combo";
                vacio=true;
            }
        
       
        
        if (txt_profesion.getText().trim().isEmpty()) {
                nombre="profesion";
                vacio=true;
            }
        
       
        
        if(vacio==true){
        
         JOptionPane.showMessageDialog(null, "Debe ingresar "+nombre);
         
        }
        
        return vacio;
        
    }

    
    
    
    long numero;

    private void formato_numeros(JTextField campo) {
         if(!campo.getText().trim().isEmpty()){
       // System.out.println(campo.getText().length());
       // System.out.println(numero);
         numero = Long.parseLong(campo.getText().replace(".", ""));
        campo.setText(num.format(numero));
       // }
        }
    }
    
    
    static String id_personas_buscador="";
    public static void buscador_personas(String id){
        if (!id.equals("")) {
            //System.out.println(id);
            id_personas_buscador = id; 
            combo_personas.setSelectedIndex(-1);
        }
    }
    
   
    

}
