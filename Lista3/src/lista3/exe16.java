package lista3;

import java.util.Scanner;

public class exe16 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== IDENTIFICANDO NÚMEROS ===\n");

        //entradas
        int i = 0, num, valor, resto;

        System.out.println("Digite um número :");
        num = Integer.parseInt(read.nextLine());

        //processamento
        do {
            System.out.println("Digite um valor: ");
            valor = Integer.parseInt(read.nextLine());

            resto = valor % 2;

            //saídas
            if (resto == 0 && valor != 0) {
                System.out.print("Este número é par");
            } else if (resto == 1) {
                System.out.print("Este número é ímpar");
            } else if (resto == -1) {
                System.out.print("Este número é ímpar");
            }

            if (valor > 0) {
                System.out.println(" e positivo.");
            } else if (valor < 0) {
                System.out.println(" e negativo.");
            }

            if (valor == 0) {
                System.out.println("NULO.");
            }
            i++;
        } while (i < num);
        
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
