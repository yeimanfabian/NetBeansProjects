/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.util.Objects;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.plaf.PanelUI;

/**
 *
 * @author HP
 */
public class Principal extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(Principal.class.getName());

    public JLabel getjLabel1() {
    
        return jLabel1;
        
    }

    public JTable getTBcliente() {
        return TBcliente;
    }

    public void setTBcliente(JTable TBcliente) {
        this.TBcliente = TBcliente;
    }

    public Principal(JTable TBcliente) {
        this.TBcliente = TBcliente;
    }

    public JTable getTBusuario() {
        return TBusuario;
    }

    @Override
    public String toString() {
        return "Principal{" + "TBcliente=" + TBcliente + ", TBusuario=" + TBusuario + ", Tbpro=" + Tbpro + ", btnCliente=" + btnCliente + ", btnFactura=" + btnFactura + ", btnNueva=" + btnNueva + ", btnProducto=" + btnProducto + ", btnProvedor=" + btnProvedor + ", btnUsuario=" + btnUsuario + ", jLabel1=" + jLabel1 + ", jPanel1=" + jPanel1 + ", jScrollPane1=" + jScrollPane1 + ", jScrollPane2=" + jScrollPane2 + ", jScrollPane3=" + jScrollPane3 + ", jScrollPane4=" + jScrollPane4 + ", jScrollPane5=" + jScrollPane5 + ", jScrollPane6=" + jScrollPane6 + ", jScrollPane7=" + jScrollPane7 + ", jTable1=" + jTable1 + ", jpCliente=" + jpCliente + ", jpEmpresa=" + jpEmpresa + ", jpFactura=" + jpFactura + ", jpProducto=" + jpProducto + ", jpProveedor=" + jpProveedor + ", jpUsuario=" + jpUsuario + ", jtPrincipal=" + jtPrincipal + ", tablventa=" + tablventa + ", tbTienda=" + tbTienda + ", tbUsuario=" + tbUsuario + ", tbtabalfactura=" + tbtabalfactura + '}';
    }

    public void setTBusuario(JTable TBusuario) {
        this.TBusuario = TBusuario;
    }
    
    

    public JTable getTablventa() {
        return tablventa;
    }

    public void setTablventa(JTable tablventa) {
        this.tablventa = tablventa;
    }

    public JTable getTbtabalfactura() {
        return tbtabalfactura;
    }

    public void setTbtabalfactura(JTable tbtabalfactura) {
        this.tbtabalfactura = tbtabalfactura;
    }

    public JTable getTbTablaUsu() {
        return TBusuario;
    }

    public void setTbTablaUsu(JTable tbTablaUsu) {
        this.TBusuario = tbTablaUsu;
    }

    public JLabel getTbTienda() {
        return tbTienda;
    }

    public void setTbTienda(JLabel tbTienda) {
        this.tbTienda = tbTienda;
    }

    public JTable getTbpro() {
        return Tbpro;
    }

    public void setTbpro(JTable Tbpro) {
        this.Tbpro = Tbpro;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public PanelUI getUI() {
        return jpUsuario.getUI();
    }

    public String getUIClassID() {
        return jpUsuario.getUIClassID();
    }

    public AccessibleContext getAccessibleContext() {
        return jpUsuario.getAccessibleContext();
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JPanel getJpCliente() {
        return jpCliente;
    }

    public void setJpCliente(JPanel jpCliente) {
        this.jpCliente = jpCliente;
    }

    public JPanel getJpEmpresa() {
        return jpEmpresa;
    }

    public void setJpEmpresa(JPanel jpEmpresa) {
        this.jpEmpresa = jpEmpresa;
    }

    public JPanel getJpFactura() {
        return jpFactura;
    }

    public void setJpFactura(JPanel jpFactura) {
        this.jpFactura = jpFactura;
    }

    public JPanel getJpProducto() {
        return jpProducto;
    }

    public void setJpProducto(JPanel jpProducto) {
        this.jpProducto = jpProducto;
    }

    public JPanel getJpProveedor() {
        return jpProveedor;
    }

    public void setJpProveedor(JPanel jpProveedor) {
        this.jpProveedor = jpProveedor;
    }

    public JPanel getJpUsuario() {
        return jpUsuario;
    }

    public void setJpUsuario(JPanel jpUsuario) {
        this.jpUsuario = jpUsuario;
    }

    public JLabel getLblTienda() {
        return tbTienda;
    }

    public void setLblTienda(JLabel lblTienda) {
        this.tbTienda = lblTienda;
    }

    public JButton getBtnCliente() {
        return btnCliente;
    }

    public void setBtnCliente(JButton btnCliente) {
        this.btnCliente = btnCliente;
    }

    public JButton getBtnFactura() {
        return btnFactura;
    }

    public void setBtnFactura(JButton btnFactura) {
        this.btnFactura = btnFactura;
    }

    public JButton getBtnNueva() {
        return btnNueva;
    }

    public void setBtnNueva(JButton btnNueva) {
        this.btnNueva = btnNueva;
    }

    public JButton getBtnProducto() {
        return btnProducto;
    }

    public void setBtnProducto(JButton btnProducto) {
        this.btnProducto = btnProducto;
    }

    public JButton getBtnProvedor() {
        return btnProvedor;
    }

    public void setBtnProvedor(JButton btnProvedor) {
        this.btnProvedor = btnProvedor;
    }

    public JButton getBtnUsuario() {
        return btnUsuario;
    }

    public void setBtnUsuario(JButton btnUsuario) {
        this.btnUsuario = btnUsuario;
    }
    

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    public JButton getjButton1() {
        return btnUsuario;
    }

    public void setjButton1(JButton jButton1) {
        this.btnUsuario = jButton1;
    }

    public JButton getjButton2() {
        return btnCliente;
    }

    public void setjButton2(JButton jButton2) {
        this.btnCliente = jButton2;
    }

    public JButton getjButton3() {
        return btnProvedor;
    }

    public void setjButton3(JButton jButton3) {
        this.btnProvedor = jButton3;
    }

    public JButton getjButton4() {
        return btnFactura;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public JScrollPane getjScrollPane6() {
        return jScrollPane6;
    }

    public void setjScrollPane6(JScrollPane jScrollPane6) {
        this.jScrollPane6 = jScrollPane6;
    }

    public void setjButton4(JButton jButton4) {
        this.btnFactura = jButton4;
    }

    public JButton getjButton5() {
        return btnProducto;
    }

    public void setjButton5(JButton jButton5) {
        this.btnProducto = jButton5;
    }

    public JButton getjButton6() {
        return btnNueva;
    }

    public void setjButton6(JButton jButton6) {
        this.btnNueva = jButton6;
    }

    public JTabbedPane getJtPrincipal() {
        return jtPrincipal;
    }

    public void setJtPrincipal(JTabbedPane jtPrincipal) {
        this.jtPrincipal = jtPrincipal;
    }

    public JTable getTbUsuario() {
        return tbUsuario;
    }

    public void setTbUsuario(JTable tbUsuario) {
        this.tbUsuario = tbUsuario;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.btnUsuario);
        hash = 89 * hash + Objects.hashCode(this.btnCliente);
        hash = 89 * hash + Objects.hashCode(this.btnProvedor);
        hash = 89 * hash + Objects.hashCode(this.btnProducto);
        hash = 89 * hash + Objects.hashCode(this.btnNueva);
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
        final Principal other = (Principal) obj;
        return true;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEmpresa = new javax.swing.JPanel();
        tbTienda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtPrincipal = new javax.swing.JTabbedPane();
        jpUsuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        btnUsuario = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBusuario = new javax.swing.JTable();
        jpCliente = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        TBcliente = new javax.swing.JTable();
        jpProveedor = new javax.swing.JPanel();
        btnProvedor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnNueva = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablventa = new javax.swing.JTable();
        jpProducto = new javax.swing.JPanel();
        btnProducto = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tbpro = new javax.swing.JTable();
        jpFactura = new javax.swing.JPanel();
        btnFactura = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbtabalfactura = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIENDA COM");

        tbTienda.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        tbTienda.setForeground(new java.awt.Color(51, 51, 255));
        tbTienda.setText("Tienda.com");

        javax.swing.GroupLayout jpEmpresaLayout = new javax.swing.GroupLayout(jpEmpresa);
        jpEmpresa.setLayout(jpEmpresaLayout);
        jpEmpresaLayout.setHorizontalGroup(
            jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbTienda, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addGap(331, 331, 331))
        );
        jpEmpresaLayout.setVerticalGroup(
            jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpresaLayout.createSequentialGroup()
                .addGroup(jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEmpresaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jtPrincipal.setForeground(new java.awt.Color(51, 51, 255));
        jtPrincipal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jpUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        tbUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbUsuario);

        btnUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(51, 51, 255));
        btnUsuario.setText("btnUsuario");

        TBusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TBusuario);

        javax.swing.GroupLayout jpUsuarioLayout = new javax.swing.GroupLayout(jpUsuario);
        jpUsuario.setLayout(jpUsuarioLayout);
        jpUsuarioLayout.setHorizontalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuarioLayout.createSequentialGroup()
                .addComponent(btnUsuario)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(jpUsuarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpUsuarioLayout.setVerticalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUsuario)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("Usuario", jpUsuario);

        jpCliente.setForeground(new java.awt.Color(0, 0, 255));

        btnCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(51, 51, 255));
        btnCliente.setText("btnCliente");

        TBcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(TBcliente);

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnCliente))
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jtPrincipal.addTab("Cliente", jpCliente);

        btnProvedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProvedor.setForeground(new java.awt.Color(0, 0, 255));
        btnProvedor.setText("btnProvedor");

        javax.swing.GroupLayout jpProveedorLayout = new javax.swing.GroupLayout(jpProveedor);
        jpProveedor.setLayout(jpProveedorLayout);
        jpProveedorLayout.setHorizontalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProveedorLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(btnProvedor)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jpProveedorLayout.setVerticalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProvedor)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("Proveedor", jpProveedor);

        jPanel1.setForeground(new java.awt.Color(0, 102, 255));

        btnNueva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNueva.setForeground(new java.awt.Color(0, 0, 255));
        btnNueva.setText("btnVenta");

        tablventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablventa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNueva)
                .addGap(288, 288, 288))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNueva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("venta", jPanel1);

        btnProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(0, 51, 255));
        btnProducto.setText("btnProducto");

        Tbpro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(Tbpro);

        javax.swing.GroupLayout jpProductoLayout = new javax.swing.GroupLayout(jpProducto);
        jpProducto.setLayout(jpProductoLayout);
        jpProductoLayout.setHorizontalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductoLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(btnProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jpProductoLayout.setVerticalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("Producto", jpProducto);

        btnFactura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(0, 0, 255));
        btnFactura.setText("btnFactura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        tbtabalfactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tbtabalfactura);

        javax.swing.GroupLayout jpFacturaLayout = new javax.swing.GroupLayout(jpFactura);
        jpFactura.setLayout(jpFacturaLayout);
        jpFacturaLayout.setHorizontalGroup(
            jpFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFacturaLayout.createSequentialGroup()
                .addGroup(jpFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFacturaLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnFactura))
                    .addGroup(jpFacturaLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jpFacturaLayout.setVerticalGroup(
            jpFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFactura)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("Factura", jpFactura);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jpEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBcliente;
    private javax.swing.JTable TBusuario;
    private javax.swing.JTable Tbpro;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProvedor;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpEmpresa;
    private javax.swing.JPanel jpFactura;
    private javax.swing.JPanel jpProducto;
    private javax.swing.JPanel jpProveedor;
    private javax.swing.JPanel jpUsuario;
    private javax.swing.JTabbedPane jtPrincipal;
    private javax.swing.JTable tablventa;
    private javax.swing.JLabel tbTienda;
    private javax.swing.JTable tbUsuario;
    private javax.swing.JTable tbtabalfactura;
    // End of variables declaration//GEN-END:variables

    public JTable getJtcliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void iniciarPrincipal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean validacioncorreo(String correo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void iniciarPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getJtfprovee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public Object getTpPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JPanel get() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTxtbuscarproduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getBtnProveeedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JTable getBtnProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
 
