package DaoInterfaces;
import DaoProyecto.Productos;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public interface DaoProductos {
    
    public void registrar(Productos prod) throws Exception;
    public String mostrar() throws Exception;   
    public void eliminar() throws Exception;  
    public void buscar() throws Exception;
    public void actualizar() throws Exception;
    
}
