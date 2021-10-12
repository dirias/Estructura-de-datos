
package listadoblementeenlazada;

public class ClsNodo {
    public String nombre;
    public ClsNodo siguiente;
    public ClsNodo anterior;
    
    public ClsNodo()
    {
        nombre = null;
    }
    
    public ClsNodo(String pNombre)
    {
        nombre = pNombre;
    }
}
