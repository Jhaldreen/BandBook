
import BD.BaseDatos;
import BD.Usuarios;
import Cifrados.Hash;
import java.awt.Dialog;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class Register extends javax.swing.JFrame {
 
    Choose c = new Choose();
    
   
 
    public Register() {
        initComponents();
         
          
          
   
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
        jLabel1 = new javax.swing.JLabel();
        regEmail = new javax.swing.JLabel();
        txtEmailReg = new javax.swing.JTextField();
        regPass = new javax.swing.JLabel();
        regName = new javax.swing.JLabel();
        txtNameReg = new javax.swing.JTextField();
        txtPhoneReg = new javax.swing.JTextField();
        regPhone = new javax.swing.JLabel();
        regState = new javax.swing.JLabel();
        txtStateReg = new javax.swing.JTextField();
        txtProvinceReg = new javax.swing.JTextField();
        regProvince = new javax.swing.JLabel();
        regNum = new javax.swing.JLabel();
        txtNumReg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        regPass1 = new javax.swing.JLabel();
        txtPassConfirmReg = new javax.swing.JPasswordField();
        txtPassReg = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(114, 137, 218));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconos45x45/logo(1).png"))); // NOI18N
        jLabel1.setText("Bienvenido a la página de registro de BandBook");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        regEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regEmail.setForeground(new java.awt.Color(0, 0, 0));
        regEmail.setText("Email");

        txtEmailReg.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailReg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEmailReg.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailRegActionPerformed(evt);
            }
        });

        regPass.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regPass.setForeground(new java.awt.Color(0, 0, 0));
        regPass.setText("Contraseña");

        regName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regName.setForeground(new java.awt.Color(0, 0, 0));
        regName.setText("Nombre");

        txtNameReg.setBackground(new java.awt.Color(255, 255, 255));
        txtNameReg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNameReg.setForeground(new java.awt.Color(0, 0, 0));
        txtNameReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameRegActionPerformed(evt);
            }
        });

        txtPhoneReg.setBackground(new java.awt.Color(255, 255, 255));
        txtPhoneReg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPhoneReg.setForeground(new java.awt.Color(0, 0, 0));
        txtPhoneReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneRegActionPerformed(evt);
            }
        });

        regPhone.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regPhone.setForeground(new java.awt.Color(0, 0, 0));
        regPhone.setText("Teléfono");

        regState.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regState.setForeground(new java.awt.Color(0, 0, 0));
        regState.setText("Localidad");

        txtStateReg.setBackground(new java.awt.Color(255, 255, 255));
        txtStateReg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtStateReg.setForeground(new java.awt.Color(0, 0, 0));
        txtStateReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateRegActionPerformed(evt);
            }
        });

        txtProvinceReg.setBackground(new java.awt.Color(255, 255, 255));
        txtProvinceReg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtProvinceReg.setForeground(new java.awt.Color(0, 0, 0));
        txtProvinceReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinceRegActionPerformed(evt);
            }
        });

        regProvince.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regProvince.setForeground(new java.awt.Color(0, 0, 0));
        regProvince.setText("Provincia");

        regNum.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regNum.setForeground(new java.awt.Color(0, 0, 0));

        txtNumReg.setBackground(new java.awt.Color(255, 255, 255));
        txtNumReg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNumReg.setForeground(new java.awt.Color(0, 0, 0));
        txtNumReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumRegActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/logo.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        btnRegister.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTRARSE");
        btnRegister.setToolTipText("");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("ATRÁS");
        btnBack.setToolTipText("");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        regPass1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        regPass1.setForeground(new java.awt.Color(0, 0, 0));
        regPass1.setText("Confirmar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(txtEmailReg, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(regNum, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProvinceReg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumReg, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(regPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regPass, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassReg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassConfirmReg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(regPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtPhoneReg, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(regState, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtStateReg, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmailReg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regEmail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassReg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regPass))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassConfirmReg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regPass1))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhoneReg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regPhone, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtStateReg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regState))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtProvinceReg, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(regProvince)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumReg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regNum))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128))))
        );

        txtEmailReg.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRegActionPerformed
        
    }//GEN-LAST:event_txtEmailRegActionPerformed

    private void txtNameRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameRegActionPerformed

    private void txtPhoneRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneRegActionPerformed
        
    }//GEN-LAST:event_txtPhoneRegActionPerformed

    private void txtStateRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateRegActionPerformed

    private void txtProvinceRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinceRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinceRegActionPerformed

    private void txtNumRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumRegActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       
        BaseDatos bd = new BaseDatos();
        Usuarios usu = new Usuarios();
        
        /*Al poner un password field no s devolverá un char hay qiue pasarlo a String */
        String pass = new String(txtPassReg.getPassword());
        String passcon = new String(txtPassConfirmReg.getPassword());
        
        if(pass.equals(passcon)){
            
            String newPass = Hash.sha1(pass);//encriptar la contraseña en la BD

            int num = Integer.parseInt(txtNumReg.getText());
           
            usu.setEmail(txtEmailReg.getText());
            usu.setPass(newPass);
            usu.setName(txtNameReg.getText());
            usu.setPhone(txtPhoneReg.getText());
            usu.setState(txtStateReg.getText());
            usu.setProvince(txtProvinceReg.getText());
            usu.setNum(num);
            
            if(true){
            JOptionPane.showMessageDialog(null, "usuario registrado");
            bd.registro(usu);
            new Profile().setVisible(true);
            this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Registro incompleto");}
                
          
        }else{JOptionPane.showMessageDialog(null, "Las contraseññas no coinciden");}
          
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     new Login().setVisible(true);
     this.setVisible(false);
        
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel regEmail;
    private javax.swing.JLabel regName;
    private javax.swing.JLabel regNum;
    private javax.swing.JLabel regPass;
    private javax.swing.JLabel regPass1;
    private javax.swing.JLabel regPhone;
    private javax.swing.JLabel regProvince;
    private javax.swing.JLabel regState;
    private javax.swing.JTextField txtEmailReg;
    private javax.swing.JTextField txtNameReg;
    private javax.swing.JTextField txtNumReg;
    private javax.swing.JPasswordField txtPassConfirmReg;
    private javax.swing.JPasswordField txtPassReg;
    private javax.swing.JTextField txtPhoneReg;
    private javax.swing.JTextField txtProvinceReg;
    private javax.swing.JTextField txtStateReg;
    // End of variables declaration//GEN-END:variables
}
