package exepi;

import java.util.Scanner;


public class exeBhaskara {

    public static void main(String[] args) {

        //entradas
        Scanner console = new Scanner(System.in);

        System.out.println("Digite o Valor de x1: ");
        double x1 = Double.parseDouble(console.nextLine());

        System.out.println("Digite o Valor de x2: ");
        double x2 = Double.parseDouble(console.nextLine());

        System.out.println("Digite o Valor de c: ");
        double c = Double.parseDouble(console.nextLine());

        //processamento
        double soma = x1 + x2;
        double prod = x1 * x2;

        double a = c / prod;
        double b = -(a * soma);

        //saida
        System.out.println(a + "x²" + b + "x+" + c + " = 0");
    }
    
}