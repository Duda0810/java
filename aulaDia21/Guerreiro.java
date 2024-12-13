/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaDia21;

/**
 *
 * @author MARIAEDUARDACOSTABAT
 */
    public class Guerreiro implements Personagem {

    private int ataque;
   
    
        public String oponente(){
            this.nome();
            this.vida();
            this.atacar();
            this.defesa();
        return null;
    }
    
        
    @Override
    public void vida(){
    }
    
    @Override
       public String nome() {
           String nome = null;
           return nome;
    }

  @Override
    public void atacar() {
      System.out.println(" atacou " + this.nome() + oponente.nome + " e causou " + (this.ataque + 20) + " de dano!");
    }
    
    @Override
    public void defesa() {
    System.out.println("Not supported yet."); 
    }
}


