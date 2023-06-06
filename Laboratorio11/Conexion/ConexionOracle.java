package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionOracle {
    
    //declaracion de variables de conexion con ORACLE
    private final String DRIVER="oracle.jdbc.driver.OracleDriver";
    private final String URL="jdbc:oracle:thin:@//localhost:1521/XE";
    private final String USER="C##PERSONAL";
    private final String PASSWORD="123456";
    
    //Cadena de conexion
    public Connection cadena;
    
    //Crear constructor de la clase
    public ConexionOracle(){
        this.cadena = null;
    }
    
    //Crear métodos 1. Conectar 2. Desconectar
    //Conectar
    public Connection conectar() throws SQLException{
        try{
            
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL, USER, PASSWORD);
            
        }catch(ClassNotFoundException | SQLException e){
            
            JOptionPane.showMessageDialog(null,"Conexion incorrecta");
            System.exit(0);
        }
        return this.cadena;
    }
    
    //Desconectar
    public void desconectar(){
        try{
            this.cadena.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Bais Conexion");
        }
    }
    
}
