/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio5;

/**
 *
 * @author leona
 */
public class Fila {
    
    
     No inicio;
    No fim;
    
    public void entrar(No p){
       if(inicio==null){
           inicio=p;
           fim=p;
           
       }
       else{
           fim.proximo=p;
           p.anterior=fim;
           fim=p;    
       }
   }
    
    public void tirar(){
        if(inicio==fim){
        fim=null;
        inicio=null;
        }
        else{
           inicio=inicio.proximo;
        }
    }
    
    public void imprimir(){
        No aux=inicio;
        
        while(aux!=null){
            System.out.println(aux.toString());
            aux=aux.proximo;
        }
    }
    
}
