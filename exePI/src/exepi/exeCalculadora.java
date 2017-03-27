package exepi;

import java.util.Scanner;

public class exeCalculadora {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = read.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 = read.nextDouble();
        System.out.println("Qual operação você deseja usar com estes números? Soma, Subtracao, Multiplicacao ou Divisao?");
        String operacao = read.next();

        if ((operacao.equals("Soma")) || (operacao.equals("soma"))) {
            double resultado = num1 + num2;
            System.out.println("O resultado da soma é: " + resultado);
        } else if ((operacao.equals("Subtracao")) || (operacao.equals("subtracao"))) {
            double resultado = num1 - num2;
            System.out.println("O resultado da subtração é: " + resultado);
        } else if ((operacao.equals("Multiplicacao")) || (operacao.equals("multiplicacao"))) {
            double resultado = num1 * num2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else if ((operacao.equals("Divisao")) || (operacao.equals("divisao"))) {
            double resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        }
    }

}
