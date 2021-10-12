
package listadoblementeenlazada;

public class ClsLista {
    
    public ClsNodo primero;
    public ClsNodo ultimo;
    public int size;
    
    
    public ClsLista()
    {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }
    
    public boolean EsVacia()
    {
        return (primero == null);
    }
    
    public ClsNodo Enlistar(String pNombre)
    {
        ClsNodo nodo = new ClsNodo(pNombre);
        
        if(EsVacia())
        {
            primero = nodo;
            ultimo = nodo;
            nodo.siguiente = null;
            nodo.anterior = null;
        }
        else
        {
            nodo.anterior = ultimo;
            nodo.siguiente = null;
            ultimo.siguiente = nodo;
            ultimo = nodo;
        }
        size ++;
        
        return nodo;
    }
    
    public ClsNodo desEnlistarPrimero()//Pila
    {
        if(!EsVacia())
        {
            ClsNodo nodoP = primero;
            if(size == 1)
            {
                primero = null;
                ultimo = null;
            }
            else
            {
                primero = nodoP.siguiente;
                primero.anterior = null;
            }
            size --;
            
            return nodoP;
        }
        return null;
    }
    public ClsNodo desEnlistarUltimo()
    {
        if(!EsVacia())
        {
            ClsNodo nodoP = ultimo;
            if(size == 1)
            {
                desEnlistarPrimero();
            }
            else
            {
                ultimo = nodoP.anterior;
                ultimo.siguiente = null;
            }
            size --;
            return nodoP;
        }
        return null;
    }
    
    public ClsNodo desEnlistarCualquiera(String pNombre) {
        if (!EsVacia()) 
        {
            ClsNodo nodo = primero;
            for (int i = 0; i < size; i++) 
            {
                if(nodo.nombre.equals(pNombre))
                {
                    if(nodo == primero)
                    {
                        desEnlistarPrimero();
                        return nodo;
                    }
                    else if(nodo == ultimo)
                    {
                        desEnlistarUltimo();
                        return nodo;
                    }
                    else
                    {
                        ClsNodo Eliminado = nodo;
                        nodo.anterior.siguiente = nodo.siguiente;
                        nodo.siguiente.anterior = nodo.anterior;
                        
                        size --;
                        return Eliminado;
                    }
                }
                nodo = nodo.siguiente;
            }
        }
        return null;

    }
    
    public String Imprimir() {
        String msj = "";
        if (!EsVacia()) 
        {
            ClsNodo nodo = primero;
            for (int i = 0; i < size; i++) {
                msj = msj + nodo.nombre + " \n";
                nodo = nodo.siguiente;
            }
        }
        return msj;

    }
    public String Imprimir2()
    {
        String msj = "";
        if(!EsVacia())
        {
            ClsNodo nodo = ultimo;
            for(int i = 0; i < size; i++)
            {
                msj = msj + nodo.nombre +  " \n";
                nodo = nodo.anterior;
            }
        }
        return msj;
    }
    
    
   
    
    
}
