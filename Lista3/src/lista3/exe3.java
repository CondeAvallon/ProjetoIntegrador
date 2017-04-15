package lista3;

import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== MAIOR NÚMERO ====\n");

        //entradas
        int maior = 0, num;

        //processamento
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            num = Integer.parseInt(read.nextLine());

            if (num > maior) {
                maior = num;
            }

        }
        //saida
        System.out.println("O maior número é: " + maior);
    }

}
