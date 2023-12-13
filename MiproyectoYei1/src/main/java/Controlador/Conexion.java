
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbcp.BasicDataSource;

public class Conexion {
    String url = "jdbc:mysql://localhost:3306/tiendacom";
//    Connection con = null;
    
////    public Connection iniciarConexion(){
//        if(con==null){
//            try {
//               con = DriverManager.getConnection(url,"root" , "admin");
//                System.out.println("ConexiÃ³n Exitosa");
//            } catch (SQLException e) {
//            }
//            
//        }
//      return con
//    }
//    public void cerrarConexion(){
//        if(con != null){
//            try {
//                con.close();
//                con= null;
//                System.out.println("ConexiÃ³n Finalizada");
//            } catch (SQLException e) {
//            }
//            
//        }
//        
//    }
//
//}
BasicDataSource con;
public Connection inciarConnexion () throws SQLException {

con = new BasicDataSource();
con.setDriverClassName("com.mysql.cj.jdbc.Driver");
con .setUrl(url);
con.setUsername("roll");
con.setPassword("1234");

con.setInitialSize(5);
con.setMaxActive(50);

   return con.getConnection();

}

public void CerrarConexion(){ 
    if(con  != null){
        
        try {
            con.close();
            con= null;
        } catch  (SQLException e){
            e.printStackTrace();
        }
    }
  
}
}



   