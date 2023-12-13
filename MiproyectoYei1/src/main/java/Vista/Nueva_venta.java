
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sena
 */
public class Nueva_venta extends javax.swing.JFrame {

    /**
     * Creates new form Nueva_VE
     */
    public Nueva_venta() {
        initComponents();
    }

    public JPanel getPanelventa() {
        return panelventa;
    }

    public void setPanelventa(JPanel panelventa) {
        this.panelventa = panelventa;
    }

    public JLabel getCombpago() {
        return Combpago;
    }

    public JButton getBuscarCli() {
        return BuscarCli;
    }

    public void setBuscarCli(JButton BuscarCli) {
        this.BuscarCli = BuscarCli;
    }

    public JButton getBuscarUsu() {
        return BuscarUsu;
    }

    public void setBuscarUsu(JButton BuscarUsu) {
        this.BuscarUsu = BuscarUsu;
    }

    public JButton getTbBuscarUsu() {
        return BuscarUsu;
    }

    public void setTbBuscarUsu(JButton TbBuscarUsu) {
        this.BuscarUsu = TbBuscarUsu;
    }

    public JButton getBtBuscarcli() {
        return BuscarCli;
    }

    public void setBtBuscarcli(JButton btBuscarcli) {
        this.BuscarCli = btBuscarcli;
    }

    public void setCombpago(JLabel Combpago) {
        this.Combpago = Combpago;
    }

    public JLabel getTlcliente() {
        return tlcliente;
    }

    public void setTlcliente(JLabel tlcliente) {
        this.tlcliente = tlcliente;
    }

    public JLabel getTlusuario() {
        return tlusuario;
    }

    public void setTlusuario(JLabel tlusuario) {
        this.tlusuario = tlusuario;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JComboBox<String> getCompago() {
        return compago;
    }

    public void setCompago(JComboBox<String> compago) {
        this.compago = compago;
    }

    public JTextField getTlCliente() {
        return tlCliente;
    }

    public void setTlCliente(JTextField tlCliente) {
        this.tlCliente = tlCliente;
    }

    public JTextField getTlUsuario() {
        return tlUsuario;
    }

    public void setTlUsuario(JTextField tlUsuario) {
        this.tlUsuario = tlUsuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelventa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tlcliente = new javax.swing.JLabel();
        tlusuario = new javax.swing.JLabel();
        Combpago = new javax.swing.JLabel();
        tlCliente = new javax.swing.JTextField();
        tlUsuario = new javax.swing.JTextField();
        compago = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        BuscarCli = new javax.swing.JButton();
        BuscarUsu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Nueva Venta");

        tlcliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tlcliente.setForeground(new java.awt.Color(0, 0, 255));
        tlcliente.setText("Identificador del cliente");

        tlusuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tlusuario.setForeground(new java.awt.Color(102, 102, 255));
        tlusuario.setText("Iddnetificardo del usuario");

        Combpago.setText("Tipo de pago");

        compago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecionar" }));

        btnGuardar.setText("Guardar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        BuscarCli.setText("Buscar");

        BuscarUsu.setText("Buscar");

        javax.swing.GroupLayout panelventaLayout = new javax.swing.GroupLayout(panelventa);
        panelventa.setLayout(panelventaLayout);
        panelventaLayout.setHorizontalGroup(
            panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventaLayout.createSequentialGroup()
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar)
                            .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelventaLayout.createSequentialGroup()
                                    .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelventaLayout.createSequentialGroup()
                                            .addComponent(tlusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelventaLayout.createSequentialGroup()
                                            .addComponent(tlcliente)
                                            .addGap(45, 45, 45)
                                            .addComponent(tlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BuscarCli)
                                        .addComponent(BuscarUsu)))
                                .addGroup(panelventaLayout.createSequentialGroup()
                                    .addGap(169, 169, 169)
                                    .addComponent(compago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combpago)
                            .addComponent(btnGuardar))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panelventaLayout.setVerticalGroup(
            panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlcliente)
                    .addComponent(tlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarCli))
                .addGap(46, 46, 46)
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarUsu))
                .addGap(73, 73, 73)
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combpago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(1, 1, 1)
                .addComponent(btnGuardar)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(panelventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(panelventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Nueva_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nueva_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nueva_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nueva_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nueva_venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarCli;
    private javax.swing.JButton BuscarUsu;
    private javax.swing.JLabel Combpago;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> compago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelventa;
    private javax.swing.JTextField tlCliente;
    private javax.swing.JTextField tlUsuario;
    private javax.swing.JLabel tlcliente;
    private javax.swing.JLabel tlusuario;
    // End of variables declaration//GEN-END:variables

    public Object getTxtnumerocomprobanteventa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
