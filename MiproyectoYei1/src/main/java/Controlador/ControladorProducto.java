package Controlador;

import Modelo.Modelo_Productos;
import Modelo.Modelo_Productos;
import Vista.Nuevo_Productos;
import Vista.Nuevo_Productos;
import Vista.Principal;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class ControladorProducto implements ActionListener {

    Nuevo_Productos pro = new Nuevo_Productos();
    Principal prin = new Principal();
    Modelo_Productos modproduc = new Modelo_Productos();

    public ControladorProducto() {
        pro.getJtbimagen().addActionListener(this);
        pro.getBtnguardar().addActionListener(this);
        pro.getBtncancelar().addActionListener(this);
        pro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pro.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(3);
            }
        });
    }

    public void controlProducto() {
        prin.setVisible(false);
        pro.setLocationRelativeTo(null);
        pro.setTitle("Nuevo Producto");
        pro.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(pro.getJtbimagen())) {
            modproduc.buscarImagen();
            File file= new File(modproduc.getRuta());
            String archivo= file.getName();//obtiene solo el nombre de la ruta
            pro.getJbpro().setText(archivo);
        }
        if(e.getSource().equals(pro.getBtnguardar())){
            modproduc.setNom(pro.getJbnombr().getText());
            modproduc.setDescri(pro.getJtbdespcrip().getText());
            modproduc.setImagen(modproduc.convertirImagen(modproduc.getRuta()));
            modproduc.insertarProducto();
            modproduc.limpiar((Component[]) pro.getPanelProducto());
        }

        if (e.getSource().equals(pro.getBtnguardar())) {
            //validar campos vacios
            if ((pro.getJbnombr().getText().isEmpty()) || (pro.getJtbdescrp().getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Debe ingresar información en los campos de Nombre y Descripción");
            } else {
                modproduc.setNom(pro.getJbnnombre().getText());
                modproduc.setDescri(pro.getJbnnombre().getText());
                modproduc.setImagen(modproduc.convertirImagen(modproduc.getRuta()));

                if (pro.getBtnguardproduct().getClass().equals("Guardar")) {
                    modproduc.insertarProducto();
                    modproduc.limpiar((Component[]) pro.getPanelProducto());
                } else {
                    modproduc.actualizarProducto();
                    pro.setVisible(false);
                    pro.dispose();
                    modproduc.mostrarTablaProducto(prin.getTbpro(), "", "Producto");
                }
            }
        }
        if (e.getSource().equals(pro.getBtnguardar())) {
            pro.dispose();
        }
    }

    //Actualizar producto
    void actualizarProducto(int doc) {
        modproduc.buscarProducto(doc);
        pro.getTxtnombreproduc().equals(modproduc.getNom());
        pro.getTexareadescripproduct().equals(modproduc.getDes());
        pro.getTxtimagenproduc().equals(modproduc.getRuta());

        File file = new File(modproduc.getRuta());
        String archivo = file.getName();//obtiene solo el nombre de la ruta
        pro.getJbimagen().setText(archivo);

        //Cambiar Titulo
        Border borde = BorderFactory.createTitledBorder(null, "Actualizar Producto",
                javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Yu Gothic UI", 1, 36),
                new java.awt.Color(204, 0, 204));
        pro.getPanelProducto();
        prin.setVisible(false);
        pro.setLocationRelativeTo(null);
        pro.getBtnguardar().setText("Actualizar");
        pro.setVisible(true);
    }
    //Eliminar cliente

}