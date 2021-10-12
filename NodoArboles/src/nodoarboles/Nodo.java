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
public class Nodo {
    
    public Nodo nodoIzquierdo;
    public Nodo nodoDerecho;
    public int datos;
    
    public Nodo (int pdato)
    {
        datos = pdato;
        nodoDerecho = null;
        nodoIzquierdo = null;
    
    }
    
    public void insertar(int valor)
    {
        if( valor < datos)
        {
            if(nodoIzquierdo == null)
            {
                nodoIzquierdo = new Nodo(valor);
            }
            else 
            {
                nodoIzquierdo.insertar(valor);
            }
        
        }
        else 
        {
            if(nodoIzquierdo == null)
            {
                nodoDerecho = new Nodo(valor);
            
            }
            else 
            {
                nodoDerecho.insertar(valor);

            }
        }
    }
    
}
