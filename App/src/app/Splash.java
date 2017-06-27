package app;

import com.sun.awt.AWTUtilities;
import jframes.Inicio;

/**
 *
 * @author Jose Ma
 */
public final class Splash extends javax.swing.JFrame {

    CargarSplash hilo;
    double i = 80, j = 1;

    public Splash() {
        initComponents();
        inicio();
    }

    public void inicio() {
        setLocationRelativeTo(null);
        hilo = new CargarSplash(getBarra());
        hilo.start();
        hilo = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraStateChanged(evt);
            }
        });
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 270, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Splash.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraStateChanged
        if (barra.getValue() == i) {
            if (j != 101) {
                AWTUtilities.setWindowOpacity(this, Float.valueOf((100 - j) / 100 + "f"));
                i++;
                j += 2;
            }
        }
        if (barra.getValue() == 100) {
            Inicio i = new Inicio();
            i.setTitle("Cordouan");
            i.setLocationRelativeTo(null);
            i.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_barraStateChanged

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(javax.swing.JProgressBar barra) {
        this.barra = barra;
    }
}
