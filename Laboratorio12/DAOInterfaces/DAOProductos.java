package DaoInterfaces;
import DaoProyecto.Productos;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public interface DaoProductos {
    
    public void registrar(Productos prod) throws Exception;
    public String numeroCod() throws Exception;
    
    
    public void llamarDatos(JTable visor) throws Exception;
    
    
    public void eliminar(String id) throws Exception;
    public void actualizar(Productos prod) throws Exception;
    public void llamardatos2(JTable visor, String buscar) throws Exception;
    
}
