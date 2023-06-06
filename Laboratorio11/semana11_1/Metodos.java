package semana11_1;

import Conexion.ConexionOracle;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Metodos {
    //CREAR UN MÉTODO PARA LLENAR EL JTABLE = JTREPORTE
    public void rellenarTabla(String tabla, JTable visor) throws SQLException{
        
        String sql="select * from " + tabla + " order by codigo";
        Statement st;
        ConexionOracle con = new ConexionOracle();
        Connection conexion = con.conectar();
        
        DefaultTableModel modelo = new DefaultTableModel(); //variable modelo crea la estructura de la tabla
        modelo.addColumn("Codigo");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Nombres");
        modelo.addColumn("DNI");
        modelo.addColumn("Direccion");
        visor.setModel(modelo);
        
     //COLECCION DE STRINGS PARA LLENAR LA TABLA
     String[] datos = new String[5];
     
     //En este proceso se necesita recorrer todo la tabla del base para luego expresarla en el JTABLE
     //COSIDERO UN TRY CATCH en caso este sujeto a errores
     st = conexion.createStatement();
     ResultSet rs = st.executeQuery(sql);
     
     while(rs.next()) //llamo a los items de la tabla y los igual a la estructura creada en netbeans
     {
         datos[0] = rs.getString(1);
         datos[1] = rs.getString(2);
         datos[2] = rs.getString(3);
         datos[3] = rs.getString(4);
         datos[4] = rs.getString(5);
         modelo.addRow(datos);         
     }               
   }
    
   //CREAR MÉTODO PARA INSERTAR REGISTRO A LA TABLA
    public void insertarRegistro(JTextField codigo,JTextField apellidos,JTextField nombres,JTextField dni,JTextField direccion) throws SQLException{
        
        int _codigo = Integer.parseInt(codigo.getText());


        //Me tengo que conectar a Oracle
        ConexionOracle con = new ConexionOracle();
        Connection conexion2 = con.conectar();
        
        //Conectar con un store procedure
        CallableStatement procedure = conexion2.prepareCall(" CALL SP_INSERTAR_ALUMNOS(?,?,?,?,?)");
        procedure.setInt(1, _codigo);
        procedure.setString(2, apellidos.getText());
        procedure.setString(3, nombres.getText());
        procedure.setString(4, dni.getText());
        procedure.setString(5, direccion.getText());
        //Ejecutar el sp
        procedure.execute();
    }
    
    
    
    
    
    
    
    
}
