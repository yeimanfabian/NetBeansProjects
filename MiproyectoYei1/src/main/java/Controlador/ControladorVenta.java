package Controlador;

import Modelo.ModeloCliente;
import Modelo.modeloUsuario;
import Modelo.ModeloVenta;
import Vista.Buscar;
import Vista.Nueva_venta;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorVenta implements ActionListener, DocumentListener {

    Nueva_venta factventa = new Nueva_venta();
    Principal prin = new Principal();
    Buscar buscarusu = new Buscar();
    Buscar buscar = new Buscar();
    modeloUsuario modusu = new modeloUsuario();
    ModeloCliente modclient = new ModeloCliente();
    ModeloVenta modventas = new ModeloVenta();

    //Constructor
    public ControladorVenta() {
        factventa.getBtnGuardar().addActionListener(this);
        factventa.getBtnCancelar().addActionListener(this);
        factventa.getTlCliente().addActionListener(this);
        factventa.getTlUsuario().addActionListener(this);
        buscarusu.getTbBuscarCli().getDocument().addDocumentListener(this);
        buscar.getTbBuscarCli().getDocument().addDocumentListener(this);
        factventa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Desactiva la x que cierra el programa para que permita abrir o volcer a la ventana principal
        factventa.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                try {
                    princ.iniciarPrincipal(5);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void controlVenta() {
        prin.setVisible(false);
        factventa.setLocationRelativeTo(null);
        factventa.setTitle("Nueva Venta");
        factventa.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(factventa.getTlCliente())) {
            factventa.setVisible(false);
            factventa.setLocationRelativeTo(null);
            try {
                modclient.mostrarTablaCliente(buscar.getJbBuscar(), "", "Factura Venta");
            } catch (SQLException ex) {
                Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            factventa.setVisible(true);
            //Activar el TXTbuscar cliente
            factventa.getTlCliente().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    factventa.getTlCliente().setText("");
                    factventa.getTlCliente().setForeground(new java.awt.Color(0, 0, 0));
                }
            });
            //boton agregar en la caja de texto el cliente             
            factventa.getTlCliente().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                     int fila = buscar.getTbbuscar().rowAtPoint(e.getPoint());
                    int colum = buscar.getTbbuscar().columnAtPoint(e.getPoint());
//Activar el boton de agregar cliente
                    modclient.setDoc(Integer.parseInt(buscar.getJtTablebuscarcli().getValueAt(fila, 0).toString()));
                    if (colum == 8) {
                        factventa.setVisible(false);
                        factventa.setVisible(true);
                        Object idcliente = modclient.getDoc();
                        factventa.getTlCliente().setText(idcliente.toString());
                        JOptionPane.showMessageDialog(null, "Cliente Agregado");
                    }
                }
            });
        }

        if (e.getSource().equals(factventa.getTlusuario())) {
            factventa.setVisible(false);
            buscarusu.setLocationRelativeTo(null);
            modusu.mostrarTablaUsuario(buscarusu.getJpanelBuscarUsuario(), "", "Factura Venta");
            buscarusu.setVisible(true);
            Border borde = BorderFactory.createTitledBorder(null, "Buscar Usuario",
                    javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                    new java.awt.Font("Yu Gothic UI", 1, 36),
                    new java.awt.Color(204, 0, 204));
            buscarusu.getJtBuscarcliente().setBorder(borde);
            //Activar el TXTbuscar cliente
            buscarusu.getTbbuscar().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buscarusu.getTbbuscar().equals("");
                    buscarusu.getTbbuscar().equals(new java.awt.Color(0, 0, 0));
                }
            });
            //boton agregar en la caja de texto el usuario            
            buscarusu.getJtTablebuscarcli().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
               int fila = buscarusu.getJtTablebuscarcli().rowAtPoint(e.getPoint());
                    int colum = buscarusu.getJtTablebuscarcli().columnAtPoint(e.getPoint());

//Activar el boton de agregar usuario
                    modusu.setDoc(Integer.parseInt(buscarusu.getJpanelBuscarUsuario().toString()));
                    if (colum == 9) {
                        buscarusu.setVisible(false);
                        factventa.setVisible(true);
                        Object idusuario = modusu.getDoc();
                        factventa.getTlusuario().setText(idusuario.toString());
                        JOptionPane.showMessageDialog(null, "Usuario Agregado");
                    }
                }
            });
        }
        if (e.getSource().equals(factventa.getBtnGuardar())) {
            //validar campos vacios
            if ((factventa.getTlCliente().getText().isEmpty()) || (factventa.getTlusuario().getText().isEmpty()) || (factventa.getTxtnumerocomprobanteventa().equals(e))
                    || (factventa.getCompago().getSelectedItem().equals("Seleccione..."))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar información en los campos de Nombre y Descripción");
            } else {
                modventas.setDocuclient(Integer.parseInt(factventa.getTlcliente().getText()));
                modventas.setDocusu((Integer.parseInt(factventa.getTlUsuario().getText())));
                modventas.setComprove(Integer.parseInt(factventa.getTxtnumerocomprobanteventa().toString()));
                modventas.setTipo_pag(factventa.getCompago().getSelectedItem().toString());

                if (factventa.getBtnGuardar().getText().equals("Guardar")) {
                    try {
                        modventas.insertarVenta();
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    modventas.limpiar(factventa.getPanelventa().getComponents());
                    factventa.setVisible(false);
                    factventa.dispose();
                } else {
                    try {
                        modventas.actualizarVenta();
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    factventa.setVisible(false);
                    factventa.dispose();
                    try {
                        modventas.mostrarTablaVenta(prin.getTbtabalfactura(), "", "Factura");
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

        if (e.getSource().equals(factventa.getBtnCancelar())) {
            factventa.dispose();
        }
    }
    //Actualizar venta

    void actualizarVenta(int doc) throws SQLException {
        modventas.buscarVenta(doc);
        factventa.getTxtnumerocomprobanteventa().equals(false);
        factventa.getTlCliente().setText(String.valueOf(modventas.getDocuclient()));
        factventa.getTlUsuario().setText(String.valueOf(modventas.getDocusu()));
        factventa.getTxtnumerocomprobanteventa().equals(String.valueOf(modventas.getComprove()));

        //Llenar tipo de pago
        factventa.getCompago().setSelectedItem(modventas.getTipo_pag());

        //Cambiar Titulo
        Border borde = BorderFactory.createTitledBorder(null, "Actualizar Venta",
                javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Yu Gothic UI", 1, 36),
                new java.awt.Color(204, 0, 204));
        factventa.getPanelventa().setBorder(borde);
        prin.setVisible(false);
        factventa.setLocationRelativeTo(null);
        factventa.getBtnGuardar().setText("Actualizar");
        factventa.setVisible(true);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        try {
            modclient.mostrarTablaCliente(buscar.getJtTablebuscarcli(), buscar.getTbBuscarCli().getText(), "Nueva Venta");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        modusu.mostrarTablaUsuario(buscarusu.getJpanelBuscarUsuario(), buscarusu.getTbbuscar().getToolTipText(), "Nueva Venta");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        try {
            modclient.mostrarTablaCliente(buscar.getJtTablebuscarcli(), buscar.getTbBuscarCli().getText(), "Nueva Venta");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        modusu.mostrarTablaUsuario(buscarusu.getJpanelBuscarUsuario(), buscarusu.getTbbuscar().getToolTipText(), "Nueva Venta");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        try {
            modclient.mostrarTablaCliente(buscar.getJtTablebuscarcli(), buscar.getTbBuscarCli().getText(), "Nueva Venta");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
    

