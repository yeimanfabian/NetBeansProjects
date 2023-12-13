package Controlador;

import Modelo.modeloUsuario;
import Vista.Nueva;

import Vista.Principal;
import Vista.Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class ControladorUsuario implements ActionListener {

    Usuarios usu = new Usuarios();
    Principal prin = new Principal();
    modeloUsuario modusuario = new modeloUsuario();

    //constructor
    public ControladorUsuario() {
        usu.getjButton1().addActionListener(this);
        usu.getBtnVista().addActionListener(this);
        usu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        usu.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                try {
                    princ.iniciarPrincipal(0);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void controlUsuario() {
        prin.setVisible(false);
        usu.setLocationRelativeTo(null);
        usu.setTitle("Nuevo Usuario");
        usu.setVisible(true);

        //lleno combo box sexo
        usu.getjComboBox1().addItem("Seleccione...");
        Map<String, Integer> combosexo = modusuario.llenarCombo("sexo");
        for (String sexo : combosexo.keySet()) {
            usu.getjComboBox1().addItem(sexo);
        }
        //lleno combo box rol
        usu.getJcbCargo().addItem("Seleccione...");
        Map<String, Integer> comborol = modusuario.llenarCombo("rol");
        for (String rol : comborol.keySet()) {
            usu.getJcbCargo().addItem(rol);
        }
    }

    //Metodo adstracto
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(usu.getBtnVista())) {

            if (usu.getjPasswordUSUARIO().getEchoChar() == '\u2022') {
                usu.getjPasswordUSUARIO().setEchoChar((char) 0);
                usu.getBtnVista().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojo-cruzado.png")));
            } else {
                usu.getjPasswordUSUARIO().setEchoChar('\u2022');
                usu.getBtnVista().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojo.png")));
            }
        }
        if (e.getSource().equals(usu.getBtnGuardar())) {
            //validar campos vacios
            if ((usu.getTldocumento().getText().isEmpty()) || (usu.getjComboxTipode().getSelectedItem().equals("Seleccione...")) || (usu.getJtnombre().getText().isEmpty()) || (usu.getJtdirecion().getText().isEmpty())
                    || (usu.getJtcorreo().getText().isEmpty()) || (usu.getJtlogin().getText().isEmpty()) || (usu.getjTefno().getText().isEmpty())
                    || (usu.getjPasswordUSUARIO().getPassword() == null) || (usu.getjDateChooser1().getDate() == null) || (usu.getjTextinsert_login().equals("Seleccione..."))
                    || (usu.getjComboBox1().getSelectedItem().equals("Seleccione..."))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar información en todos los campos");
            } else {
                //Convertimos el dato de los combox al que entiende sql
                String valorSexo = usu.getjComboBox1().getSelectedItem().toString();
                int sexo = modusuario.llenarCombo("sexo").get(valorSexo);
                String valorRol = usu.getCbxCargo().toString();
                int rol = modusuario.llenarCombo("rol").get(valorRol);

                // seleccion de fecha, cambia al formato de fecha al que entiende sql
                java.util.Date fec = usu.getjDateChooser1().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);

                //Contraseña
                char[] contra = usu.getjPasswordUSUARIO().getPassword();
                String contrasena = String.valueOf(contra);

                modusuario.setDoc(Integer.parseInt(usu.getTldocumento().getText()));
                modusuario.setNom(usu.getJtnombre().getText());
                modusuario.setDir(usu.getJtnombre().getText());
                modusuario.setCor(usu.getJtcorreo().getText());
                modusuario.setTec(usu.getjTefno().getText());
                modusuario.setLo((String) usu.getCbxCargo());
                modusuario.setFec(fecha);
                modusuario.setCl(contrasena);
                modusuario.setSex(sexo);
                modusuario.setRol(rol);
                
                ControladorPrincipal prin = new ControladorPrincipal();

                if (usu.getBtnGuardar().getClass().equals("Guardar")) {
                    try {
                        modusuario.actualizarUsuario();
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    modusuario.limpiar(usu.getUsuarios());
                } else {
                    try {
                        modusuario.actualizarUsuario();
                    } catch (SQLException ex) {
                        Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    usu.setVisible(false);

//                    prin.setVisible(true);
                  modusuario.mostrarTablaUsuario(prin.getUsuario(), "", "Usuario");
//                    prin.getTpPrincipal().setSelectedIndex(0);
                }

            }
        }

    }
//Actualizar Usuario

    void actualizarUsuario(int doc) {
        modusuario.Buscar(doc);
        usu.getTldocumento().setEnabled(false);
        usu.getJtlogin().setEnabled(false);
        usu.getjComboxTipode().setEnabled(false);
        usu.getTldocumento().setText(String.valueOf(doc));
        usu.getJtnombre().setText(modusuario.getNom());
        usu.getjTefno().setText(modusuario.getTec());
        usu.getJtcorreo().setText(modusuario.getCor());
        usu.getJtdirecion().setText(modusuario.getDir());
        usu.getJtlogin().setText(modusuario.getLo());
        usu.getjPasswordUSUARIO().setText(modusuario.getCl());
        usu.getjDateChooser1().setDate(modusuario.getFec());

        //llenar Sexo
        Map<String, Integer> info = modusuario.llenarCombo("sexo");
        for (String sexo : info.keySet()) {
            usu.getjComboBox1().addItem(sexo);
        }
        //obtener el valor de la base de datos
        String valoSexo = modusuario.obtenerSeleccion(info, modusuario.getSex());
        usu.getjComboBox1().setSelectedItem(valoSexo);

        //llenar Rol
        Map<String, Integer> info2 = modusuario.llenarCombo("rol");
        for (String rol : info2.keySet()) {
            usu.getJtsexo().addItem(rol);
        }

        //obtener el valor de la base de datos
        String valoRol = modusuario.obtenerSeleccion(info, modusuario.getRol());
        usu.getJtsexo().setSelectedItem(valoRol);

        //Llenar tipo de documento
        usu.getTldocumento().setSelectionEnd(modusuario.getDoc());

        //Cambiar Titulo
        Border borde = BorderFactory.createTitledBorder(null, "Actualizar Usuario",
                javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Yu Gothic UI", 1, 36),
                new java.awt.Color(204, 0, 204));
        usu.getUsuarios().equals(borde);
        prin.setVisible(false);
        usu.setLocationRelativeTo(null);
        usu.getBtnGuardar().equals("Actualizar");
        usu.setVisible(true);

    }
//Eliminar Usuario

    void eliminarUsuario(int doc) throws SQLException {
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al usuario? \n" + doc,
                 "Eliminar Usuario", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            modusuario.setDoc(doc);
            modusuario.eliminarUsuario();
        }
     }

    void ControladorUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }

    

    

    
    

