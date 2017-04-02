
package lista1;

import java.util.Scanner;

public class exe11 {
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        float num1;
        
        System.out.println("Digite um número: ");
        num1 = read.nextFloat();
        
        if (num1 < 0){
            System.out.println("Número negativo!");
        }
    }
    
}
