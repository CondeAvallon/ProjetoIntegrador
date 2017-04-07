
package lista2;

import java.util.Scanner;

public class exe1 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num1,divis;
        
        System.out.println("=== DIVISÍVEL POR 3? ===");
        System.out.println("");
        System.out.println("Digite um número: ");
        num1 = Integer.parseInt(read.nextLine());
        System.out.println("");
        
        divis = num1 % 3;
        
        switch (divis){
            case 0:
                System.out.println("Este número é divisível por 3.");
                break;
            default:
                System.out.println("Este mês não é divisível por 3.");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
