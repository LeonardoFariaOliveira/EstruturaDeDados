/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio3;

/**
 *
 * @author leona
 */
public class Lista {
    
    No lista[] = new No[5];
    int fim = -1;
    
    public void insert(No n){
        
        if(fim == -1 || fim < (lista.length-1)){
            
            fim++;
            lista[fim] = n;
            
        }
         
    }
    
    public void showList(){
        
        for (int i = 0; i <= fim; i++) {
            System.out.println(lista[i].toString());
        }
        
    }
    
    public void cleanList(){
        
        for(int i = 0; i < fim; i++){
            
            lista[i] = null;
            
        }
        fim = -1;
        System.out.println("Lista foi limpa");
        
    }
    
    public void remove(String m){
        
        int pos = 0;
        No apagado;
        for(int i = 0; i < fim; i++){
            
            if(lista[i].toString().equals(m)){
                pos= i;
                apagado = lista[i];
                break;
            }
            
        }
        for (int i = pos; i < fim; i++) {
            lista[i] = lista[i + 1];
        }
        lista[fim] = null;
        fim--;
        System.out.println("Tenis excluído com sucesso");
        
    }
    
}
