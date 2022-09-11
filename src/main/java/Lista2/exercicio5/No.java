/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio5;

/**
 *
 * @author leona
 */
public class No {
    
     Pessoa p;
     No proximo;
     No anterior;
    
    public No(Pessoa pessoa){
        this.p=pessoa;
    }
    
    public String toString(){
           if(proximo!=null && anterior!=null ){
               return this.hashCode()+"  Pessoa-->"+p.toString()+"  |Proximo:"+proximo.hashCode()+"  |Anterior:"+anterior.hashCode();
           }
           else if(proximo !=null && anterior ==null){
               return this.hashCode()+"  Pessoa-->"+p.toString()+"  |Proximo:"+proximo.hashCode();
           }
           else if(proximo ==null && anterior!= null){
               return this.hashCode()+"  Pessoa-->"+p.toString()+"  |Anterior:"+anterior.hashCode();
           }
           else{
               return this.hashCode()+"  Pessoa-->"+p.toString()+"  |Proximo:Vazio  |Anterior: Vazio";
           }


   }
 
}
