package lista3;

import java.util.Scanner;

public class exe11 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== SOMA DAS FRAÇÕES 2 ===\n");

        //entrada
        double num, soma = 1,sinal = 1;

        System.out.println("Digite um número: ");
        num = Double.parseDouble(read.nextLine());

        //processamento
        for (double i = 2; i <= num; i++) {

            sinal = -sinal;
            soma = soma + sinal * (1 / i);
        }

        //saída
        System.out.println("A soma das frações: " + soma);
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
