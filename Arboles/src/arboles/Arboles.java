
package arboles;

import javax.swing.JOptionPane;
public class Arboles {

    
    public static void main(String[] args) {
        int x;
        String option;
        Arbol miArbol = new Arbol();
        do {
            option = Ask("¿Qué opcion desea realizar? \n" + 
                     "\n 1. Insertar" +
                     "\n 2. Imprimir Pre"  +
                     "\n 3. Imprimir In"  +
                     "\n 4. Imprimir Post"+
                     "\n 5. Imprimir Sumatoria"+
                    "\n 6. Imprimir Altura"+
                    "\n 7. ¿El valor ya existe?"+
                    "\n 8. Sumatoria Hoja Izquierda"+
                    "\n 9. Sumatoria Hoja Derecha"+
                     "\n\n  Esc para salir");
            
            switch (option){
                case "1":
        
        int dato;
        int cantidad = AskInt("¿Cuantos nodos desea?");
        
        for (int i = 1; i<= cantidad; i++)
        {
        dato = AskInt("Digite el dato para el nodo "+ i);    
        miArbol.insertarNodo(dato);
        }
        miArbol.Preorden();
      /*  Arbol miArbol = new Arbol();
        
        miArbol.insertarNodo(10);
        miArbol.insertarNodo(22);
        miArbol.insertarNodo(55);
        miArbol.insertarNodo(33);
        
        miArbol.Preorden();
        System.out.println("\n");
        miArbol.Inorden();
        System.out.println("\n");
        miArbol.Postorden();
    */
    
                    break;
                    
                case "2":
                    
                  miArbol.Preorden();
                  System.out.println("\n");
                    break;
                    
            case "3":
                    miArbol.Inorden();
                    System.out.println("\n");
                  
                    break;
                    
              
            case "4":
                    miArbol.Postorden();
                 System.out.println("\n");
                          break;
            case "5":
                   miArbol.Sumatoria();
                System.out.println("\n");
                    
                    break;
            case "6":
                   miArbol.Altura();
                   System.out.println("\n");
                    break;  
           
            case "7":
                   x = AskInt("¿Que dato desea buscar?");
                    if(miArbol.buscalo(miArbol.raiz, x)== true){
                        System.out.println("El valor existe");
                    }
                    else{
                        System.out.println("El valor no existe");
                    };
                   
                    break;  
            case "8":
                Print(String.valueOf(miArbol.ObtenerSumaTotalDer()));
                
                    break;
            case "9":
                Print(String.valueOf(miArbol.ObtenerSumaTotalIzq()));
                    break;  
            
            case "10":
                Print(String.valueOf(miArbol.ObtenerSumaTotal()));
                    break;  
            case "11":
                Print(String.valueOf(miArbol.SumaTotal(miArbol.raiz.nodoIzquierdo)));
                    break;  
            case "12":
                Print(String.valueOf(miArbol.SumaTotal(miArbol.raiz.nodoDerecho)));
                    break;  
            }
        } 
                while(!option.equals("Esc")); //mientras no diga eso, se va a ejecutar el programa
    
    }
        
     public static void Print(String mensaje){//imprimir dato
       JOptionPane.showMessageDialog(null,mensaje);
   }
   public static String Ask (String dato){//preguntar dato que quiere
       return JOptionPane.showInputDialog(dato);
   }
    public static int AskInt  (String dato){ //pedir un numero
       return Integer.parseInt(JOptionPane.showInputDialog(dato));
             //cambio de string a int
   }
}
