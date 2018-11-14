package matriculas;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/**
 * @author isaias sanchez
 */
public class AppMatriculas extends javax.swing.JFrame {
    
    String pathL = System.getProperty("user.dir");
    Queue<String> ej1 = new PriorityQueue<>();
    Queue<String> ej2 = new PriorityQueue<>();
    Queue<String> ej3 = new PriorityQueue<>();
    //File fichero = new File(pathL);
    
    
    public AppMatriculas() {
        initComponents();
        layerLogin.setVisible(false);
        layerTomaNumero.setVisible(false);        
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(rb1);
        grupo1.add(rb2);
        llenarColas();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        layerLogin = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        cmbUsuarioLogin = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        layerTomaNumero = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTomaNumero = new javax.swing.JButton();
        txtRutTomaNumero = new javax.swing.JTextField();
        cmbCursosTomaNumero = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCarraraListado = new javax.swing.JButton();
        txtNombreCarreraListado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoCarreras = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("password");

        jLabel2.setText("Usuario");

        cmbUsuarioLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE..." }));

        btnLogin.setText("Ingresar");

        layerLogin.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerLogin.setLayer(txtPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerLogin.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerLogin.setLayer(cmbUsuarioLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerLogin.setLayer(btnLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerLoginLayout = new javax.swing.GroupLayout(layerLogin);
        layerLogin.setLayout(layerLoginLayout);
        layerLoginLayout.setHorizontalGroup(
            layerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layerLoginLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(211, Short.MAX_VALUE))
                    .addGroup(layerLoginLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layerLoginLayout.setVerticalGroup(
            layerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addContainerGap())
        );

        jLabel5.setText("Carrera");

        jLabel6.setText("RUT");

        btnTomaNumero.setText("Tomar Numero");
        btnTomaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomaNumeroActionPerformed(evt);
            }
        });

        cmbCursosTomaNumero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE..." }));

        layerTomaNumero.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerTomaNumero.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerTomaNumero.setLayer(btnTomaNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerTomaNumero.setLayer(txtRutTomaNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerTomaNumero.setLayer(cmbCursosTomaNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerTomaNumeroLayout = new javax.swing.GroupLayout(layerTomaNumero);
        layerTomaNumero.setLayout(layerTomaNumeroLayout);
        layerTomaNumeroLayout.setHorizontalGroup(
            layerTomaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerTomaNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layerTomaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layerTomaNumeroLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRutTomaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layerTomaNumeroLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCursosTomaNumero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnTomaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layerTomaNumeroLayout.setVerticalGroup(
            layerTomaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerTomaNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layerTomaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRutTomaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layerTomaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnTomaNumero)
                    .addComponent(cmbCursosTomaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        rb2.setText("Ejecutivo");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        rb1.setText("Alumno");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(rb2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(rb1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb1)
                .addGap(18, 18, 18)
                .addComponent(rb2)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1)
                    .addComponent(rb2))
                .addContainerGap())
        );

        jLabel4.setText("SELECCIONE SU FUNCION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(layerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(layerTomaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 342, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(layerTomaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INGRESO", jPanel1);

        jLabel1.setText("NOMBRE CARRERA");

        btnBuscarCarraraListado.setText("Listar");
        btnBuscarCarraraListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCarraraListadoActionPerformed(evt);
            }
        });

        listadoCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(listadoCarreras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(txtNombreCarreraListado, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarCarraraListado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCarreraListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCarraraListado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("CARRERAS", jPanel2);

        jButton1.setText("Atender Alumno");

        jTextField1.setEnabled(false);

        jLabel7.setText("Nro. Atención");

        jLabel8.setText("Rut");

        jLabel9.setText("Carrera");

        jButton2.setText("Matricular");

        jButton3.setText("Lista de Espera");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jButton4.setText("Limpiar");

        jButton5.setText("Atendidos");

        jButton6.setText("Limpiar");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel10.setText("Precio Carrera");

        jLabel11.setText("Porcentaje Beca");

        jLabel12.setText("Monto a Pagar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                                    .addComponent(jTextField6)))))
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(145, 145, 145))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MATRICULA", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCarraraListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCarraraListadoActionPerformed
        LLenaTablaCarreras();
    }//GEN-LAST:event_btnBuscarCarraraListadoActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        if (rb2.isSelected()== true) 
        {
         layerLogin.setVisible(true);
         layerTomaNumero.setVisible(false);
        }
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        if (rb1.isSelected()== true) 
        {
         layerTomaNumero.setVisible(true);
         layerLogin.setVisible(false);  
         llenaComboCarreraTomaNUmero();
        }
    }//GEN-LAST:event_rb1ActionPerformed

    private void btnTomaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomaNumeroActionPerformed
       
        if (validarRut(txtRutTomaNumero.getText()))
        {
            JOptionPane.showMessageDialog(null, "RUT VALIDO"); 
            llenaListaEsperaArchivo();
        }else
        {
            JOptionPane.showMessageDialog(null, "RUT INCORRECTO");
            limpiar("TomaNumero");
        }
    }//GEN-LAST:event_btnTomaNumeroActionPerformed

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppMatriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMatriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMatriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMatriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppMatriculas().setVisible(true);
            }
        });
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCarraraListado;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnTomaNumero;
    private javax.swing.JComboBox<String> cmbCursosTomaNumero;
    private javax.swing.JComboBox<String> cmbUsuarioLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLayeredPane layerLogin;
    private javax.swing.JLayeredPane layerTomaNumero;
    private javax.swing.JTable listadoCarreras;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextField txtNombreCarreraListado;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtRutTomaNumero;
    // End of variables declaration//GEN-END:variables

    
    public void llenaComboCarreraTomaNUmero()
    {
      File archivo ;
      FileReader fr;
      BufferedReader br;
      String[] datos;
   
      try 
      {
         archivo = new File (pathL +"\\src\\CARRERAS.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         
         while((linea=br.readLine())!=null) 
         {
          datos =linea.split(",");
          cmbCursosTomaNumero.addItem(datos[1]);    
         }
       }
      catch(IOException e){
        JOptionPane.showMessageDialog(null, "Error al cargar docentes");   
      }   
   }
   public void LLenaTablaCarreras()
    {
    
  try {
        File archivo = new File ( pathL +"\\src\\CARRERAS.txt");
        System.out.println(archivo); 
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        String datos[];       
        String linea;
        DefaultTableModel tm = new DefaultTableModel();
        String param =  txtNombreCarreraListado.getText();
        
        tm.addColumn("CODIGO_CARRERA");
        tm.addColumn("CARRERA");
        tm.addColumn("ARANCEL");

        
        while((linea=br.readLine())!=null)
         
            {
              datos = linea.split(",");
              System.out.println("dato en arreglo: " + datos[1] +" dato en combo: " + param); 
                if(param == null && datos[0] == null)
                {
                    tm.addRow(datos); 
                }else
                {
                    if (datos[1].contains(param.toUpperCase())) 
                    {
                     tm.addRow(datos);                     
                    }
                }
            }
            listadoCarreras.setModel(tm);
            fr.close();
            br.close();
         } catch (IOException ex) 
         {
            System.out.println("error al llenar tabla"+ listadoCarreras.getName()); 
         }

}

   public boolean llenaListaEsperaArchivo()
    {
    try 
        {             
            String ruta = pathL +"\\src\\LISTADEESPERA.txt";
                      
            StringBuffer s = new StringBuffer();
	    s.append(txtRutTomaNumero.getText()); 
            s.append(",");
            s.append(cmbCursosTomaNumero.getSelectedItem());
            s.append(",");
            //falta validar contar  y llenar  prioridad 
            s.append(devuelveNroAtencion());
            s.append(",");
            s.append(retornaEjecutivo());
            

              
            
            FileWriter fw = new FileWriter(ruta,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(s.toString());           
            pw.close();
            fw.close();
            limpiar("TomaNumero");            
            return true; 
        }
          catch (IOException e)
        {
            limpiar("TomaNumero"); 
           return false;
        }
}
  
    
    
   

public void llenarColas()
{
    
    File archivo;
    FileReader fr;
    BufferedReader br;
    String datos[]= null;  
      
      try 
      {
         archivo = new File (pathL +"\\src\\LISTADEESPERA.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
     
         String linea;
         while((linea=br.readLine())!=null)
         {  
             datos = linea.split(",");
             
             System.out.println(datos[3]);
             if ("ADMINISTRATIVO1".equals(datos[3])) 
             {
                 ej1.add(datos[0]+","+datos[1]+","+datos[2]+","+datos[3]+"\n");
             }
             if ("ADMINISTRATIVO2".equals(datos[3])) 
             {
                 ej2.add(datos[0]+","+datos[1]+","+datos[2]+","+datos[3]+"\n");
             }             
             if ("ADMINISTRATIVO3".equals(datos[3])) 
             {
                 ej3.add(datos[0]+","+datos[1]+","+datos[2]+","+datos[3]+"\n");
             }
          
         System.out.println("---------cola1-------------");
         System.out.println(ej1);
         System.out.println("---------fin 1-------------");
         
         
         System.out.println("---------cola2-------------");
         System.out.println(ej2);
         System.out.println("---------fin 2-------------");
         
         
         System.out.println("---------cola3-------------");
         System.out.println(ej3);
         System.out.println("---------fin 3-------------");
          
         }
      }
      catch(IOException e)
      {         
       JOptionPane.showMessageDialog(null, "Error al llenar colas");   
      } 
  }    
    
public void borrarCola()
{
 ej1.clear();
 ej2.clear();
 ej3.clear();
}
public String retornaEjecutivo()
{
  String asignado=null;
  int cant1=0;
  int cant2=0;
  int cant3=0;
  int nroAtencion=devuelveNroAtencion();

  
    if (nroAtencion == 0)
    {        
      asignado="ADMINISTRATIVO1";
    }
    else
    {
      
      File archivo;
      FileReader fr;
      BufferedReader br;
      String[] datos;
      String eje= null;
      try 
      {
         archivo = new File (pathL +"\\src\\LISTADEESPERA.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
     
         String linea;
         while((linea=br.readLine())!=null)
         {           
         datos =linea.split(",");
         
         if("ADMINISTRATIVO1".equals(datos[3]))
            {
               cant1= cant1+1;
              
            }
          if("ADMINISTRATIVO2".equals(datos[3]))
            {
              cant2= cant2+1;
            }      
            if("ADMINISTRATIVO3".equals(datos[3]))
            {
              cant3= cant3+1;
            }
                
         }
          
           System.out.println("C1------- " + cant1 + " C2------ "+cant2 + "C3----- "+cant3);

           if(cant1 <= cant2 && cant1 < cant3)
          {
             asignado = "ADMINISTRATIVO1" ;  
          }
          else
          {
            if(cant2 < cant1 && cant2 <= cant3)
            {
              asignado = "ADMINISTRATIVO2" ;  
            }
             else
            {               
               asignado = "ADMINISTRATIVO3" ;
            }
          }
          
      }
      catch(IOException e)
      { 
        JOptionPane.showMessageDialog(null, "Error al leer lista de espera contador");   
      } 
    }
  
  JOptionPane.showMessageDialog(null, "agregado correctamente a la lista de espera, su ejecutivo es: "+ asignado); 
  return asignado;
}

public int devuelveNroAtencion()
{
      int cont = 0;
      File archivo;
      FileReader fr;
      BufferedReader br;
      String[] datos;
      
      try 
      {
         archivo = new File (pathL +"\\src\\LISTADEESPERA.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
     
         String linea;
         while((linea=br.readLine())!=null)
         {           
         datos =linea.split(",");
         cont = cont+1;
        // JOptionPane.showMessageDialog(null,"contador: "+ cont);   
         }
       }
      catch(IOException e)
      {
         cont = 0;
        JOptionPane.showMessageDialog(null, "Error al leer lista de espera contador");   
      } 
  
 return cont;
}
    
public static boolean validarRut(String rut) 
 {
 
boolean validacion = false;
try
{

    rut =  rut.toUpperCase();
    rut = rut.replace(".", "");
    rut = rut.replace("-", "");
    int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1)); 
    char dv = rut.charAt(rut.length() - 1);
    int m = 0, s = 1;
    
    for (; rutAux != 0; rutAux /= 10) 
        {
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
    if (dv == (char) (s != 0 ? s + 47 : 75))
        {
        validacion = true;
        }
}
catch (java.lang.NumberFormatException e)
{
}
catch (Exception e) 
{
}
return validacion;
}
    
public void limpiar(String formulario)
{
     switch (formulario) 
     {

            case "TomaNumero":
                txtRutTomaNumero.setText("");
                cmbCursosTomaNumero.setSelectedIndex(0);
                break;

            case "Login":
                txtPass.setText("");
                cmbUsuarioLogin.setSelectedIndex(0);
                break;
    }
    
}


public static void eliminarFichero(File fichero)
{
    if (!fichero.exists()) 
    {
        System.out.println("El archivo: " + fichero.getName() + " no existe");
    } 
    else 
    {
        fichero.delete();
        System.out.println("El archivo: " + fichero.getName() + " fue eliminado");
    }
}


}



