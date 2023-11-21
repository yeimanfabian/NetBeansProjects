/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexion;
import java.awt.Component;
import static java.awt.SystemColor.control;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle.Control;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ModeloProducto {

    private String nom, des, ruta;
    private byte imagen[];

    {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public void buscarImagen() {
        JFileChooser  archivo = new JFileChooser();
        String rutaCarpeta= getClass().getClassLoader().getResource("producto").getPath();
        File carpeta = new File(rutaCarpeta);
         archivo.setCurrentDirectory(carpeta);
         FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                "JPG,PNG & GIF", "jpg", "png", "gif");
        archivo.setFileFilter(filtro);

        
        if (archivo.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            setRuta(archivo.getSelectedFile().getAbsolutePath());
        }
    }

    public byte[] convertirImagen(String ruta) {
        try {
            File archivo = new File(ruta);
            byte[] foto = new byte[(int) archivo.length()];
            InputStream imgen = new FileInputStream(archivo);
            imgen.read(foto);

            return foto;

        } catch (Exception e) {
            return null;
        }
    }
//Insertar Producto
    public void insertarProducto() {
        Conexion conect = new Conexion();
        Connection co = conect.iniciarConexion();
        String instProducto = "call inst_producto(?,?,?,?)";
        try {
            PreparedStatement ps = co.prepareStatement(instProducto);
            ps.setString(1,getNom());
            ps.setString(2, get Descri());
            ps.setBytes(3, getImagen());
            ps.setString(4, getRuta());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//Limpiar Campos 
        public void limpiar(Component[] panelproducto) {
        for (Object limpiar : panelproducto) {
            if(Control isntanceof jtexfield) {
            (jtexfield)Controltext).setText("");
            
        }
            if (instonceof JSCrllpane s) 
            
            if (limpiar instanceof JTextField) {
                ((JTextField) limpiar).setText("");
            }
            if (limpiar instanceof JTextArea) {
                ((JTextArea) limpiar).setText("");
            }
        }
    }

}
    

    

    