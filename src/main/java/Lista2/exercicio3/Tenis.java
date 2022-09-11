/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio3;

/**
 *
 * @author leona
 */
public class Tenis {
    
    String cor;
    String marca;
    
    public void insert(String c, String m){
        
        this.cor = c;
        this.marca = m;
        
    }
    
    public String toString(){
        
        return "Marca: "+this.marca+" Cor: "+this.cor;
        
    }
    
}
