
package DAO.Interfaces;
import DAO.Proyecto.Producto;
import javax.swing.JTable;

public interface DAOProducto {
    
    public void registrar(Producto p) throws Exception;
    public void mostrar(JTable visor) throws Exception;
    public String numcodigo() throws Exception;
    public void actualizar(Producto p) throws Exception;    
    
    //
    public void eliminar() throws Exception;  
    public void buscar() throws Exception;
    
    
}
