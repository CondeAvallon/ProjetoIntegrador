package lista3;

import java.util.Scanner;

public class exe12 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== SOMANDO FRAÇÕES 3 ===\n");

        //entradas
        double soma = 0, num, x = 0;

        System.out.println("Digite um número: ");
        num = Integer.parseInt(read.nextLine());

        //processamento
        for (double i = num; i > 0; i--) {
            x = x + 1;
            soma += x / i;
        }

        //saída
        System.out.println("A soma é: " + soma);
        System.out.println("");
        System.out.println("=== FIM ===");

    }

}
