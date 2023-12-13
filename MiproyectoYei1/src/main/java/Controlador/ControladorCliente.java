package Controlador;

import Modelo.ModeloCliente;
import Vista.NuevoCli;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorCliente implements ActionListener {

    NuevoCli cli = new NuevoCli();
    Principal prin = new Principal();
    ModeloCliente modcliente = new ModeloCliente();

    public ControladorCliente() {
        cli.getBtnguardar().addActionListener(this);
        cli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cli.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                try {
                    princ.iniciarPrincipal(0);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void controlCliente() throws SQLException{
        prin.setVisible(false);
        cli.setLocationRelativeTo(null);
        cli.setTitle("Nuevo Cliente");
        cli.setVisible(true);

        //lleno combo box sexo
        cli.getCmbgenecli().equals("Seleccione...");
        Map<String, Integer> combosexo = modcliente.llenarCombo("sexo");
        for (String sexo : combosexo.keySet()) {
            cli.getCmbgenecli().equals(sexo);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          
        if (e.getSource().equals(cli.getBtnguardar())) {
            //validar campos vacios
            if ((cli.getJtdocumento().getText().isEmpty()) ||(cli.getJttipodedocumento().getText().equals("Seleccione..."))|| (cli.getJtnombre().getText().isEmpty()) || (cli.getJtdirecion().getText().isEmpty())
                    || (cli.getJtcorreo().getText().isEmpty()) || (cli.getJttelefono().getText().isEmpty())|| (cli.getJtfecha()== null) 
                    || (cli.getJtcombox().getClass().equals("Seleccione..."))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar información en todos los campos");
            } else {
                //Convertimos el dato de los combox al que entiende sql
                String valorSexo = cli.getJtcombox().getClass().toString();
                int sexo = 0;
                try {
                    sexo = modcliente.llenarCombo("sexo").get(valorSexo);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                // seleccion de fecha, cambia al formato de fecha al que entiende sql
                java.util.Date fec = cli.getjDateChooser1().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);
      
                modcliente.setDoc(Integer.parseInt(cli.getJtdocumento().getText()));
                modcliente.setTipo_doc(cli.getJttipodedocumento().getText().toString());
                modcliente.setNom(cli.getJtnombre().getText());
                modcliente.setTele(cli.getJttelefono().getText());
                modcliente.setCorreo(cli.getJtcorreo().getText());
                modcliente.setDire(cli.getJtdirecion().getText());
                modcliente.setSex(sexo);
                modcliente.setFec(fecha);
                try {
                    modcliente.insertarCliente();
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                modcliente.limpiar(cli.getJpcliente().getComponents());
                
                if (cli.getBtnguardar().getText().equals("Guardar")) {
                    try {
                        modcliente.insertarCliente();
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    modcliente.limpiar(cli.getJpcliente().getComponents());
                } else {
                    try {
                        //                    modcliente.actualizarUsuario();
//                    usu.setVisible(false);
//                    prin.setVisible(true);
modcliente.mostrarTablaCliente(prin.getJtcliente(), "", "Cliente");
//                    prin.getTpPrincipal().setSelectedIndex(0);
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}