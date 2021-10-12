/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodoarboles;

/**
 *
 * @author LABORATORIO
 */
public class Arbol {
    
    public Nodo raiz;
    
    public Arbol()
    {
        raiz = null;
    
    }
    
    public void insertNodo (int valor)
    {
        if (raiz == null)
        {
            raiz = new Nodo(valor);
        
        }    
        else 
        {
            raiz.insertar(valor);
        
        }
    }
    
    public void PreOrden()
    {
        imprimirPreorden(raiz);
    }
    
    public void InOrden()
    {
        imprimirInorden(raiz);
    }
    
    public void PostOrden()
    {
        imprimirPosOreden(raiz);
    }
    
    public void imprimirPreorden(Nodo nodo)
    {
        if (nodo == null)
        {
            return;
        }
        
        System.out.println(nodo.datos + " ");
        imprimirPreorden(nodo.nodoIzquierdo);
        imprimirPreorden(nodo.nodoDerecho);
    }
    
     public void imprimirInorden(Nodo nodo)
    {
        if (nodo == null)
        {
            return;
        }
        
                
        imprimirPreorden(nodo.nodoIzquierdo);
        System.out.println(nodo.datos + " ");
        imprimirPreorden(nodo.nodoDerecho);
    }
     
      public void imprimirPosOreden(Nodo nodo)
    {
        if (nodo == null)
        {
            return;
        }
        
        imprimirPreorden(nodo.nodoIzquierdo);
        imprimirPreorden(nodo.nodoDerecho);
        System.out.println(nodo.datos + " ");

    }
    
}
