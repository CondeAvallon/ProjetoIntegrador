
package exepi;

import java.util.Random;
import java.util.Scanner;


public class exeAdivinha {
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        Random gerador = new Random ();
        
        int numero = gerador.nextInt(10)+1;
        
        System.out.println(" === ADIVINHE! ===");
        System.out.println("");
        System.out.println("O programa gerou um número de 1 a 10. Tente adivnhá-lo!");
        int tentativa = read.nextInt();
        System.out.println("O número gerado foi: "+numero);
        
        if (tentativa == numero){
            System.out.println("Parabéns! Você acertou!");
        } else {
            System.out.println("Você errou! Tente novamente!");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
