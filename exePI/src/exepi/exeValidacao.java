package exepi;

import java.util.Scanner;

public class exeValidacao {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 12: ");
        int num = Integer.parseInt(read.nextLine());

        if ((num >= 1) && (num <= 12)) {
            int dobro = num * 2;
            System.out.println("Dobro: " + dobro);
        } else if ((num < 1) || (num > 12)) {
            System.out.println("Número inválido!");
        }
    }

}
