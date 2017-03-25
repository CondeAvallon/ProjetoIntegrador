package exepi;

import java.util.Scanner;

public class exeTemp {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double fahr, celsius;

        System.out.println("=== Conversão de Temperatura ===");
        System.out.println("");
        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahr = read.nextDouble();

        celsius = 5.0 / 9.0 * (fahr - 32.0);

        System.out.println("A temperatura em Celsius é: " + celsius);
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
