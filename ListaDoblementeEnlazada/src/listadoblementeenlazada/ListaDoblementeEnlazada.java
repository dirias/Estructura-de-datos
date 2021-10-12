
package listadoblementeenlazada;

import javax.swing.JOptionPane;

public class ListaDoblementeEnlazada {

    public static void main(String[] args) {
         //LISTA DOBLEMENTE ENLAZADA
         String op;
         ClsLista lista = new ClsLista();
        do{
        op = Ask("Bienvenido al programa.\nDigite la opción que desea realizar.\n"
                + "\n1-Enlistar."
                + "\n2-Imprimir"
                + "\n3-Desenlistar en forma de pila"
                + "\n4-Desenlistar en forma de cola"
                + "\n5-Desenlistar mediante busqueda"
                + "\n10-Salir" 
                );
        
        switch(op)
        {
            case "1":
                String nombre = Ask("Digite el nombre a registrar");
                
                lista.Enlistar(nombre);
                
                Print(lista.Imprimir());
                //Print(lista.Imprimir2());
                break;
            case "2":
                Print(lista.Imprimir());
                break;
            case "3":
                ClsNodo nodoPila = lista.desEnlistarPrimero();
                if(nodoPila != null)
                {
                    Print("El dato eliminado fue: " + nodoPila.nombre );
                    lista.Imprimir();
                }
                else
                {
                    Print("No hay datos almacenados");
                }
                break;
                
            case "4":
                ClsNodo nodoCola = lista.desEnlistarUltimo();
                if(nodoCola != null)
                {
                    Print("El dato eliminado fue: " + nodoCola.nombre );
                    lista.Imprimir();
                }
                else
                {
                    Print("No hay datos almacenados");
                }
                break;
            case "5":
                String buscado = Ask("Digite el nodo a buscar");
                ClsNodo nodoEliminado = lista.desEnlistarCualquiera(buscado);
                
                if(nodoEliminado != null)
                {
                    Print("El dato eliminado fue: " + nodoEliminado.nombre );
                    lista.Imprimir();
                }
                else
                {
                    Print("Puede que no haya datos almacenados\n O que el dato que busca no este en registro");
                }
                break;
                
            case "10":
                Print("Gracias por usar el programa");
                break;
            default:
                Print("Esa opción no es correcta.\nVuelva a intentarlo");
                break;
        }
        }while(!op.equals("10"));
    }
        public static String Ask(String dato)
    {
        return JOptionPane.showInputDialog(dato);
    }
    public static String AskInt(String dato)
    {
        return JOptionPane.showInputDialog(Integer.parseInt(dato));
    }
    public static void Print(String dato)
    {
        JOptionPane.showMessageDialog(null, dato);
    }
}
