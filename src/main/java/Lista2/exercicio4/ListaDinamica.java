/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio4;

/**
 *
 * @author leona
 */
public class ListaDinamica {
    
    No inicio;
    No fim;
    
    public void insere(No n){
        if(inicio==null){
            inicio=n;
            fim=n;
        }
        else{
         fim.proximo=n;
         fim=n;
        }
    }
    
    public void imprime(){
        No aux = inicio;
        while(aux!=null){
            System.out.println(aux.toString());
            aux=aux.proximo;
        }
    }
    
    public No busca(String procurado){
        No aux=inicio;
        
        while(aux!=null){
            if(aux.toString().contains(procurado)){
                return aux;
            }
            aux=aux.proximo;
        }
        return null;
    }
    
    public void remover(String tirar){
        No anterior = null;
        No remove = inicio;
        
        while(remove!=null){
            if(remove.toString().contains(tirar)){
                if(anterior!=null){
                    anterior.proximo=remove.proximo;
                    if(remove==fim){
                        fim=anterior;
                    }
                   remove.proximo=null;
                }
                
                else{
                    inicio = remove.proximo;
                    remove.proximo=null;
                    if(fim == remove){
                        fim=remove.proximo;
                    }
                }
            }
            anterior=remove;
            remove=remove.proximo;
        }
    }
}

    

