package lista2;

import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int valor, divis100, divis50, divis10, divis5, resto100, resto5;
        
        System.out.println("=== PROGRAMA DE CÁLCULO DE NOTAS ===");
        System.out.println("");

        System.out.print("Digite o valor: ");
        valor = Integer.parseInt(read.nextLine());

        divis100 = valor / 100;
        resto100 = (valor - (divis100 * 100));
        divis50 = resto100 / 50;
        divis10 = resto100 / 10;
        resto5 = (resto100) - (divis10 * 10);
        divis5 = resto5 / 5;
        
        System.out.println("");
        System.out.println("Total de notas: ");
        System.out.println("");

        switch (divis100) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println(divis100 + " notas de 100.");

        }
        switch (divis50) {
            case 0:
                if ((divis10 == 1) || (divis10 == 2) || (divis10 == 3) || (divis10 == 4)) {
                    System.out.println(divis10 + " notas de 10.");
                    break;
                }
            case 1:
                if (divis50 > 0){
                System.out.println("1 nota de 50.");
                }
                if ((divis10 == 6) || (divis10 == 7) || (divis10 == 8) || (divis10 == 9)) {
                    System.out.println(divis10 - 5 + " notas de 10.");
                }
        }
        switch (divis5) {
            case 0:
                if (resto5 > 0) {
                    System.out.println(resto5 + " notas de 1");
                }
                break;
            case 1:
                if (divis5 == 1);
                System.out.println("1 nota de 5.");
                if (resto5 < 5) {
                    System.out.println(resto5 + " notas de 1.");
                } else if (resto5 > 5) {
                    System.out.println(resto5 - 5 + " notas de 1.");
                }
        }
        System.out.println("");
        System.out.println("=== FIM ===");

    }

}
