package DaoInterfaces;

import Dao.ConexionOracle;
import DaoProyecto.Productos;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoProductosImpl extends ConexionOracle implements DaoProductos {

    @Override
    public void registrar(Productos prod) throws Exception {
                        
        try{
            
            ConexionOracle con = new ConexionOracle();
            Connection conex1 = con.conectar();
            
            CallableStatement proc = conex1.prepareCall(" CALL SP_INSERTAR_PRODUCTO(?,?,?,?)");
            
            proc.setInt(1,prod.getCodigo());   
            proc.setString(2,prod.getNombre());
            proc.setInt(3,prod.getCantidad());   
            proc.setDouble(4,prod.getPrecio());
            
            //Tenemos que ejecutar
            proc.execute();            
            
        }catch(Exception e){
            System.out.println(e);
        }      
    }

    @Override
    public String mostrar() throws Exception {
    }

    @Override
    public void eliminar() throws Exception {
    } 

    @Override
    public void buscar() throws Exception {
    }

    @Override
    public void actualizar() throws Exception {
    }    
       
}
