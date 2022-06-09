package JFrames;

import BD.BaseDatos;
import BD.Mensajes;
import BD.Usuarios;
import Cifrados.Hash;
import static JFrames.Login.mandar;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import javax.script.ScriptEngine;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Antonio
 */
public class Profile extends javax.swing.JFrame {

    Connection con;
    String url = "jdbc:mysql://127.0.0.1:3306/BandBook";//indica la direccion del servidor
    ResultSet resul;// crear cursor para manejar salidas de las consultas
    BaseDatos bd = new BaseDatos();
    Usuarios usu = new Usuarios();
    Mensajes men = new Mensajes();

    public Profile() {
        initComponents();
        ModificarPerfilPanel.setVisible(false);//panel modificar por defecto no le vemos
        

        /**
         * **************** Traer datos al
         * perfil********************************
         */
        try {

            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            Statement st = (Statement) con.createStatement();
            /*recibimos el objeto para que la consulta nos saque los campos que necesitemos */
            String sql = "select * from usuarios where email ='" + mandar + "'";
            resul = st.executeQuery(sql);
            while (resul.next()) {//recorre las tablas y me dice las que hay

                // nombre 
                txtnameProfile.setText(resul.getString(4));
                btnpic.setText(resul.getString(9));
            }

            st.close();

            con.close();// cerrar la operacion
        } catch (SQLException ex) {
            System.out.println("Error al modificar los datos " + ex.getMessage());
        }

        /**
         * **************** boton  perfil********************************
         */
        try {

            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            Statement st = (Statement) con.createStatement();
            /*recibimos el objeto para que la consulta nos saque los campos que necesitemos */
            String sql = "select * from usuarios where email ='" + mandar + "'";
            resul = st.executeQuery(sql);

            while (resul.next()) {//recorre las tablas y me dice las que hay

                // nombre 
                txtName.setText(resul.getString(4));
                //phone 
                txtPhone.setText(resul.getString(5));
                // ciudad 
                txtCity.setText(resul.getString(6));
                //provincia 
                txtProvince.setText(resul.getString(7));
                //numero
                txtNum.setText(resul.getString(8));

            }

            st.close();

            con.close();// cerrar la operacion
        } catch (SQLException ex) {
            System.out.println("Error al modificar los datos " + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnpic = new javax.swing.JButton();
        lblpicProfile = new javax.swing.JLabel();
        txtnameProfile = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnModPerfil = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnMuro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnSms1 = new javax.swing.JButton();
        btnemailpass = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ModificarPerfilPanel = new javax.swing.JPanel();
        lblregName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        regPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        regState = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        regProvince = new javax.swing.JLabel();
        txtProvince = new javax.swing.JTextField();
        lblregNum = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        btnModicar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBorrarUsuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(114, 137, 218));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(44, 47, 51));
        jPanel2.setForeground(new java.awt.Color(44, 47, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 700));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnpic.setBackground(new java.awt.Color(0, 0, 0));
        btnpic.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnpic.setForeground(new java.awt.Color(255, 255, 255));
        btnpic.setText("Modificar foto");
        btnpic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpicActionPerformed(evt);
            }
        });

        lblpicProfile.setBackground(new java.awt.Color(255, 255, 255));
        lblpicProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblpicProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconos45x45/fotoPerfil.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(lblpicProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnpic)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnpic))
                    .addComponent(lblpicProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtnameProfile.setEditable(false);
        txtnameProfile.setBackground(new java.awt.Color(44, 47, 51));
        txtnameProfile.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        txtnameProfile.setForeground(new java.awt.Color(255, 255, 255));
        txtnameProfile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnameProfile.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtnameProfile.setSelectedTextColor(new java.awt.Color(44, 47, 51));
        txtnameProfile.setSelectionColor(new java.awt.Color(44, 47, 51));
        txtnameProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameProfileActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mis Mensajes");

        btnModPerfil.setBackground(new java.awt.Color(153, 170, 181));
        btnModPerfil.setForeground(new java.awt.Color(0, 0, 0));
        btnModPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconos45x45/boton-editar.png"))); // NOI18N
        btnModPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPerfilActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Modificar Perfil");

        btnMuro.setBackground(new java.awt.Color(153, 170, 181));
        btnMuro.setForeground(new java.awt.Color(0, 0, 0));
        btnMuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconos45x45/post.png"))); // NOI18N
        btnMuro.setPreferredSize(new java.awt.Dimension(134, 134));
        btnMuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Buscar en el Muro");

        btnSms1.setBackground(new java.awt.Color(153, 170, 181));
        btnSms1.setForeground(new java.awt.Color(0, 0, 0));
        btnSms1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconos45x45/mismensajes.png"))); // NOI18N
        btnSms1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSms1ActionPerformed(evt);
            }
        });

        btnemailpass.setBackground(new java.awt.Color(153, 170, 181));
        btnemailpass.setForeground(new java.awt.Color(0, 0, 0));
        btnemailpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconos45x45/arroba.png"))); // NOI18N
        btnemailpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemailpassActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificar email y pass");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnameProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSms1)
                        .addGap(42, 42, 42)
                        .addComponent(btnModPerfil))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnemailpass))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtnameProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSms1)
                    .addComponent(btnModPerfil))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnemailpass)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 700));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconos45x45/logo(1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        ModificarPerfilPanel.setBackground(new java.awt.Color(114, 137, 218));
        ModificarPerfilPanel.setPreferredSize(new java.awt.Dimension(600, 600));

        lblregName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblregName.setForeground(new java.awt.Color(0, 0, 0));
        lblregName.setText("Nombre");

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        regPhone.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regPhone.setForeground(new java.awt.Color(0, 0, 0));
        regPhone.setText("Teléfono");

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(0, 0, 0));
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        regState.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regState.setForeground(new java.awt.Color(0, 0, 0));
        regState.setText("Localidad");

        txtCity.setBackground(new java.awt.Color(255, 255, 255));
        txtCity.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCity.setForeground(new java.awt.Color(0, 0, 0));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        regProvince.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regProvince.setForeground(new java.awt.Color(0, 0, 0));
        regProvince.setText("Provincia");

        txtProvince.setBackground(new java.awt.Color(255, 255, 255));
        txtProvince.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtProvince.setForeground(new java.awt.Color(0, 0, 0));
        txtProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinceActionPerformed(evt);
            }
        });

        lblregNum.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblregNum.setForeground(new java.awt.Color(0, 0, 0));
        lblregNum.setText("Número Personas\n");
        lblregNum.setToolTipText("");

        txtNum.setBackground(new java.awt.Color(255, 255, 255));
        txtNum.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNum.setForeground(new java.awt.Color(0, 0, 0));
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });

        btnModicar.setBackground(new java.awt.Color(0, 0, 0));
        btnModicar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnModicar.setForeground(new java.awt.Color(255, 255, 255));
        btnModicar.setText("Modificar");
        btnModicar.setBorder(null);
        btnModicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModicarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBorrarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBorrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarUsuario.setText("Borrar Usuario");
        btnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModificarPerfilPanelLayout = new javax.swing.GroupLayout(ModificarPerfilPanel);
        ModificarPerfilPanel.setLayout(ModificarPerfilPanelLayout);
        ModificarPerfilPanelLayout.setHorizontalGroup(
            ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarPerfilPanelLayout.createSequentialGroup()
                .addGroup(ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                                .addComponent(regPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                                .addComponent(regState, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                                .addComponent(regProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                                .addComponent(lblregNum)
                                .addGap(18, 18, 18)
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                                .addComponent(lblregName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnModicar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        ModificarPerfilPanelLayout.setVerticalGroup(
            ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblregName)
                    .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regPhone)
                    .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regState)
                    .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regProvince)
                    .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblregNum)
                    .addGroup(ModificarPerfilPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(ModificarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModicar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel1.add(ModificarPerfilPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 602, 489));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mi Perfil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 156, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUsuarioActionPerformed
        BaseDatos bd = new BaseDatos();
        bd.borrarUsuario(mandar);
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBorrarUsuarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Profile().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModicarActionPerformed

//        try {
//            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
//            // creamos una variuable para meter el INSERT y se la pasamos al prepared statement 
//            String sql = " UPDATE usuarios SET email=?, name=?, phone=?,"
//                    + "city=?, province=?,num_people=? WHERE email ='" + mandar + "'";
//            PreparedStatement sentencia = (PreparedStatement) con.prepareStatement(sql);
//            //asignamos cada variable siendo la primera cifra el numero de columna
//            //y despues la variable 
//            String pass = new String(txtPass.getPassword());
//            String newPass = Hash.sha1(pass);//encriptar la contraseña en la BD
//            int num = Integer.parseInt(txtNum.getText());
//            sentencia.setString(1, txtEmail.getText());
//            sentencia.setString(2, txtName.getText());
//            sentencia.setString(3, txtPhone.getText());
//            sentencia.setString(4, txtCity.getText());
//            sentencia.setString(5, txtProvince.getText());
//            sentencia.setInt(6, num);
//            sentencia.executeUpdate();//ejecutamos las sentencias
//
//            sentencia.close();//cerrrar la sentencia
//            con.close();//cerrar conexion
//
//        } catch (SQLException ex) {
//            System.out.println("Error al modificar Registro " + ex);
//        }
        if (bd.modificarPerfil(usu)) {

            int num = Integer.parseInt(txtNum.getText());

            //usu.setEmail(txtEmail.getText());
            usu.setName(txtName.getText());
            usu.setPhone(txtPhone.getText());
            usu.setCity(txtCity.getText());
            usu.setProvince(txtProvince.getText());
            usu.setNum(num);

            JOptionPane.showMessageDialog(null, "Usuario modificado perfectamente");
            bd.modificarPerfil(usu);
            bd.modificarPerfilmensajes(men);//modificar el nombre de la tabla mensajes
        } else {
            JOptionPane.showMessageDialog(null, "usuario no modificado");
        }

    }//GEN-LAST:event_btnModicarActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed

    }//GEN-LAST:event_txtNumActionPerformed

    private void txtProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinceActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnMuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuroActionPerformed
        new Muro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMuroActionPerformed

    private void btnModPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPerfilActionPerformed
        ModificarPerfilPanel.setVisible(true);
    }//GEN-LAST:event_btnModPerfilActionPerformed

    private void btnpicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpicActionPerformed
        JFileChooser archivo = new JFileChooser();
        archivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileFilter filtro1 = new FileNameExtensionFilter("JPG file", "jpg");
        FileFilter filtro2 = new FileNameExtensionFilter("PNG file","png");
         int seleccion = archivo.showOpenDialog(this);
          archivo.setFileFilter(filtro1);

        archivo.addChoosableFileFilter(filtro2);

        archivo.setDialogTitle("Abrir Archivo");

        File ruta = new File("C:/");

        archivo.setCurrentDirectory(ruta);
        
         int ventana = archivo.showOpenDialog(null);
         
         if(seleccion== JFileChooser.APPROVE_OPTION){
         
         File fichero = archivo.getSelectedFile();
         
         File file = archivo.getSelectedFile();

                btnpic.setText(String.valueOf(file));

                Image foto = getToolkit().getImage(lblpicProfile.getText());

                foto = foto.getScaledInstance(210, 210, Image.SCALE_DEFAULT);

               
         
         
         }
    }//GEN-LAST:event_btnpicActionPerformed

    private void txtnameProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameProfileActionPerformed

    }//GEN-LAST:event_txtnameProfileActionPerformed

    private void btnSms1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSms1ActionPerformed
        new MyMessage().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSms1ActionPerformed

    private void btnemailpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemailpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnemailpassActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Profile p = new Profile();
                p.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ModificarPerfilPanel;
    private javax.swing.JButton btnBorrarUsuario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModPerfil;
    private javax.swing.JButton btnModicar;
    private javax.swing.JButton btnMuro;
    private javax.swing.JButton btnSms1;
    private javax.swing.JButton btnemailpass;
    private javax.swing.JButton btnpic;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblpicProfile;
    private javax.swing.JLabel lblregName;
    private javax.swing.JLabel lblregNum;
    private javax.swing.JLabel regPhone;
    private javax.swing.JLabel regProvince;
    private javax.swing.JLabel regState;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtnameProfile;
    // End of variables declaration//GEN-END:variables
}
