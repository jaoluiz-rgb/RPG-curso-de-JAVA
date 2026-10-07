
package com.mycompany.rpg1;

public class Guerreiro {
    private String nome;
    private int vida;
    private int dano;
    
    //Construtor
public Guerreiro(String nome) {
    this.nome = nome;
    vida = 100;
    dano = 67;
}//Método 1

public String getNome() {
    return nome;
}//getNome

public int getVida() {
    return vida;
}//getVida

    public int getDano() {
        return dano;
}//getDano
    
    public void Bater(ChickenJockey Zombie) {
        if(vida > 0 && Zombie.getVida() > 0) {
            System.out.println(nome + " atacou " + Zombie.getNome() + "!");
                Zombie.TomarPorrada(dano);
        }
    }
    
    public void TomarPorrada(int dano) {
    vida = vida - dano;
    if(vida <= 0) {
        System.out.println(nome + "Morreu");
    }
    else {
        System.out.println(nome + "possui" + vida);
    }
}
}


