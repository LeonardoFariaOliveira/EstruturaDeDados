/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio5;

/**
 *
 * @author leona
 */
public class Pessoa {
    
    String nome;
    int idade;
    
    public Pessoa(String s, int i){
        this.nome=s;
        this.idade=i;
    }
    
    
    public String toString(){
        return "nome: "+nome+"  ||  idade: "+idade;
    }
    
}
