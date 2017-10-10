
package Principal;

import Modelo.conexion;
import Vista.ventana_principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class principal {

    
    public static void main(String[] args) {
         conexion con;
        
        ventana_principal ver=new ventana_principal();
         /*try {
            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:bd1.db");
             System.out.println("Conectado");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error en la conexión de la base de datos");
        }*/
        
        con=new conexion();
        
        con.connect();
        con.close();
        //String sentencia="INSERT INTO datos (nombre, apellido)  VALUES ('Josue','sss'); ";
        
        /*INSERT INTO reto (id_reto, descripcion, tiempo, grupo, autor) 
VALUES ("SALTA COMO UN CONEJO","Toma la actitud de un tierno conejito y salta igual a uno.", "1 MIN", "No","JM"),
("BESAR EL PISO","Agachate al nivel del suelo, y deposita un suelo directamente al suelo.", "10 SEG", "No","JM");
        */
        //con.IngresarDatos(sentencia);
        
        
        
        /*int numero;
        
        numero=(int)(Math.random()*9)+1;
        System.out.println(numero);*/
        
    }
    
}
