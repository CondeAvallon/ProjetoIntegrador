package lista1;

import java.util.Scanner;

public class exe16 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int hora1, hora2, total;

        System.out.println(" === CÁLCULO DE HORAS DO JOGO ===");
        System.out.println("");
        System.out.println("Digite a hora inicial do jogo: ");
        hora1 = read.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        hora2 = read.nextInt();

        if (hora2 <= hora1) {
            total = ((24 - hora1) + hora2);
            if ((total >= 1) && (total <= 24)) {
                System.out.println("O jogo durou " + total + " hora(s)!");
                System.out.println("");
                System.out.println("=== FIM ===");
            }
        } else if (hora2 >= hora1) {
            total = (hora2 - hora1);
            if ((total >= 1) && (total <= 24)) {
                System.out.println("O jogo durou " + total + " hora(s)!");
                System.out.println("");
                System.out.println("=== FIM ===");
            }
        }
    }

}
