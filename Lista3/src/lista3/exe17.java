package lista3;

import java.util.Scanner;

public class exe17 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("=== IDENTIFICANDO OS DIVISORES ===\n");
        
        //entradas
        int num,resto;
        
        System.out.println("Digite um número inteiro: ");
        num = Integer.parseInt(read.nextLine());
        
        System.out.println("");
        
        System.out.println(num + " é divisível por: \n");
        
        //processamento
        for (int i = num;i > 0;i--){
            
            resto = num % i;
            if (resto == 0){
                
                //saída
                System.out.println(i);
            }
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
