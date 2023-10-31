package Controlador;

import Modelo.modeloUsuario;
import Vista.Usuarios;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import javax.swing.JFrame;

public class Controladorprincipal implements ActionListener {

    Principal prin = new Principal();//Instancia(Llama) la ventana principal
    Usuarios nuevo = new Usuarios();//Instanca (Llama) la ventana(vista) Nuevo usuario
    modeloUsuario usu = new modeloUsuario();//Instancia el modelo de usuario

    
    public Controladorprincipal() {
        prin.getBtnNuevo().addActionListener(this);//
        nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Desactiva la x que cierrar el programa para que permita abrir o volver a la ventana principal
    }

    public void iniciar() {
        prin.setLocationRelativeTo(null);//Centra la ventana
        prin.setTitle("Principal");//Le da titulo a la ventana
        prin.setExtendedState(state:Jfrae.Max)
        prin.setVisible(true);//Hace visible la ventana
        
    }
    public void gestorpestanas (){
        if(prin.getjtPrincipal().getselectedIndex()!=0){
else {
    {
        Prin.getjtprincipal().addchangelistene(new changelistener(){
                
                }
                @Override
                public void actionPerformed(ActionEvent e) { //Valida los eventos
        if (e.getSource().equals(prin.getBtnNuevo())) {//Se crea al acciÃ³n cuando le damos clic en el boton nuevo de la vista princial
            prin.setVisible(falce);
            
            
        }
            
            /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
            nuevo.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    prin.setVisible(true);
                    prin.iniciarprincipal();
                    
                }
            });
            prin.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
            nuevo.setLocationRelativeTo(null);
            nuevo.setVisible(true);
            
            //Lleno el combobox de sexo
            nuevo.getjComboBox1().addItem("Seleccione...");
            Map<String,Integer>dato = usu.llenarCombo("sexo");
            for(String sexo:dato.keySet()){
                nuevo.getjComboBox1().addItem(sexo);
            }
            //Lleno el combobox de rol
            nuevo.getJcbCargo().addItem("Seleccione...");
            Map<String,Integer>datos = usu.llenarCombo("rol");
            for(String rol:datos.keySet()){
                nuevo.getJcbCargo().addItem(rol);
            }
        }
    
    }
    

@Override public void stateChenged(ChangeEvent e){
int seleccion = princ 
}
    




