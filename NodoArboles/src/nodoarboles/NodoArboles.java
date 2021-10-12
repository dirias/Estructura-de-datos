
package nodoarboles;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO
 */
public class NodoArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Arbol miArbol = new Arbol();
        
        miArbol.insertNodo(10);
        miArbol.insertNodo(5);
        miArbol.insertNodo(15);
        
        miArbol.PreOrden();*/
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos nodos deasea"));
        
        int dato;
        
        for (int i = 1; i <= cantidad; i++) {
            dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos nodos deasea"));
            
        }
    }
    
}
