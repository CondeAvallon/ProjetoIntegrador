package lista2;

import java.util.Scanner;

public class exe7 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int idade, divisao, preco;
        preco = 100;

        System.out.println("=== PLANOS DE SAÚDE! ===");
        System.out.println("");

        System.out.print("Digite a sua idade: ");
        idade = Integer.parseInt(read.nextLine());
        System.out.println("");

        divisao = idade % 2;

        switch (divisao) {
            case 0:
                if (idade < 10) {
                    System.out.println("O valor do plano de saúde é: " + (preco + 80));
                } else if ((idade >= 10) && (idade < 40)) {
                    System.out.println("O valor do plano de saúde é: " + (preco + 50));
                } else if ((idade >= 40) && (idade <= 60)) {
                    System.out.println("O valor do plano de saúde é: " + (preco + 95));
                } else if (idade > 60) {
                    System.out.println("O valor do plano de saúde é: " + (preco + 130));
                }
                break;
            case 1:
                if (idade < 10) {
                    System.out.println("O valor do plano de saúde é: " + (preco + 80));
                } else if ((idade >= 10) && (idade < 40)) {
                    System.out.println("O valor do plano de saúde é: " + (preco + 50));
                } else if ((idade >= 40) && (idade <= 60)) {
                    System.out.println("O valor do plano de saúde é: " + (preco + 95));
                } else if (idade > 60) {
                    System.out.println("O valor do plano de saúde é: " + (preco + 130));
                }
                break;

        }
        System.out.println("");
        System.out.println("=== FIM ===");

    }

}
