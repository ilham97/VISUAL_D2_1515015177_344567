package POSTTEST4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class FrameMouseMotion extends javax.swing.JFrame {
    private Object jTextField;

    /**
     * Creates new form FrameMouseMotion
     */
    public FrameMouseMotion() {
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

        lblStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNama = new javax.swing.JTextField();
        lblSlider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        lblStatus.setText("jLabel1");
        getContentPane().add(lblStatus);
        lblStatus.setBounds(170, 50, 70, 28);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 130, 32, 14);

        lblNama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                lblNamaCaretUpdate(evt);
            }
        });
        lblNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNamaActionPerformed(evt);
            }
        });
        getContentPane().add(lblNama);
        lblNama.setBounds(80, 160, 240, 20);

        lblSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lblSliderStateChanged(evt);
            }
        });
        getContentPane().add(lblSlider);
        lblSlider.setBounds(90, 220, 200, 26);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("50%");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 200, 27, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        lblStatus.setText("clicked at (" + evt.getX() +"," + evt.getY() + ")");
        lblStatus.setLocation(evt.getX(),evt.getY());
    }//GEN-LAST:event_formMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        lblStatus.setText("(" +evt.getX() +"," +evt.getY() + ")");
        lblStatus.setLocation(evt.getX(),evt.getY());
    }//GEN-LAST:event_formMouseMoved

    private void lblNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNamaActionPerformed

    private void lblNamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_lblNamaCaretUpdate
        // TODO add your handling code here:
        lblNama.setText(lblNama.getText());
    }//GEN-LAST:event_lblNamaCaretUpdate

    private void lblSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lblSliderStateChanged
        // TODO add your handling code here:
        jlabel2.setText(String.valueOf(lblSlider.getValue())+"%");
    }//GEN-LAST:event_lblSliderStateChanged

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
            java.util.logging.Logger.getLogger(FrameMouseMotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMouseMotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMouseMotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMouseMotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMouseMotion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lblNama;
    private javax.swing.JSlider lblSlider;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
