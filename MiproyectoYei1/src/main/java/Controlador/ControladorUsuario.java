package Controlador;

import Modelo.modeloUsuario;
import Vista.Principal;
import Vista.Usuario;
import Vista.Tienda_com;
import Vista.vista_principall;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import javax.swing.JOptionPane;



public class ControladorUsuario implements ActionListener {
    
    Usuario nuevo = new Usuario();
    Principal prin = new Principal();
     modeloUsuario usu = new modeloUsuario();
    
    public ControladorUsuario(){
    nuevo.getBtnBoton().addActionListener(this);
      
    }
    
    public void controladorusu(){
            nuevo.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    prin.setVisible(true);
                }
            });
            prin.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
            nuevo.setLocationRelativeTo(null);
            nuevo.setVisible(true);

            nuevo.getJcvsexo().addItem("Seleccione...");
            Map<String, Integer> dato = usu.llenarCombo("sexo");
            for (String sexo : dato.keySet()) {
                nuevo.getJcvsexo().addItem(sexo);
            }

            nuevo.getCbxCargo().addItem("Seleccione...");
            Map<String, Integer> datos = usu.llenarCombo("rol");
            for (String rol : datos.keySet()) {
                nuevo.getCbxCargo().addItem(rol);
            }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if (e.getSource().equals(nuevo.getBtguardar())) {
            if (((nuevo.getTxtdocumento().getText().isEmpty()) || (nuevo.getTxtnombre().getText().isEmpty()) || (nuevo.getTxttelefono().getText().isEmpty()) || (nuevo.getTxtcorreo().getText().isEmpty()) || (nuevo.getTxtdireccion().getText().isEmpty()) || (nuevo.getCbxCargo().getSelectedItem().equals("Seleccione..."))) || (nuevo.getJcvsexo().getSelectedItem().equals("Seleccione...")) || (nuevo.getTxtlogin().getText().isEmpty() || (nuevo.getJdcfecha().getDate() == null))) {
                JOptionPane.showMessageDialog(null, "Falta Informacion");

            } else {
                string volorsexo = nuevo.getjsexo()getselectedItem().toString();
                int sexo = usu nuevo.getSex().            }
        }
    }
    
    }
     
    
