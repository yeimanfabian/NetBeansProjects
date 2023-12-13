
 
package Vista;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.util.Map;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Usuarios extends javax.swing.JFrame {

    public JButton getJbncacelar() {
        return lbcancelar;
    }

    public JLabel getTipodocu() {
        return Tipodocu;
    }

    public void setTipodocu(JLabel Tipodocu) {
        this.Tipodocu = Tipodocu;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.btnVista);
        hash = 53 * hash + Objects.hashCode(this.jComboxTipode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) obj;
        return true;
    }

    public void setJbncacelar(JButton jbncacelar) {
        this.lbcancelar = jbncacelar;
    }

    public JButton getBtnVista() {
        return btnVista;
    }

    public void setBtnVista(JButton btnVista) {
        this.btnVista = btnVista;
    }

    public JLabel getLbCargo() {
        return lbCargo;
    }

    public void setLbCargo(JLabel lbCargo) {
        this.lbCargo = lbCargo;
    }

    public JLabel getLbTelefono() {
        return lbTelefono;
    }

    public void setLbTelefono(JLabel lbTelefono) {
        this.lbTelefono = lbTelefono;
    }

    public JButton getLbbontonguardar() {
        return lbbontonguardar;
    }

    public void setLbbontonguardar(JButton lbbontonguardar) {
        this.lbbontonguardar = lbbontonguardar;
    }

    public JButton getLbcancelar() {
        return lbcancelar;
    }

    public void setLbcancelar(JButton lbcancelar) {
        this.lbcancelar = lbcancelar;
    }

    public JLabel getLbclave() {
        return lbclave;
    }

    public void setLbclave(JLabel lbclave) {
        this.lbclave = lbclave;
    }

    public JLabel getLbcorreo() {
        return lbcorreo;
    }

    public void setLbcorreo(JLabel lbcorreo) {
        this.lbcorreo = lbcorreo;
    }

    public JLabel getLbdireccion() {
        return lbdireccion;
    }

    public void setLbdireccion(JLabel lbdireccion) {
        this.lbdireccion = lbdireccion;
    }

    public JLabel getLbdocumento() {
        return lbdocumento;
    }

    public void setLbdocumento(JLabel lbdocumento) {
        this.lbdocumento = lbdocumento;
    }

    public JLabel getLbfechanaci() {
        return lbfechanaci;
    }

    public void setLbfechanaci(JLabel lbfechanaci) {
        this.lbfechanaci = lbfechanaci;
    }

    public JLabel getLbgenerosexo() {
        return lbgenerosexo;
    }

    public void setLbgenerosexo(JLabel lbgenerosexo) {
        this.lbgenerosexo = lbgenerosexo;
    }

    public JLabel getLblogin() {
        return lblogin;
    }

    public void setLblogin(JLabel lblogin) {
        this.lblogin = lblogin;
    }

    public JLabel getLbnombre() {
        return lbnombre;
    }

    public void setLbnombre(JLabel lbnombre) {
        this.lbnombre = lbnombre;
    }

    public JLabel getLbtipodocu() {
        return Tipodocu;
    }

    public void setLbtipodocu(JLabel lbtipodocu) {
        this.Tipodocu = lbtipodocu;
    }

    public JCalendar getjCalendar1() {
        return jCalendar1;
    }

    public void setjCalendar1(JCalendar jCalendar1) {
        this.jCalendar1 = jCalendar1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    
     
    public Usuarios() {
        initComponents();
    }

    public JButton getjButton1() {
        return lbbontonguardar;
    }

    public JTextField getjTefno() {
        return jTefno;
    }

    public void setjTefno(JTextField jTefno) {
        this.jTefno = jTefno;
    }

    

    public void setjButton1(JButton jButton1) {
        this.lbbontonguardar = jButton1;
    }

    public JButton getjButton2() {
        return lbcancelar;
    }

    public void setjButton2(JButton jButton2) {
        this.lbcancelar = jButton2;
    }

    public JButton getjButton3() {
        return btnVista;
    }

    public void setjButton3(JButton jButton3) {
        this.btnVista = jButton3;
    }

    public JComboBox<String> getjComboBox1() {
        return jtsexo;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jtsexo = jComboBox1;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.jDateChooser1 = jDateChooser1;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JTextField getjTextField1() {
        return tldocumento;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.tldocumento = jTextField1;
    }

    public JTextField getjTextField2() {
        return jtnombre;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jtnombre = jTextField2;
    }

    public JTextField getjTextField3() {
        return jtcorreo;
    }

    public void setjTextField3(JTextField jTextField3) {
        this.jtcorreo = jTextField3;
    }

    public JTextField getjTextField4() {
        return jtdirecion;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jtdirecion = jTextField4;
    }

    public JComboBox<String> getJcbCargo() {
        return jcbCargo;
    }

    public void setJcbCargo(JComboBox<String> jcbCargo) {
        this.jcbCargo = jcbCargo;
    }

    public JTextField getJtdirecion() {
        return jtdirecion;
    }

    public void setJtdirecion(JTextField jtdirecion) {
        this.jtdirecion = jtdirecion;
    }

    public JTextField getJtnombre() {
        return jtnombre;
    }

    public void setJtnombre(JTextField jtnombre) {
        this.jtnombre = jtnombre;
    }

    public JTextField getJtcorreo() {
        return jtcorreo;
    }

    public void setJtcorreo(JTextField jtcorreo) {
        this.jtcorreo = jtcorreo;
    }

    public JTextField getJtlogin() {
        return jtlogin;
    }

    public void setJtlogin(JTextField jtlogin) {
        this.jtlogin = jtlogin;
    }

    public JComboBox<String> getJtsexo() {
        return jtsexo;
    }

    public void setJtsexo(JComboBox<String> jtsexo) {
        this.jtsexo = jtsexo;
    }

    public JLabel getLblcontra() {
        return lbclave;
    }

    public void setLblcontra(JLabel lblcontra) {
        this.lbclave = lblcontra;
    }

    

    public JTextField getjTextField7() {
        return jtlogin;
    }

    public void setjTextField7(JTextField jTextField7) {
        this.jtlogin = jTextField7;
    }

    public JTextField getTldocumento() {
        return tldocumento;
    }

    public void setTldocumento(JTextField tldocumento) {
        this.tldocumento = tldocumento;
    }

    public JPasswordField getjPasswordUSUARIO() {
        return jPasswordUSUARIO;
    }

    public void setjPasswordUSUARIO(JPasswordField jPasswordUSUARIO) {
        this.jPasswordUSUARIO = jPasswordUSUARIO;
    }

  

    public JButton getBoton() {
        return lbbontonguardar;
    }

    public void setBoton(JButton Boton) {
        this.lbbontonguardar = Boton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbdocumento = new javax.swing.JLabel();
        tldocumento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        lbcorreo = new javax.swing.JLabel();
        jtcorreo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbdireccion = new javax.swing.JLabel();
        jtdirecion = new javax.swing.JTextField();
        lbgenerosexo = new javax.swing.JLabel();
        jtsexo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        jcbCargo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        lblogin = new javax.swing.JLabel();
        jtlogin = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lbclave = new javax.swing.JLabel();
        jPasswordUSUARIO = new javax.swing.JPasswordField();
        btnVista = new javax.swing.JButton();
        lbfechanaci = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lbbontonguardar = new javax.swing.JButton();
        lbcancelar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Tipodocu = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        jTefno = new javax.swing.JTextField();
        jComboxTipode = new javax.swing.JComboBox<>();

        jLabel10.setText("jLabel10");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.red);
        setForeground(java.awt.Color.red);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("line bor");

        lbdocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbdocumento.setForeground(new java.awt.Color(51, 51, 255));
        lbdocumento.setText("documento");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");

        lbnombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbnombre.setForeground(new java.awt.Color(51, 51, 255));
        lbnombre.setText("nombres");

        lbcorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbcorreo.setForeground(new java.awt.Color(51, 51, 255));
        lbcorreo.setText("correo");

        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setText("*");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");

        lbdireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbdireccion.setForeground(new java.awt.Color(51, 51, 255));
        lbdireccion.setText("direccion");

        lbgenerosexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbgenerosexo.setForeground(new java.awt.Color(51, 51, 255));
        lbgenerosexo.setText("genero/sexo");

        jtsexo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtsexo.setForeground(new java.awt.Color(51, 51, 255));
        jtsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Genero", "Masculino", "Femenino\t", "Otros" }));
        jtsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtsexoActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");

        lbCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(51, 51, 255));
        lbCargo.setText("cargo");

        jcbCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcbCargo.setForeground(new java.awt.Color(51, 51, 255));
        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Genero", "Masculino", "Femenino\t", "Otros" }));

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");

        lblogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblogin.setForeground(new java.awt.Color(51, 51, 255));
        lblogin.setText("login");

        jtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtloginActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");

        lbclave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbclave.setForeground(new java.awt.Color(51, 51, 255));
        lbclave.setText("clave");

        jPasswordUSUARIO.setText("jPasswordField1");

        btnVista.setIcon(new javax.swing.ImageIcon("C:\\Users\\sena\\Documents\\NetBeansProjects\\MiproyectoYei1\\src\\main\\resources\\img\\yeimar2.jpg")); // NOI18N
        btnVista.setContentAreaFilled(false);

        lbfechanaci.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbfechanaci.setForeground(new java.awt.Color(51, 51, 255));
        lbfechanaci.setText("fecha de nacimiento");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        lbbontonguardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbbontonguardar.setForeground(new java.awt.Color(0, 51, 255));
        lbbontonguardar.setText("Guardar");
        lbbontonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbbontonguardarActionPerformed(evt);
            }
        });

        lbcancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbcancelar.setForeground(new java.awt.Color(51, 51, 255));
        lbcancelar.setText("Cancelar");
        lbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbcancelarActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setText("*");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Nuevo Usuario");

        Tipodocu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tipodocu.setForeground(new java.awt.Color(0, 0, 255));
        Tipodocu.setText("Tipo de documento");

        lbTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTelefono.setForeground(new java.awt.Color(51, 51, 255));
        lbTelefono.setText("Telefono");

        jComboxTipode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboxTipodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(lbclave)
                .addGap(229, 229, 229)
                .addComponent(btnVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbcorreo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtcorreo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbgenerosexo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtdirecion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel17))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbfechanaci, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Tipodocu))
                                    .addGap(20, 20, 20)
                                    .addComponent(jComboxTipode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblogin)
                                        .addComponent(lbCargo))
                                    .addGap(72, 72, 72)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPasswordUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTefno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbbontonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lbcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(lbdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(tldocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbdocumento)
                            .addComponent(tldocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbnombre)
                            .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbcorreo)
                            .addComponent(jtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtdirecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(lbdireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(lbgenerosexo))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipodocu)
                    .addComponent(jComboxTipode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(lbCargo))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblogin)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTefno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVista)
                    .addComponent(lbclave))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbfechanaci))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbbontonguardar)
                    .addComponent(lbcancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtloginActionPerformed

    private void lbbontonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbbontonguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbbontonguardarActionPerformed

    private void lbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbcancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbcancelarActionPerformed

    private void jtsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtsexoActionPerformed

    public JComboBox<String> getjComboxTipode() {
        return jComboxTipode;
    }

    public void setjComboxTipode(JComboBox<String> jComboxTipode) {
        this.jComboxTipode = jComboxTipode;
    }

    private void jComboxTipodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboxTipodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboxTipodeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tipodocu;
    private javax.swing.JButton btnVista;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboxTipode;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordUSUARIO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTefno;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JTextField jtcorreo;
    private javax.swing.JTextField jtdirecion;
    private javax.swing.JTextField jtlogin;
    private javax.swing.JTextField jtnombre;
    private javax.swing.JComboBox<String> jtsexo;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JButton lbbontonguardar;
    private javax.swing.JButton lbcancelar;
    private javax.swing.JLabel lbclave;
    private javax.swing.JLabel lbcorreo;
    private javax.swing.JLabel lbdireccion;
    private javax.swing.JLabel lbdocumento;
    private javax.swing.JLabel lbfechanaci;
    private javax.swing.JLabel lbgenerosexo;
    private javax.swing.JLabel lblogin;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JTextField tldocumento;
    // End of variables declaration//GEN-END:variables

    public Object getCbxCargo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getJcvsexo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Map<String, Integer> llenarCombo(String rol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjCbBoxselec_sexo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjButtoguardar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjTextinsert_ususario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjTextisert_nombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjTextinsert_telefono() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjTextinser_direccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjDateChooserFecha_nacimiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjComboBoxcargo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjTextinsert_login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getjTextinsert_correo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getBtnGuardar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static class Modelo {

        public Modelo() {
        }
    }
}
