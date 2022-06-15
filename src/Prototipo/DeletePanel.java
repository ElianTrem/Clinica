package Prototipo;

import java.awt.Color;
import javax.swing.JOptionPane;


public class DeletePanel extends javax.swing.JFrame {

    private boolean estado = true;
    private int xMouse;
    private int yMouse;

    public DeletePanel() {
        initComponents();
        setLocationRelativeTo(null);
        Prototipo proto=new Prototipo();
        confiTxt.setText(proto.confirmacion+" de manera PERMANENTE?");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DelCliente = new javax.swing.JPanel();
        NombreLabel = new javax.swing.JLabel();
        EliminarBtn = new javax.swing.JPanel();
        Eliminar = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        confiTxt = new javax.swing.JLabel();
        Cancelar = new javax.swing.JPanel();
        Cancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 170));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 170));

        DelCliente.setBackground(new java.awt.Color(251, 248, 241));
        DelCliente.setFocusable(false);
        DelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        NombreLabel.setText("¿Desea eliminar el usuario ");
        DelCliente.add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 60));

        EliminarBtn.setBackground(new java.awt.Color(255, 51, 51));

        Eliminar.setBackground(new java.awt.Color(255, 0, 0));
        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Eliminar.setText(" Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarBtnLayout = new javax.swing.GroupLayout(EliminarBtn);
        EliminarBtn.setLayout(EliminarBtnLayout);
        EliminarBtnLayout.setHorizontalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EliminarBtnLayout.setVerticalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        DelCliente.add(EliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, 40));

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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        DelCliente.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        confiTxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        confiTxt.setText("nombre del usuario");
        DelCliente.add(confiTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 280, 60));

        Cancelar.setBackground(new java.awt.Color(84, 186, 185));

        Cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cancel.setText("Cancelar");
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CancelarLayout = new javax.swing.GroupLayout(Cancelar);
        Cancelar.setLayout(CancelarLayout);
        CancelarLayout.setHorizontalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancel)
                .addContainerGap())
        );
        CancelarLayout.setVerticalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        DelCliente.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, 40));

        getContentPane().add(DelCliente, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
      int idfora;
        idfora = Prototipo.identidad;
        conexionBD conex=new conexionBD();
       
       String consulta = "Delete FROM cliente WHERE idc="+idfora;
         System.out.println(consulta);
         int repuesta= conex.accionesEdit(consulta);
         
         if(repuesta>0){
         JOptionPane.showMessageDialog(null,"Clente borraro con Exito","Se Elimino Correctamente",JOptionPane.INFORMATION_MESSAGE);
           
         }else{
             JOptionPane.showMessageDialog(null,"ERROR! Porfavor verifique que el cliente no tenga una cita activa","Error Al Borrar",JOptionPane.ERROR_MESSAGE);
         }  
         dispose();
    }//GEN-LAST:event_EliminarMouseClicked

    private void EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseEntered
        EliminarBtn.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_EliminarMouseEntered

    private void EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseExited
        EliminarBtn.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_EliminarMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        dispose();
    }//GEN-LAST:event_CancelMouseClicked

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        Cancelar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_CancelMouseEntered

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        Cancelar.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_CancelMouseExited

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
            java.util.logging.Logger.getLogger(DeletePanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletePanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletePanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletePanel.class
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
                new DeletePanel().setVisible(true);   
            
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

    /**
     *
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancel;
    private javax.swing.JPanel Cancelar;
    private javax.swing.JPanel DelCliente;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JPanel EliminarBtn;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JLabel confiTxt;
    private javax.swing.JPanel header;
    // End of variables declaration//GEN-END:variables
}
