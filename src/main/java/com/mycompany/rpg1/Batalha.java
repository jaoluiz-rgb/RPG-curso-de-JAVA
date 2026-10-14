
package com.mycompany.rpg1;

public class Batalha {
    private Guerreiro Herodes;
    private ChickenJockey ChickenJockei;
    private ChickenJockey JockeiChicken;
    
    public Batalha(Guerreiro guerreiroG, ChickenJockey Z1, ChickenJockey Z2) {
      this.Herodes = guerreiroG;
      this.ChickenJockei = Z1;
      this.JockeiChicken = Z2;
    }
    
    public void iniciar () {
            
            System.out.println("A Batalha começa");
      
            int rodada = 1;
            
            while (Herodes.estaVivo() &&
                    (ChickenJockei.estaVivo() ||
                    JockeiChicken.estaVivo())) {
                    
              System.out.println("Rodada " + rodada + " iniciada");
            
                if(ChickenJockei.estaVivo()) {
                    Herodes.bater(ChickenJockei);
                } else {
                    Herodes.bater(JockeiChicken);
                }
            
                if(ChickenJockei.estaVivo()) {
                    ChickenJockei.bater(Herodes);
                }
                if(JockeiChicken.estaVivo()) {
                JockeiChicken.bater(Herodes);      
                }
                
                rodada++;  
            }  
            if (Herodes.estaVivo()) {
              System.out.println("Herodes venceu!");
              System.out.println("Vida restante: " + Herodes.getVida());
            } else {
              System.out.println("Os ChickenJockeis venceram!");
            }  
    }
}
