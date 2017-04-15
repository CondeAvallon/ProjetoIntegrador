package lista3;

import java.util.Scanner;

public class exe21 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== NÚMEROS PERFEITOS ===\n");

        int i = 1, num, resto, soma = 0;

        System.out.println("Digite um número inteiro: ");
        num = Integer.parseInt(read.nextLine());

        while (i < num) {
            resto = num % i;

            if (resto == 0) {
                soma += i;
            }
            i++;
        }
        if (soma == num) {
            System.out.println("Este número é perfeito!");
        } else {
            System.err.println("Este número não é perfeito!");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
