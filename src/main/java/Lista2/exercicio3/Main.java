/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio3;

/**
 *
 * @author leona
 */
public class Main {
    
    public static void main(String[] args) {
        
        Lista lista = new Lista();
    
        Tenis t1 = new Tenis();
        t1.insert("Nike", "vermelho");
        lista.insert(new No(t1));
        
            
        Tenis t2 = new Tenis();
        t2.insert("Adidas", "azul");
        lista.insert(new No(t2));
        
           
        Tenis t3 = new Tenis();
        t3.insert("Pulma", "preto");
        lista.insert(new No(t3));
        
        lista.showList();
        lista.cleanList();
        lista.showList();
        
    }
    

    
}
