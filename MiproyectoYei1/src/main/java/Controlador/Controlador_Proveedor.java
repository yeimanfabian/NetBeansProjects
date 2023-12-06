package Controlador;

import Modelo.ModeloProveeedor;
import Vista.Nuevo_provedor;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador_Proveedor implements ActionListener {

    Nuevo_provedor provee = new Nuevo_provedor();
    Principal prin = new Principal();
    ModeloProveeedor modproveedor = new ModeloProveeedor();

    public Controlador_Proveedor() {
        provee.getjButton1().addActionListener(this);
        provee.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        provee.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Principal princ = new Principal();
                princ.iniciarPrincipal(0);

            }
        });
    }

    public void controlProveedor() {
        prin.setVisible(false);
        provee.setLocationRelativeTo(null);
        provee.setTitle("Nuevo Proveedor");
        provee.setVisible(true);

        //lleno combo box sexo
        provee.getComboboxtipodepersona().addItem("Seleccione...");
        Map<String, Integer> combosexo = modproveedor.llenarCombo("sexo");
        for (String sexo : combosexo.keySet()) {
            provee.getComboxgerosexo().addItem(sexo);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!e.getSource().equals(provee.getjButton1())) {
        } else {
            //validar campos vacios
            if ((provee.getComboxtipodocu().getSelectedItem().equals(e)) || (provee.getComboxtipodocu().getSelectedItem().equals("Seleccione...")) || (provee.getJtnombre().getText().isEmpty()) || (provee.getjTextField6().getText().isEmpty())
                    || (provee.getjTextField4().getText().isEmpty()) || (provee.getjTextField3().getText().isEmpty()) || (provee.getjDateChooser1().getDate() == null)
                    || (provee.getComboboxtipodepersona().getSelectedItem().equals("Seleccione...")) || (provee.getComboxgerosexo().getSelectedItem().equals("Seleccione..."))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar información en todos los campos");
            } else {
                //Convertimos el dato de los combox al que entiende sql
                String valorSexo = provee.getComboxgerosexo().getSelectedItem().toString();
                int sexo = modproveedor.llenarCombo("sexo").get(valorSexo);

                // seleccion de fecha, cambia al formato de fecha al que entiende sql
                java.util.Date fec = provee.getjDateChooser1().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);

                modproveedor.setTipo_docu(provee.getComboxtipodocu().getSelectedItem().toString());
                modproveedor.setNom(provee.getJtnombre().getText());
                modproveedor.setDire(provee.getjTextField6().getText());
                modproveedor.setTipo_per(provee.getComboboxtipodepersona().getSelectedItem().toString());
                modproveedor.setCorreo(provee.getjTextField4().getText());
                modproveedor.setTele(provee.getjTextField3().getText());
                modproveedor.setFec((Date) provee.getjDateChooser1().getDate());
                modproveedor.setSex(sexo);
//                        modproveedor.insertarProveedor();
//                        modproveedor.limpiar(provee.getJpProvee().getComponents());
                if (prin.validacioncorreo(modproveedor.getCorreo()) == true) {
                    if (!provee.getjButton1().getText().equals("Guardar")) {

                        modproveedor.actualizarProveedor();

                        provee.setVisible(false);
                        prin.getJtPrincipal().setSelectedIndex(1);
                        modproveedor.mostrarTablaProveedor(prin.getBtnProvedor(), "", "Provedor");
                        provee.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "Exito");
                        modproveedor.insertarProveedor();
                        modproveedor.limpiar(provee.getjScrollPane1().getComponents());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Correo Invalido");
                }

            }
        }

    }

}
