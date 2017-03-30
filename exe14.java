package lista1;

import java.util.Scanner;

public class exe14 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num1, num2, divisao;

        System.out.println("Digite um número: ");
        num1 = read.nextInt();
        System.out.println("Digite um outro número: ");
        num2 = read.nextInt();

        if (num1 > num2) {
            divisao = num1 / num2;
            System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + divisao);
        } else {
            divisao = num2 / num1;
            System.out.println("A divisão de " + num2 + " por " + num1 + " é: " + divisao);
        }
    }

}
