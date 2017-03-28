
package exepi;

import java.util.Random;
import java.util.Scanner;

public class exeWar2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random dados = new Random();

        System.out.println("=== BEM-VINDO À GUERRA !!! ===");
        System.out.println("");

        System.out.println("Escolha com quantas unidades você irá atacar! (máx.3)");
        int ataque = read.nextInt();

        System.out.println("Escolha com quantas unidades você irá se defender (máx.3)");
        int defesa = read.nextInt();

        System.out.println("");
        System.out.println("A batalha se inicia!");
        System.out.println("");
        
        switch (ataque | defesa){
            
            case 1 | 1: 
                
                int dado1atk = dados.nextInt(6)+1;
                System.out.println("Ataque: "+dado1atk);
                int dado1def = dados.nextInt(6)+1;
                System.out.println("Defesa: "+dado1def);
                
                if (dado1atk > dado1def){
                    System.out.println("O atacante ganhou!");
                } else {
                    System.out.println("O defensor ganhou!");
                } 
                
            case 2 | 1:
                
                
                
                
            } 
        }   
    }

