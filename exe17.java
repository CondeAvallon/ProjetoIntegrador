package lista1;

import java.util.Scanner;

public class exe17 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int numa, numb, numc, numd, soma1, soma2, par;

        System.out.println("Digite o valor de A: ");
        numa = read.nextInt();
        System.out.println("Digite o valor de B: ");
        numb = read.nextInt();
        System.out.println("Digite o valor de C: ");
        numc = read.nextInt();
        System.out.println("Digite o valor de D: ");
        numd = read.nextInt();

        soma1 = numc + numd;
        soma2 = numa + numb;

        if ((numb > numc) && (numd > numa) && (soma1 > soma2)) {
            if ((numc >= 0) && (numd >= 0) && (numa % 2 == 0)) {
                System.out.println("Valores aceitos.");
            } else {
                System.out.println("Valores não aceitos.");
            }
        } else {
            System.out.println("Valores não aceitos.");
        }
    }

}
