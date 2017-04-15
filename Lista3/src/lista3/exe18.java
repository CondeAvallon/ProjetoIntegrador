package lista3;

import java.util.Scanner;

public class exe18 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== SEQUÊNCIA DE FIBONACCI ===\n");

        //entradas
        int num, num1, num2;

        System.out.println("Digite um número (até 46): ");
        num = Integer.parseInt(read.nextLine());

        num1 = 1;
        num2 = 0;

        //processamento
        for (int i = 0; i < num; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            //saída
            System.out.println(num1);
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
