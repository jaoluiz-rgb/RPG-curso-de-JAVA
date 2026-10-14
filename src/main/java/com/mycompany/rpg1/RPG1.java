
package com.mycompany.rpg1;

public class RPG1 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao RPG!");

        Missao missao = new Missao("Invasão dos ChickenJockeis");
        missao.iniciar();
    }
}
