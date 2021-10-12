/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author LABORATORIO
 */
public class Arbol {
    public NodoArbol raiz;
    public int SumaTotalFinal;
    public int SumaDer;
    public int SumaIzq;
    public Arbol()
    {
        raiz = null;
    }
    
    public void insertarNodo(int valor){
        if (raiz == null){
            raiz= new NodoArbol(valor);
        }
        else
        {
            raiz.insertar(valor);
        }
    }
    
    public void Preorden()
    {
        imprimirPreorden(raiz);
    }
    
    public void Inorden()
    {
        imprimirInorden(raiz);
    }
    
    public void Postorden()
    {
        imprimirPostorden(raiz);
    }
    
    public void Sumatoria()
    {
        imprimirSumatoria(raiz);
    }
    
    public void Altura()
    {
        imprimirTamaño(raiz);
        
    }
    public void imprimirPreorden(NodoArbol nodo)
    {
        if (nodo == null)
        {
            return;
        }
        
        System.out.print(nodo.datos +" ");
        imprimirPreorden(nodo.nodoIzquierdo);
        imprimirPreorden(nodo.nodoDerecho);
        
    }
    
     public void imprimirInorden(NodoArbol nodo)
    {
        if (nodo == null)
        {
            return;
        }
        
        imprimirInorden(nodo.nodoIzquierdo);
        System.out.print(nodo.datos +" ");
        imprimirInorden(nodo.nodoDerecho);
        
        //IZ, R, Der
        
    }
     
     public void imprimirPostorden(NodoArbol nodo)
    {
        if (nodo == null)
        {
            return;
        }
        
        imprimirPostorden(nodo.nodoIzquierdo);
        imprimirPostorden(nodo.nodoDerecho);
        System.out.print(nodo.datos +" ");
        
        //IZ,DER, R
        
    }
     int guardar;
     String x;
   
     public int imprimirTamaño (NodoArbol nodo){
            int tamañoiz,tamañode;
            int altura = 0;
            if(nodo==null){
                
            }
            else
            {
                tamañoiz = imprimirTamaño(nodo.nodoIzquierdo);
                tamañode = imprimirTamaño(nodo.nodoDerecho);
                
                if(tamañode<tamañode)
                {
                    altura = tamañoiz + 1;
                }
                else{
                    
                    altura= tamañode +1;
                }
            }
            System.out.println(altura);
            return altura;
        }
     public int imprimirSumatoria(NodoArbol nodo)
    {
        int suma= nodo.datos;
        
        if (nodo.nodoIzquierdo == null && nodo.nodoDerecho==null)
        {
            
            return suma;
        }
        else {
        if(nodo.nodoIzquierdo==null)
        {
            suma+= imprimirSumatoria(nodo.nodoDerecho);
            
        }
        else if(nodo.nodoDerecho==null){
            suma+= imprimirSumatoria(nodo.nodoIzquierdo);
            
        }
        else{
            suma+= imprimirSumatoria(nodo.nodoDerecho);
            suma+= imprimirSumatoria(nodo.nodoIzquierdo);
            
        }
                }
        System.out.println(suma);
        return suma;
        
//        else{
//        guardari = guardari + Integer.parseInt(String.valueOf(nodo.nodoIzquierdo));
//        guardard = guardard + Integer.parseInt(String.valueOf(nodo.nodoDerecho));
//        return guardari+guardard
//        }
        
        
    }
     public int ObtenerSumaTotal(){
SumaTotalFinal = 0;

return SumaTotal(raiz);
}

public int SumaTotal(NodoArbol nodo)
{
    if(nodo != null)
{
SumaTotalFinal = nodo.datos + SumaTotal(nodo.nodoIzquierdo);
SumaTotalFinal = SumaTotalFinal + SumaTotal(nodo.nodoDerecho);
}
      else
    {
        return 0;
    }
return SumaTotalFinal;
}

     public int ObtenerSumaTotalDer(){
SumaTotalFinal = 0;

return SumaTotalIzq(raiz);
}

private int SumaTotalIzq(NodoArbol nodo)
{
    if(nodo != null)
{
SumaTotalFinal = nodo.datos+SumaTotalIzq(nodo.nodoIzquierdo);
SumaDer = SumaTotal(nodo.nodoDerecho);
SumaTotalFinal = SumaTotalFinal + SumaTotal(nodo.nodoDerecho);
SumaTotalFinal= SumaTotalFinal - SumaDer;

}
      else
    {
        return 0;
    }
return SumaTotalFinal;
}

     public int ObtenerSumaTotalIzq(){
SumaTotalFinal = 0;

return SumaTotalDer(raiz);
}

private int SumaTotalDer(NodoArbol nodo)
{
    if(nodo != null)
{
SumaTotalFinal = nodo.datos+SumaTotalDer(nodo.nodoDerecho);
SumaIzq = SumaTotal(nodo.nodoIzquierdo);
SumaTotalFinal = SumaTotalFinal + SumaTotal(nodo.nodoIzquierdo);
SumaTotalFinal= SumaTotalFinal - SumaIzq;
}
    else
    {
        return 0;
    }
return SumaTotalFinal  ;
}
     public boolean buscalo (NodoArbol nodo, int dato) {     
        
        if (nodo == null) {
            return false;
        }

        if (nodo.datos == dato) {
            return true;
        } 
        else 
        {
            if (!buscalo(nodo.nodoIzquierdo, dato)){
                return buscalo(nodo.nodoDerecho, dato);
            }
            else
            {
                return true;
            }
        }
    }
}
//************CODIGO DEL PROF****************
//public int ObtenerAlturaMain()
//{
//altura = 0;
//ObtenerAltura(raiz,1);
//return altura;
//}
//
//private void ObtenerAltura(NodoArbol nodo, int nivel)
//{
//if(nodo != null)
//{
//altura = nivel;
//    }
//ObtenerAltura(nodo.nododerecho, nivel+1);
//}
//public int ObtenerSumaTotal(){
//sumaTotalFinal = 0;
//
//return SumaTotal(raiz);
//}
//
//private int SumaTotal(NodoArbol nodo)
//{
//    if(nodo != null)
//{
//sumaTotalFinal = nodo.datos + SumaTotal(nodo.nodoIzquierdo);
//sumaTotalFinal = sumaTotalFinal + SumaTotal(nodo.nodoDerecho);
//}
//return SumaTotalFinal;
//}
