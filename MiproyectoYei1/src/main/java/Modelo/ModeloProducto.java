/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class ModeloProducto {
    private string nom,des,ruta;
    private byte imagen[]{ 
    
    
    }

    public string getNom() {
        return nom;
    }

    public void setNom(string nom) {
        this.nom = nom;
    }

    public string getDes() {
        return des;
    }

    public void setDes(string des) {
        this.des = des;
    }

    public string getRuta() {
        return ruta;
    }

    public void setRuta(string ruta) {
        this.ruta = ruta;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
        
       public void buscarImagen
               jfichooser archivo =new jfichoosr();
               FileNameExtensionFilter filtro = new FileNameExtensionFilter( 
                       "JPG,PNG & GIF", "jpg","png","gif"
                archivo.setfilefilter(filtro)
                        if (archivo.showOpenDialog(null)jfileChooser.Approve_option){
                    setrut(archivos.getselectedfile)().getAbsolutepath());
    }
    
    
}
    
}
