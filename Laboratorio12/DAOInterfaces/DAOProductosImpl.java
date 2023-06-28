package DAO.Interfaces;
import DAO.Conexion.ConexionOracle;
import DAO.Proyecto.Producto;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAOProductoImpl extends ConexionOracle implements DAOProducto{

    @Override
    public void registrar(Producto p) throws Exception {
        
        ConexionOracle con = new ConexionOracle();
        Connection con1 = con.conectar();
        
        CallableStatement proce = con1.prepareCall(" CALL SP_INSERTAR_PRODUCTOS(?,?,?,?)");
        
        proce.setInt(1,p.getCodigo());
        proce.setString(2, p.getNombre());
        proce.setInt(3, p.getCantidad());
        proce.setDouble(4, p.getPrecio());
        
        //Ya tengo los elementos del procedure ahora lo ejecuto
        proce.execute();       
        
    }

    @Override
    public void mostrar(JTable visor) throws Exception {
        
        String sql = "Select * from productos order by codigo";
        Statement st;
        ConexionOracle con = new ConexionOracle();
        Connection conexion = con.conectar();
        
        //Generar modelo de la JTable
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        visor.setModel(modelo);
        
        String[] dato = new String[4]; //Crear la coleccion de strings para llenar tabla
        
        st=conexion.createStatement();
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next())
        {
            dato[0] = rs.getString(1);
            dato[1] = rs.getString(2);
            dato[2] = rs.getString(3);
            dato[3] = rs.getString(4);
            
            modelo.addRow(dato);
        }        
    }
    
    @Override
    public String numcodigo() throws Exception {
        
        String ncodigo="";        
        String sql = "select max(codigo) as codigo from productos";
        
        ConexionOracle con = new ConexionOracle();
        Connection conexion = con.conectar();
        
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        if(rs.next()){
            
            String n = rs.getString("codigo");
            Integer n1 = Integer.parseInt(n);
            Integer n2 = n1+1;
            ncodigo = n2.toString();
        }      
        return ncodigo;        
    }    
    
    @Override
    public void actualizar(Producto p) throws Exception {
        
        ConexionOracle con = new ConexionOracle();
        Connection con1 = con.conectar();
        
        CallableStatement proce = con1.prepareCall(" CALL SP_ACTUALIZAR_PRODUCTOS(?,?,?,?)");
        
        proce.setInt(1,p.getCodigo());
        proce.setString(2, p.getNombre());
        proce.setInt(3, p.getCantidad());
        proce.setDouble(4, p.getPrecio());
        
        //Ya tengo los elementos del procedure ahora lo ejecuto
        proce.execute();
        
    }    

    @Override
    public void eliminar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }  
    
}
