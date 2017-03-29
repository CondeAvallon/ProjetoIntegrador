package lista1;

import java.util.Scanner;

public class exe13 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num1, num2, num3, maior;

        System.out.println("Digite um número: ");
        num1 = read.nextInt();
        System.out.println("Digite um segundo número: ");
        num2 = read.nextInt();
        System.out.println("Digite um terceiro número: ");
        num3 = read.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("O maior número é: " + num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("O maior número é: " + num2);
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println("O maior número é: " + num3);
        } else if ((num1 == num2) && (num1 == num3)) {
            System.out.println("O maior número é: " + num1);
        }
    }

}
