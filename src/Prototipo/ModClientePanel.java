 package Prototipo;

import java.awt.Color;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ModClientePanel extends javax.swing.JFrame {

    private boolean estado = true;
    private int xMouse;
    private int yMouse;
    private java.util.Date fecha1;

    public ModClientePanel() {
        initComponents();
        setLocationRelativeTo(null);
        Prototipo proto = new Prototipo();
        nameTxt.setText(proto.auxname);
        lastnameTxt.setText(proto.auxape);
        numberTxt.setText(proto.auxtel);
        mailTxt.setText(proto.auxmail);
        txtFecha1.setDateFormatString("dd/MM/yyyy"); // Sirve para mostrar el formato en el date chooser
        txtFecha2.setDateFormatString("dd/MM/yyyy");
        txtFecha1.setDate(proto.auxfen); // la fecha como tal
        txtFecha2.setDate(proto.auxlc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddCliente = new javax.swing.JPanel();
        NombreLabel = new javax.swing.JLabel();
        numberTxt = new javax.swing.JTextField();
        BtnModCliente = new javax.swing.JPanel();
        Modificar = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        mailTxt = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        passLabel1 = new javax.swing.JLabel();
        lastnameTxt = new javax.swing.JTextField();
        passLabel2 = new javax.swing.JLabel();
        txtFecha1 = new com.toedter.calendar.JDateChooser();
        txtFecha2 = new com.toedter.calendar.JDateChooser();
        passLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddCliente.setBackground(new java.awt.Color(251, 248, 241));
        AddCliente.setFocusable(false);
        AddCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        NombreLabel.setText("Nombre");
        AddCliente.add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        numberTxt.setBackground(new java.awt.Color(251, 248, 241));
        numberTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        numberTxt.setText("Ingrese numero del usuario");
        numberTxt.setBorder(null);
        numberTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numberTxtMousePressed(evt);
            }
        });
        numberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTxtActionPerformed(evt);
            }
        });
        AddCliente.add(numberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 30));

        BtnModCliente.setBackground(new java.awt.Color(84, 186, 185));

        Modificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnModClienteLayout = new javax.swing.GroupLayout(BtnModCliente);
        BtnModCliente.setLayout(BtnModClienteLayout);
        BtnModClienteLayout.setHorizontalGroup(
            BtnModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnModClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Modificar)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        BtnModClienteLayout.setVerticalGroup(
            BtnModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        AddCliente.add(BtnModCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 110, 40));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setText("Correo Electronico");
        AddCliente.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        AddCliente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 20));

        header.setBackground(new java.awt.Color(251, 248, 241));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(251, 248, 241));

        exitTxt.setBackground(new java.awt.Color(251, 248, 241));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 448, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        AddCliente.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        mailTxt.setBackground(new java.awt.Color(251, 248, 241));
        mailTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        mailTxt.setText("Ingrese correo del usuario");
        mailTxt.setBorder(null);
        mailTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mailTxtMousePressed(evt);
            }
        });
        AddCliente.add(mailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 370, 30));

        apellidoTxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        apellidoTxt.setText("Apellido");
        AddCliente.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        nameTxt.setBackground(new java.awt.Color(251, 248, 241));
        nameTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nameTxt.setText("Ingrese nombre del usuario");
        nameTxt.setBorder(null);
        nameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameTxtMousePressed(evt);
            }
        });
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        AddCliente.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        AddCliente.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        AddCliente.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 180, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        AddCliente.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 370, 10));

        passLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel1.setText("Ultimo Chequeo");
        AddCliente.add(passLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        lastnameTxt.setBackground(new java.awt.Color(251, 248, 241));
        lastnameTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lastnameTxt.setText("Ingrese apellido del usuario");
        lastnameTxt.setBorder(null);
        lastnameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lastnameTxtMousePressed(evt);
            }
        });
        AddCliente.add(lastnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 170, 30));

        passLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel2.setText("Telefono");
        AddCliente.add(passLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        AddCliente.add(txtFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 190, 30));
        AddCliente.add(txtFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 190, 30));

        passLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel3.setText("Fecha de Nacimiento");
        AddCliente.add(passLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        getContentPane().add(AddCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberTxtMousePressed
        if (numberTxt.getText().isEmpty()) {
            numberTxt.setText("Ingrese numero del usuario");
            numberTxt.setForeground(Color.black);
        }
        if (nameTxt.getText().isEmpty()) {
            nameTxt.setText("Ingrese nombre del usuario");
            nameTxt.setForeground(Color.black);
        }
        if (mailTxt.getText().isEmpty()) {
            mailTxt.setText("Ingrese correo del usuario");
            mailTxt.setForeground(Color.black);
        }
        if (lastnameTxt.getText().isEmpty()) {
            lastnameTxt.setText("Ingrese apellido del usuario");
            lastnameTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_numberTxtMousePressed

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        int idfora;
        idfora = Prototipo.identidad;
        String day = null;
        String month = null;
        String day2 = null;
        String month2 = null;
        int bandera = 0;
        if (((JTextField) txtFecha1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error porfavor porporcione una fecha de nacimiento", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
            bandera++;
        }
        if (((JTextField) txtFecha2.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error porfavor porporcione una fecha de ultima visita", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
            bandera++;
        }
        int dia = txtFecha1.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes = txtFecha1.getCalendar().get(Calendar.MONTH) + 1;
        String year = Integer.toString(txtFecha1.getCalendar().get(Calendar.YEAR));
        int dia2 = txtFecha2.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes2 = txtFecha2.getCalendar().get(Calendar.MONTH) + 1;
        String year2 = Integer.toString(txtFecha2.getCalendar().get(Calendar.YEAR));

        if (dia <= 10) {//9
            day = "0" + Integer.toString(dia);
            System.out.println("No hace a la validacion"+day);
        } else {            
            day = Integer.toString(dia);
            System.out.println("Entra a la validacion"+day);
        }
        if (mes <= 10) {
            month = "0" + Integer.toString(mes);
        } else {
            month = Integer.toString(mes);
        }
        String fecha1 = (day + "/" + month + "/" + year);
        ////////////////////////////////////////////////////
        if (dia2 < 10) {
            day2 = "0" + Integer.toString(dia2);
        } else {
            day2 = Integer.toString(dia2);
        }
        if (mes2 < 10) {
            month2 = "0" + Integer.toString(mes2);
        } else {
            month2 = Integer.toString(mes2);
        }
        String fecha2 = (day2 + "/" + month2 + "/" + year2);
        ///////////////////////////////////////////////////////
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate FecNac = LocalDate.parse(fecha1, date);
        LocalDate FecAct = LocalDate.now();
        LocalDate ULTIMA = LocalDate.parse(fecha2, date);
        
        Period periodo = Period.between(FecNac, FecAct);
        String edad = (periodo.getYears() + "");

        if (nameTxt.getText().equals("Ingrese nombre del usuario") || nameTxt.getText().isEmpty() || isNumeric(nameTxt.getText()) == true) {
            bandera++;
        }
        if (lastnameTxt.getText().equals("Ingrese apellido del usuario") || lastnameTxt.getText().isEmpty() || isNumeric(lastnameTxt.getText()) == true) {
            bandera++;
        }
        if (numberTxt.getText().equals("Ingrese numero del usuario") || numberTxt.getText().isEmpty() || isNumeric(numberTxt.getText()) == false) {
            bandera++;
            if (numberTxt.getText().length() != 8) {
                JOptionPane.showMessageDialog(null, "Error Al Ingresar Datos", "Error, el numero telefono de El Salvador debe tener 8 digitos y no tener un numero", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (mailTxt.getText().equals("Ingrese correo del usuario") || mailTxt.getText().isEmpty() || isNumeric(mailTxt.getText()) == true) {
            bandera++;
        }
        if (bandera == 0) {
            conexionBD conex = new conexionBD();
            String consulta = "UPDATE cliente SET nombre= '" + nameTxt.getText() + "',apellido='" + lastnameTxt.getText() + "'," + "edad=" + edad + "," + "telefono='" + numberTxt.getText() + "'," + "mail='" + mailTxt.getText() + "'," + "fechan='" + FecNac + "'," + "lastcheck='" + ULTIMA + "' WHERE idc=" + idfora;
            int repuesta = conex.accionesEdit(consulta);
            if (repuesta > 0) {
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa", "Modificacion con exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar los datos del Cleinte", "Error Al Modificar", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_ModificarMouseClicked

    private void ModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseEntered
        BtnModCliente.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ModificarMouseEntered

    private void ModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseExited
        BtnModCliente.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_ModificarMouseExited

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(new Color(251, 248, 243));
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(new Color(251, 248, 243));
        exitTxt.setForeground(Color.gray);
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void mailTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailTxtMousePressed
        if (mailTxt.getText().equals("Ingrese correo del usuario")) {
            mailTxt.setText("");
            mailTxt.setForeground(Color.black);
        }
        if (numberTxt.getText().isEmpty()) {
            numberTxt.setText("Ingrese numero del usuario");
            numberTxt.setForeground(Color.black);
        }
        if (nameTxt.getText().isEmpty()) {
            nameTxt.setText("Ingrese nombre del usuario");
            nameTxt.setForeground(Color.black);
        }
        if (lastnameTxt.getText().isEmpty()) {
            lastnameTxt.setText("Ingrese apellido del usuario");
            lastnameTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_mailTxtMousePressed

    private void nameTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTxtMousePressed
        if (nameTxt.getText().equals("Ingrese nombre del usuario")) {
            nameTxt.setText("");
            nameTxt.setForeground(Color.black);
        }
        if (numberTxt.getText().isEmpty()) {
            numberTxt.setText("Ingrese numero del usuario");
            numberTxt.setForeground(Color.black);
        }
        if (mailTxt.getText().isEmpty()) {
            mailTxt.setText("Ingrese correo del usuario");
            mailTxt.setForeground(Color.black);
        }
        if (lastnameTxt.getText().isEmpty()) {
            lastnameTxt.setText("Ingrese apellido del usuario");
            lastnameTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_nameTxtMousePressed

    private void lastnameTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnameTxtMousePressed
        if (lastnameTxt.getText().equals("Ingrese apellido del usuario")) {
            lastnameTxt.setText("");
            lastnameTxt.setForeground(Color.black);
        }
        if (numberTxt.getText().isEmpty()) {
            numberTxt.setText("Ingrese numero del usuario");
            numberTxt.setForeground(Color.black);
        }
        if (mailTxt.getText().isEmpty()) {
            mailTxt.setText("Ingrese correo del usuario");
            mailTxt.setForeground(Color.black);
        }
        if (nameTxt.getText().isEmpty()) {
            nameTxt.setText("Ingrese nombre del usuario");
            nameTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_lastnameTxtMousePressed

    private void numberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModClientePanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModClientePanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModClientePanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModClientePanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ModClientePanel().setVisible(true);

            }
        });
    }

    private boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddCliente;
    private javax.swing.JPanel BtnModCliente;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JLabel apellidoTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField lastnameTxt;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel passLabel1;
    private javax.swing.JLabel passLabel2;
    private javax.swing.JLabel passLabel3;
    private com.toedter.calendar.JDateChooser txtFecha1;
    private com.toedter.calendar.JDateChooser txtFecha2;
    // End of variables declaration//GEN-END:variables
}
