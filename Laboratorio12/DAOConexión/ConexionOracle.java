package Dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionOracle {
    
    //variables
    private final String DRIVER="oracle.jdbc.driver.OracleDriver";
    private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
    private final String USER="C##USUARIO";
    private final String PASSWORD="123456";
    
    public Connection cadena;
    
    public ConexionOracle(){
        this.cadena = null;
    }
    
    public Connection conectar() throws SQLException{
        
        try{
             Class.forName(DRIVER);
             this.cadena = DriverManager.getConnection(URL, USER, PASSWORD);
             
        }catch(ClassNotFoundException | SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0); 
        }        
        return this.cadena;
    }
    
    public void desconectar(){
        try{
            this.cadena.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
