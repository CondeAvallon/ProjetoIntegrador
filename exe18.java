package lista1;

import java.util.Scanner;

public class exe18 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int numa, numb, numc, max, med, min;
        double a2, b2, c2;

        System.out.println(" === IDENTIFICANDO OS TRIÂNGULOS! ===");
        System.out.println("");
        
        System.out.println("Digite o valor de A: ");
        numa = read.nextInt();
        System.out.println("Digite o valor de B: ");
        numb = read.nextInt();
        System.out.println("Digite o valor de C: ");
        numc = read.nextInt();

        max = Math.max(numa, Math.max(numb, numc));
        med = Math.max(Math.max(Math.min(numa, numb), Math.min(numb, numc)), (Math.max(Math.min(numb, numc), Math.min(numa, numc))));
        min = Math.min(numa, Math.min(numb, numc));

        a2 = Math.pow(numa, 2);
        b2 = Math.pow(numb, 2);
        c2 = Math.pow(numc, 2);

        System.out.printf("Valores ordenados: %d, %d e %d\n", max, med, min);

        if (numa >= (numb + numc)) {
            System.out.println("Não forma um triângulo!");
        } else if (a2 == b2 + c2) {
            System.out.println("Triângulo Retângulo!");
        } else if (a2 > b2 + c2) {
            System.out.println("Triângulo Obtusângulo!");
        } else if (a2 < b2 + c2) {
            System.out.println("Triângulo Acutângulo!");

        }
        if (numa <= (numb + numc)) {
            if ((a2 == b2) && (a2 == c2)) {
                System.out.println("Triângulo Equilatero!");
            } else if ((a2 == b2) || (a2 == c2) || (b2 == c2)) {
                System.out.println("Triângulo Isósceles!");
            }
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
