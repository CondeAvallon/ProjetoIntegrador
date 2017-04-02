
package lista1;

import java.util.Scanner;

public class exe12 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double lado, raio, areaquad, areacirc, rquad;

        System.out.println("Digite um dos lados do quadrado: ");
        lado = read.nextDouble();
        System.out.println("Digite o raio do círculo: ");
        raio = read.nextDouble();

        areaquad = Math.pow(lado, 2);
        rquad = Math.pow(raio, 2);
        areacirc = 3.14159 * rquad;

        if (areaquad > areacirc) {
            System.out.println("A maior área é a do quadrado: "+areaquad);
        } else {
            System.out.println("A maior área é a do círculo: "+areacirc);

        }
    }

}

