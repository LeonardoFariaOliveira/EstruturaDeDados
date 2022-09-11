/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio4;

/**
 *
 * @author leona
 */
public class No {
    
    Atleta a;
    No proximo;
    
    public No(Atleta a){
     this.a=a;
    }
    
    public String toString(){
        if(proximo==null){
            return this.hashCode()+"  |Atleta "+a.toString();
        }
        else{
            return this.hashCode()+"  |Atleta "+a.toString()+"  |  Proximo: "+proximo.hashCode();
        }
    }
}

    

