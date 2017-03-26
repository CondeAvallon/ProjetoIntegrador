
package exepi;

import java.util.Scanner;


public class exeJogoDaVelha {
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("=== JOGO DA VELHA ===");
        System.out.println("");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("");
        
        System.out.println("De quem é a vez de jogar?");
        String x = read.next();
        
        System.out.println("Em qual posição você quer jogar?");
        int z = read.nextInt();
        
        if (z == 1){
        System.out.println(" "+x+" |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   "); 
        } else if (z == 2){
        System.out.println("   | "+x+" |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");    
        } else if (z == 3){
        System.out.println("   |   | "+x+" ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        } else if (z == 4){
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println(" "+x+" |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        } else if (z == 5){
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   | "+x+" |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        } else if (z == 6){
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   | "+x+" ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        } else if (z == 7){
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println(" "+x+" |   |   ");
        } else if (z == 8){
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   | "+x+" |   ");
        } else if (z == 9){
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   | "+x+" ");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
