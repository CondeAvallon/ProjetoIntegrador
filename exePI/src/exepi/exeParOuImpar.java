package exepi;

import java.util.Random;
import java.util.Scanner;

public class exeParOuImpar {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("=== PAR OU ÍMPAR ===");
        System.out.println("");
        System.out.println("Escolha par ou impar!");
        String escolha = read.next();
        System.out.println("Digite um número: ");
        int numero = read.nextInt();

        int aleatorio = gerador.nextInt(5);
        System.out.println("Número gerado: " + aleatorio);

        int soma = numero + aleatorio;
        int total = soma % 2;
        System.out.println("O total foi: " + soma);

        if (total == 0) {
            if ((escolha.equals("par")) || (escolha.equals("Par"))) {
                System.out.println("Parabéns! O resultado foi par e você ganhou!");
            }
            if ((escolha.equals("impar")) || (escolha.equals("Impar"))) {
                System.out.println("Você escolheu ímpar e o resultado foi par. Tente novamente!");
            }
        } else {
            if ((escolha.equals("impar")) || (escolha.equals("Impar"))) {
                System.out.println("Parabéns! O resultado foi ímpar e você ganhou!");
            } else if ((escolha.equals("par")) || (escolha.equals("Par"))) {
                System.out.println("Você escolhar par e o resultado foi impar. Tente novamente!");
            }

        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
