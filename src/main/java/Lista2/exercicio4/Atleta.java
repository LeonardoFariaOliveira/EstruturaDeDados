/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.exercicio4;

/**
 *
 * @author leona
 */
public class Atleta {
    
    
        String nome;
    float altura;
    float peso;
    String esporte;
    String patrocinadores;
    
    
    public Atleta(String nome, float altura, float peso, String esportes, String patrocina){
        this.nome=nome;
        this.altura=altura;
        this.peso=peso;
        this.esporte=esportes;
        this.patrocinadores=patrocina;
    }
    
    public String toString(){
        return "Nome:"+nome+" | Altura:"+altura+" | Peso:"+peso+" | Esporte:"+esporte+" | Patrocinadores:"+patrocinadores;
    }

    
}
