package laboratorio10_1;

import Conexion.ConexionOracle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Laboratorio10_1 {

    public static void main(String[] args) throws SQLException {
       //Declarar una variable que capture el query de Oracle
        String vSQL = ""; // se inicializa vacía
        ConexionOracle conexion = new ConexionOracle();
        
        //Estructura Principal
        //1. Try-Catch
        //1.1 While recorrer los registros
        
        try{
            
            vSQL = "Select * from empleado";
            Connection con = conexion.conectar();
            //1.Statement
            Statement cn = con.createStatement();
            //2.ResultSet
            ResultSet res = cn.executeQuery(vSQL);
            
            //Utilizamos un while
            
            while(res.next()){
                
                System.out.println("<><><><><><><><><><><><>");
                System.out.println(res.getInt("ID"));
                System.out.println(res.getString("NOMBRE"));
                System.out.println(res.getString("APELLIDO"));
                System.out.println(res.getInt("EDAD"));
                System.out.println(res.getInt("SUELDO"));                
                
            }
            
        }catch(SQLException e){            
            System.out.println(e);
        }
      }
    }
