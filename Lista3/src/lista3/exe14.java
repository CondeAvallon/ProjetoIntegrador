package lista3;

import java.util.Scanner;

public class exe14 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== SOMANDO FRAÇÕES 4 ===\n");

        //entradas
        double num, soma = 1, x = 1;

        System.out.println("Digite um número: ");
        num = Double.parseDouble(read.nextLine());

        //processamento
        for (double i = 2; i <= 2 * num; i = i + 2) {

            x += 2;
            soma += i / x;

        }

        //saída
        System.out.println("A soma é: " + soma);
        System.out.println("");
        System.out.println("=== FIM ===");

    }

}
