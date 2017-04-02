
package exepi;

import java.util.Scanner;

public class exeDoacaoSangue {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("=== RELAÇÃO DOS TIPOS SANGUÍNEOS ===");
        System.out.println("");
        System.out.println("Digite o seu tipo sanguíneo: ");
        String tipo = read.next();
        
        switch (tipo){
            case "A+":
                System.out.println("O tipo A+ pode doar para tipos: A+ e B+");
                System.out.println("E pode receber dos tipos: A+, A-, O+ e O-");
                break;
            case "A-":
                System.out.println("O tipo A- pode doar para tipos: A+, A-, AB+ e AB-");
                System.out.println("E pode receber dos tipos: A- e O-");
                break;
            case "B+":
                System.out.println("O tipo B+ pode doar para tipos: B+ e AB+");
                System.out.println("E pode receber dos tipos: B+, B-, O+ e O-");
                break;
            case "B-":
                System.out.println("O tipo B- pode doar para tipos: B+, B-, AB+ e AB-");
                System.out.println("E pode receber dos tipos: B- e O-");
                break;
            case "AB+":
                System.out.println("O tipo AB+ pode doar para tipos: AB+");
                System.out.println("E pode receber dos tipos: A+, A-, B+, B-, AB+, AB-, O+ e O-");
                break;
            case "AB-":
                System.out.println("O tipo AB- pode doar para tipos: AB+ e AB-");
                System.out.println("E pode receber dos tipos: A-, B-, AB- e O-");
                break;
            case "O+":
                System.out.println("O tipo O+ pode doar para tipos: A+, B+, AB+ e O+");
                System.out.println("E pode receber dos tipos: O+ e O-");
                break;
            case "O-":
                System.out.println("O tipo O- pode doar para tipos: A+, A-, B+, B-, AB+, AB-, O+ e O-");
                System.out.println("E pode receber dos tipos: O-");
                break;
                
        }
        System.out.println("");
        System.out.println("=== FIM ===");
        
    }
    
    
}
