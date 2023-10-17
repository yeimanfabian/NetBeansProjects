package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String url = "jdbc:mysql://localhost:3306/tiendacom";
    Connection con = null;
    
    public Connection iniciarConexion(){
        if(con==null){
            try {
               con = DriverManager.getConnection(url,"root" , "admin");
                System.out.println("ConexiÃ³n Exitosa");
            } catch (SQLException e) {
            }
            
        }
      return con;
    }
    public void cerrarConexion(){
        if(con != null){
            try {
                con.close();
                con= null;
                System.out.println("ConexiÃ³n Finalizada");
            } catch (SQLException e) {
            }
            
        }
        
    }

}
