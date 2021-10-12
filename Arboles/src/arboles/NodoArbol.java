
package arboles;


public class NodoArbol {
    public NodoArbol nodoIzquierdo;
    public NodoArbol nodoDerecho;
    public int datos; //Raiz, padre
    public int sumatoria;
    
    public NodoArbol(int pdato){
        
        datos = pdato;
        nodoDerecho = null;
        nodoIzquierdo = null;
        sumatoria = 0;
    }
    
    //metodo insertar, ¿Porque insertar?
    //Va a decir adonde lo va a insertar, Izquierda o derecha?
    
    public void insertar(int valor){
        //Me voy a la izquierda
        if(valor < datos)
        {
        if(nodoIzquierdo==null)
            {
                nodoIzquierdo = new NodoArbol(valor);
            }
        else
            {
                nodoIzquierdo.insertar(valor); //Recursividad del metodo. 
            }
        }
            
        else
        {
            if(nodoDerecho==null)
            {
                nodoDerecho = new NodoArbol(valor);
            }
        else
            {
                nodoDerecho.insertar(valor); //Recursividad del metodo. 
            }
        }
        }
    
    }