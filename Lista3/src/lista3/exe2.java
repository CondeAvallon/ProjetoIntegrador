package lista3;

import java.util.Scanner;

public class exe2 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("=== SOMANDO OS NÚMEROS ===\n");
        
        //entradas
        int i = 0,soma = 0,num;
        
        System.out.println("Digite um número inteiro: ");
        num = Integer.parseInt(read.nextLine());
        
        //processamento
        while (i < num){
            i++;
            soma += i;
        }
        
        //saida
        System.out.println("A soma dos números é: " + soma);
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
