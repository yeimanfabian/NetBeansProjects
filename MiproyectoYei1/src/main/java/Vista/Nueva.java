/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
public class Nueva extends javax.swing.JFrame {

    /**
     * Creates new form Nueva
     */
    public Nueva() {
        initComponents();
    }

    public JPanel getPanelventa() {
        return panelventa;
    }

    public void setPanelventa(JPanel panelventa) {
        this.panelventa = panelventa;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public JButton getBotguardar() {
        return botguardar;
    }

    public void setBotguardar(JButton botguardar) {
        this.botguardar = botguardar;
    }

    public JButton getBtcancelar() {
        return btcancelar;
    }

    public void setBtcancelar(JButton btcancelar) {
        this.btcancelar = btcancelar;
    }

    public JLabel getJbcedulacli() {
        return jbcedulacli;
    }

    public void setJbcedulacli(JLabel jbcedulacli) {
        this.jbcedulacli = jbcedulacli;
    }

    public JTextField getJbceduladelcli() {
        return jbceduladelcli;
    }

    public void setJbceduladelcli(JTextField jbceduladelcli) {
        this.jbceduladelcli = jbceduladelcli;
    }

    public JTextField getJbdeidenti() {
        return jbdeidenti;
    }

    public void setJbdeidenti(JTextField jbdeidenti) {
        this.jbdeidenti = jbdeidenti;
    }

    public JLabel getJbidecli() {
        return jbidecli;
    }

    public void setJbidecli(JLabel jbidecli) {
        this.jbidecli = jbidecli;
    }

    public JLabel getJbtipodepag() {
        return jbtipodepag;
    }

    public void setJbtipodepag(JLabel jbtipodepag) {
        this.jbtipodepag = jbtipodepag;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JButton getjButton1() {
        return botguardar;
    }

    public void setjButton1(JButton jButton1) {
        this.botguardar = jButton1;
    }

    public JButton getjButton2() {
        return btcancelar;
    }

    public void setjButton2(JButton jButton2) {
        this.btcancelar = jButton2;
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
        jbcedulacli = new javax.swing.JLabel();
        jbtipodepag = new javax.swing.JLabel();
        jbidecli = new javax.swing.JLabel();
        botguardar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jbceduladelcli = new javax.swing.JTextField();
        jbdeidenti = new javax.swing.JTextField();
        btcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Nueva venta");

        jbcedulacli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbcedulacli.setForeground(new java.awt.Color(51, 51, 255));
        jbcedulacli.setText("Cedula del Cliente");

        jbtipodepag.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtipodepag.setForeground(new java.awt.Color(51, 51, 255));
        jbtipodepag.setText("Tipo de pago");

        jbidecli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbidecli.setForeground(new java.awt.Color(51, 51, 255));
        jbidecli.setText("Identificaccion del usuario");

        botguardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botguardar.setForeground(new java.awt.Color(51, 51, 255));
        botguardar.setText("Guardar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleciona" }));
        jComboBox1.setToolTipText("tarjeta de credito ");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btcancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btcancelar.setForeground(new java.awt.Color(51, 51, 255));
        btcancelar.setText("cancelar");

        javax.swing.GroupLayout panelventaLayout = new javax.swing.GroupLayout(panelventa);
        panelventa.setLayout(panelventaLayout);
        panelventaLayout.setHorizontalGroup(
            panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventaLayout.createSequentialGroup()
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jbtipodepag, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelventaLayout.createSequentialGroup()
                                .addComponent(jbidecli, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbdeidenti, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelventaLayout.createSequentialGroup()
                                .addComponent(jbcedulacli, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbceduladelcli, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(botguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(btcancelar)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        panelventaLayout.setVerticalGroup(
            panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtipodepag, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcedulacli, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbceduladelcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbidecli, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbdeidenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botguardar)
                    .addComponent(btcancelar))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panelventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(panelventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botguardar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jbcedulacli;
    private javax.swing.JTextField jbceduladelcli;
    private javax.swing.JTextField jbdeidenti;
    private javax.swing.JLabel jbidecli;
    private javax.swing.JLabel jbtipodepag;
    private javax.swing.JPanel panelventa;
    // End of variables declaration//GEN-END:variables

    public Object getTxtidentiusufactcomp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getBtncancelarfactcomp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getBtnbuscarusuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getBtnbuscarproveedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTxtidenticliventa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
