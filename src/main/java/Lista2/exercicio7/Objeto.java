/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio7;

/**
 *
 * @author leona
 */
public class Objeto {
    
     int chave;
    String nome;
    
    public void setObjeto(int c, String n){
        this.chave=c;
        this.nome=n;
    }
    
    public Objeto(int c,String n){
        this.chave=c;
        this.nome=n;
    }
    
    public String tostring(){
        return "Chave:"+chave+"   Nome:"+nome;
    }
    
}
