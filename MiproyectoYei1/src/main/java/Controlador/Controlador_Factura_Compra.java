package Controlador;

import Modelo.ModeloProveeedor;
import Modelo.modeloUsuario;
import Vista.Buscar;
import Vista.Nueva;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Controlador_Factura_Compra implements ActionListener {

    Nueva factnuev = new Nueva();
    Principal prin = new Principal();
    Buscar buscar = new Buscar();
    modeloUsuario modusu = new modeloUsuario();
    ModeloProveeedor modprovee = new ModeloProveeedor();

    public Controlador_Factura_Compra() {
        factnuev.getjButton1().addActionListener(this);
        factnuev.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Desactiva la x que cierra el programa para que permita abrir o volcer a la ventana principal
        factnuev.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(4);
            }
        });
    }

    public void controlFacturaCompra() {
        prin.setVisible(false);
        factnuev.setLocationRelativeTo(null);
        factnuev.setTitle("Nueva Factura Compra");
        factnuev.setVisible(true);
        buscarUsu();
//        buscarProvee();
    }

    public void buscarUsu() {
        buscar.getTbbuscar().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = buscar.getTbbuscar().rowAtPoint(e.getPoint());
                int colum = buscar.getTbbuscar().columnAtPoint(e.getPoint());
                modusu.setDoc(Integer.parseInt(buscar.getTbbuscar().getValueAt(fila, 0).toString()));

                if (buscar.getBuscar().getText().equals("Usuario")) {
                    if (colum == 9) {
                        buscar.setVisible(false);
                        factnuev.setVisible(true);
                        Object idusua = modusu.getDoc();
                        factnuev.getTxtidentiusufactcomp().equals(idusua.toString());
                        JOptionPane.showMessageDialog(null, "Usuario Agregado");
                    }
                } else {

                    if (colum == 9) {
                        buscar.setVisible(false);
                        factnuev.setVisible(true);
                        Object idprovee = modprovee.getDoc();
                        factnuev.getBtncancelarfactcomp().equals(idprovee.toString());
                        JOptionPane.showMessageDialog(null, "Proveedor Agregado");
                    }
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(factnuev.getBtnbuscarusuario())) {
            buscar.getBuscar().setText("");
            factnuev.setVisible(false);
            buscar.setLocationRelativeTo(null);
            modprovee.mostrarTablaProveedor(buscar.getJTablaBuscarusuario(), "", "Nueva Factura");
            buscar.setVisible(true);
            Border borde = BorderFactory.createTitledBorder(null, "Buscar Usuario",
                    javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                    new java.awt.Font("Yu Gothic UI", 1, 36),
                    new java.awt.Color(204, 0, 204));
            buscar.getTbbuscar();
        }

        if (e.getSource().equals(factnuev.getBtnbuscarproveedor())) {

            factnuev.setVisible(false);
            buscar.setLocationRelativeTo(null);
            modprovee.mostrarTablaProveedor(buscar.getBuscar(), "", "Factura");
            buscar.setVisible(true);
            Border borde = BorderFactory.createTitledBorder(null, "Buscar Proveedor",
                    javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                    new java.awt.Font("Yu Gothic UI", 1, 36),
                    new java.awt.Color(204, 0, 204));
            buscar.getBuscar();
        }

        if (e.getSource().equals(factnuev.getBtncancelarfactcomp())) {
            factnuev.dispose();
        }
    }

}
