package exepi;

import java.util.Random;
import java.util.Scanner;

public class exeJokenpo {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println(" === PEDRA, PAPEL OU TESOURA! ===");
        System.out.println("");

        System.out.println("Escolha pedra, papel ou tesoura!");
        String jogada = read.next();

        int p = gerador.nextInt(2);

        if (p == 0) {
            System.out.println("O sistema gerou: Pedra");
            if (jogada.equals("pedra")) {
                System.out.println("Empate!");
            } else if (jogada.equals("papel")) {
                System.out.println("Você ganhou!");
            } else if (jogada.equals("tesoura")) {
                System.out.println("Você perdeu!");
            }
        } else if (p == 1) {
            System.out.println("O sistema gerou: Papel");
            if (jogada.equals("pedra")) {
                System.out.println("Você perdeu!");
            } else if (jogada.equals("papel")) {
                System.out.println("Empate!");
            } else if (jogada.equals("tesoura")) {
                System.out.println("Você ganhou!");
            }
        } else if (p == 2) {
            System.out.println("O sistema gerou: Tesoura");
            if (jogada.equals("pedra")) {
                System.out.println("Você ganhou!");
            } else if (jogada.equals("papel")) {
                System.out.println("Você perdeu!");
            } else if (jogada.equals("tesoura")) {
                System.out.println("Empate!");
            }
        }
        System.out.println("");
        System.out.println(" === FIM ===");

    }

}
