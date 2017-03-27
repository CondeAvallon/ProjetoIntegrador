package exepi;

import java.util.Scanner;

public class exeTriangulo {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== IDENTIFICANDO OS TRIÂNGULOS! ===");
        System.out.println("");
        System.out.println("Digite a medida A do triângulo: ");
        double meda = read.nextDouble();
        System.out.println("Digite a medida B do triângulo: ");
        double medb = read.nextDouble();
        System.out.println("Digite medida C do triângulo: ");
        double medc = read.nextDouble();

        if (((medb - medc) < meda) && ((medb + medc) > meda)) {
            System.out.println("As medidas " + meda + ", " + medb + " e " + medc + " formam um triângulo!");
            if ((meda == medb) && (meda != medc)) {
                System.out.println("Este triângulo é isósceles!");
            } else if ((medc == medb) && (medb != meda)) {
                System.out.println("Este triângulo é isósceles!");
            } else if ((meda == medc) && (medb != meda)) {
                System.out.println("Este triângulo é isósceles!");
            } else if ((meda == medb) && (meda == medc)) {
                System.out.println("Este triângulo é equilatero!");
            } else if ((meda != medb) && (medb != medc)) {
                System.out.println("Este triângulo é escaleno");
            }
        } else {
            System.out.println("As medidas " + meda + ", " + medb + " e " + medc + " não formam um triângulo!");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
