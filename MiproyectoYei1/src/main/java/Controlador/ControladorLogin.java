package Controlador;

import Modelo.ModeloLogin;
import Vista.Login;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorLogin implements ActionListener{
    
    ModeloLogin modlog = new ModeloLogin();
    Login log = new Login();
    Principal prin = new Principal();



    public void iniciarVista(){
        log.setLocationRelativeTo(null);//Centrando la vista
        log.setTitle("Iniciar SesiÃ³n");// Titulo a la vista
        log.setVisible(true);//Visible la vista
    }
            

    @Override
  public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(log.getBtnMostrarClave())){
            if(log.getJpcontrasena().getEchoChar()=='\u2022'){
                log.getJpcontrasena().setEchoChar((char)0);
                log.getClave().setIcon(new javax.swing.ImageIcon(
                        getClass().getResource("/img/ojo-cruzado.png")));
            }else{
                log.getJpcontrasena().setEchoChar('\u2022');
                log.getClave().setIcon(new javax.swing.ImageIcon(
                        getClass().getResource("/img/ojo.png")));
            }
        }
        if(e.getSource()==(log.getBtnIniciar())){
            modlog.setUsu(log.getTxtusuario().getText());
            String pass = new String(log.getJpcontrasena().getPassword());
            modlog.setContra(pass);
            if(modlog.validar(modlog.getUsu(), modlog.getContra())){
                log.setVisible(false);
                prin.iniciarprincipal();
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseÃ±a incorrecta");
                
            }
        }
  
    }
    
}
