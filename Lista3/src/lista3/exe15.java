package lista3;

import java.util.Scanner;

public class exe15 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== FATORANDO NÚMEROS ===\n");

        //entradas
        int num, x;

        System.out.println("Digite um número inteiro: ");
        num = Integer.parseInt(read.nextLine());

        int fator = num;

        System.out.println("\nFatorial de " + num + " é: ");

        //processamento
        for (int i = num; i > 1; i--) {

            x = i - 1;
            fator *= x;
            
            //saída
            System.out.println(num + "!" + x + " = " + fator);

        }
        System.out.println("");
        System.out.println("=== FIM ===");

    }

}
