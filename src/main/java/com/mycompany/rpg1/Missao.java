
package com.mycompany.rpg1;

public class Missao {
       private String nome;
  
       public Missao (String nome) {
           this.nome = nome;
       }
    
        public void iniciar() {
          System.out.println("Missão iniciada: " + nome);

          Guerreiro Herodes = new Guerreiro ("Herodes");
          ChickenJockey ChickenJockei= new ChickenJockey("ChickenJockei");
          ChickenJockey JockeiChicken = new  ChickenJockey("JockeiChicken");

          Batalha batalha = new Batalha(Herodes, ChickenJockei, JockeiChicken);
          batalha.iniciar();

          if (Herodes.estaVivo()) {
            System.out.println("\nMissão concluída com sucesso!");
          } else {
            System.out.println("\nMissão fracassada!");
          }
    }    
}
