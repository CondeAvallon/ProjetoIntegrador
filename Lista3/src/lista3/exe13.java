package lista3;

import java.util.Scanner;

public class exe13 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== MULTIPLICANDO NÚMEROS ===\n");

        //entradas
        double num, x = 1, total = 0, soma1 = 1, soma2 = 1;

        System.out.println("Digite um número: ");
        num = Integer.parseInt(read.nextLine());

        //processamento
        for (double i = 1; i <= num; i++) {

            soma1 *= i;
            soma2 *= x;
            x += 2;

        }

        total = 1 + (soma1 / soma2);

        //saída
        System.out.println("A soma é: " + total);
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
