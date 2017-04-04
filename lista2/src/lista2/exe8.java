
package lista2;

import java.util.Scanner;

public class exe8 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        String mes;
        int multa = 100;
        
        System.out.println("=== CÁLCULO DE MULTA! ===");
        System.out.println("");
        
        System.out.println("Digite o mês em que a multa será paga: ");
        mes = read.next();
        
        switch (mes){
            case "janeiro":
                System.out.println("O valor da multa será: R$ " + multa);
                break;
            case "fevereiro":
                double multa2 = multa + (multa*(0.05));
                System.out.println("O valor da multa será: R$ " + multa2);
                break;
            case "marco":
                double multa3 = multa + (multa*(0.05*2.05));
                System.out.println("O valor da multa será: R$ " + multa3);
                break;
            case "abril":
                double multa4 = multa + (multa*(0.005*2.05)*2.05);
                System.out.println("O valor da multa será: R$ " + multa4);
                break;
        }
    }
    
}
