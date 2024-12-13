/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaDia21;

/**
 *
 * @author MARIAEDUARDACOSTABAT
 */
public class Feiticeiro implements Personagem {

    public void lançarFeitico(Personagem oponente) {
        oponente.vida -= this.ataque + 20;
        System.out.println(this.nome + " lançou um feitiço em " + oponente.nome + " e causou " + (this.ataque + 20) + " de dano!");
    }
}

