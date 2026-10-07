
package com.mycompany.rpg1;

public class ChickenJockey {
    private String nome;
    private int vida;
    private int dano;
    
    //Construtor
public ChickenJockey(String nome) {
    this.nome = nome;
    vida = 250;
    dano = 10;
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

public void TomarPorrada(int dano) {
    vida = vida - dano;
    if(vida <= 0) {
        System.out.println(nome + "Morreu");
    }
    else {
        System.out.println(nome + "possui" + vida);
    }
}
    public void Bater(Guerreiro NobruzeiraApelao) {
        if(vida > 0 && NobruzeiraApelao.getVida() > 0) {
            System.out.println(nome + " atacou " + NobruzeiraApelao.getNome() + "!");
                NobruzeiraApelao.TomarPorrada(dano);
}
    }
}