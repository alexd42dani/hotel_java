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
public class buscador_personas extends javax.swing.JInternalFrame {

    conexion.conexion con = new conexion.conexion();
    javax.swing.table.DefaultTableModel t;
    DecimalFormat num = new DecimalFormat("#,##0");
    SimpleDateFormat fec = new SimpleDateFormat("dd/MM/yyyy");
    
     private String id_tabla="nada";
     
     private String formulario="";
    
    public buscador_personas(String formulario) {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        t= (javax.swing.table.DefaultTableModel) tabla_personas.getModel();
        cargar_tabla("nombre","");
        tabla_personas.getTableHeader().setReorderingAllowed(false);
        jRadioButton1.setSelected(true);
        this.formulario = formulario;
        txt_buscar.requestFocus();
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
        tabla_personas = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 474));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla_personas.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Nombre y Apellido", "Documento", "Telefono", "Fecha de Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_personasMousePressed(evt);
            }
        });
        tabla_personas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_personasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_personasKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_personas);

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
        jRadioButton3.setText("Documento");

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
                        .addGap(0, 0, Short.MAX_VALUE)
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
                        .addGap(0, 0, Short.MAX_VALUE)))
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
        jLabel3.setText("Buscador de Personas");

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
       id_tabla="nada";
       pasar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        jRadioButton1.setSelected(true);
        txt_buscar.setText("");
        cargar_tabla("nombre", "");
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        menu.menu.llamar_internal(new referenciales.personas());
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
       // referenciales.huespedes.buscador_personas("1");
       if(tabla_personas.getSelectedRow()>-1){
       id_tabla= tabla_personas.getValueAt(tabla_personas.getSelectedRow(), 0).toString();
       
       }else{
           JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila"); 
       }
       
       pasar();
       
       
       
       
       dispose();
    }//GEN-LAST:event_btn_aceptarActionPerformed

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

    private void tabla_personasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_personasKeyReleased

    
       
    }//GEN-LAST:event_tabla_personasKeyReleased

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       dispose();
       id_tabla="nada";
       pasar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tabla_personasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_personasMousePressed

    }//GEN-LAST:event_tabla_personasMousePressed

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tabla_personas.getRowCount() == 0) {
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
                tabla_personas.getSelectionModel().setSelectionInterval(0, 0);
                //para enviar el cursor a la tabla
                tabla_personas.requestFocus();
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

    private void tabla_personasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_personasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_aceptar.doClick();
        }
    }//GEN-LAST:event_tabla_personasKeyPressed
    

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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_personas;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    private void cargar_tabla(String buscar, String boton) {
        
        try {
            
            String sql="";
            
            if(boton.equals("")){
            
            sql = "SELECT p.id, p.nro_documento, p.nombre, p.apellido, p.telefono, p.email, p.direccion,\n" +
                            "p.fecha_nacimiento, c.descripcion, ps.descripcion \n" +
                            "FROM persona p\n" +
                            "LEFT JOIN ciudad c ON p.ciudad_id = c.id\n" +
                            "LEFT JOIN departamento d ON c.idDepartamento = d.id\n" +
                            "LEFT JOIN pais ps ON d.idPais = ps.id\n" +
                            "WHERE p."+buscar+" LIKE '%"+txt_buscar.getText()+"%' ORDER BY id";
            
            }else if(boton.equals("fecha")){
            
            sql = "SELECT p.id, p.nro_documento, p.nombre, p.apellido, p.telefono, p.email, p.direccion,\n" +
                            "p.fecha_nacimiento, c.descripcion, ps.descripcion \n" +
                            "FROM persona p\n" +
                            "LEFT JOIN ciudad c ON p.ciudad_id = c.id\n" +
                            "LEFT JOIN departamento d ON c.idDepartamento = d.id\n" +
                            "LEFT JOIN pais ps ON d.idPais = ps.id\n" +
                            "WHERE p."+buscar+" LIKE '%"+con.convertir_fecha(txt_buscar.getText())+"%' ORDER BY id";
            
            }
            
            
            
            t.setRowCount(0);
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(sql);
            while (con.resultado.next()) {
                t.addRow(new Object[]{con.resultado.getInt("p.id"), 
                    con.resultado.getString("p.nombre")+" "+con.resultado.getString("p.apellido"),
                    num.format(con.resultado.getInt("p.nro_documento")), con.resultado.getString("p.telefono"),
                    fec.format(con.resultado.getDate("p.fecha_nacimiento"))});
                
            }  
        
        
        } catch (SQLException ex) {
            Logger.getLogger(buscador_personas.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    private void pasar() {
        if(formulario.equals("huespedes")){
           referenciales.huespedes.buscador_personas(id_tabla);
       }else if(formulario.equals("empleado")){
           referenciales.empleado.buscador_personas(id_tabla);
       }else if(formulario.equals("detalle_reserva")){
           movimientos.recepcion.detalle_reserva.buscador_personas(id_tabla);
       }else if(formulario.equals("detalle_estadia")){
           movimientos.recepcion.detalle_estadia.buscador_personas(id_tabla);
       }
    }

    


    
    

}
