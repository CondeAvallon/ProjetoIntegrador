
package lista1;

import java.util.Scanner;

public class exe15 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println(" === PROGRAMA DE CÁLCULO BHASKARA! ===");
        System.out.println("");

        System.out.println("Digite o valor de A: ");
        int numA = read.nextInt();
        System.out.println("Digite o valor de B: ");
        int numB = read.nextInt();
        System.out.println("Digite o valor de C: ");
        int numC = read.nextInt();

        double delta = Math.pow(numB, 2) - 4 * numA * numC;
        System.out.println("O delta é: " + delta);

        if (delta > 0) {
            double result1 = (-(numB) + Math.sqrt(delta)) / (2 * numA);
            System.out.println("O resultado de x1 é: " + result1);
            double result2 = (-(numB) - Math.sqrt(delta)) / (2 * numA);
            System.out.println("O resultado de x2 é: " + result2);
        } else if (delta == 0) {
            double result1 = (-(numB) + Math.sqrt(delta)) / (2 * numA);
            System.out.println("As duas raízes são iguais!");
            System.out.println("O resultado de x1 é: " + result1);
            double result2 = (-(numB) - Math.sqrt(delta)) / (2 * numA);
            System.out.println("O resultado de x2 é: " + result2);
        } else if (delta < 0) {
            System.out.println("Impossível calcular!");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }
}
