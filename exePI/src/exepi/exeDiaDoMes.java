package exepi;

import java.util.Scanner;

public class exeDiaDoMes {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== DESCOBRINDO OS DIAS DOS MESES! ===");
        System.out.println("");
        System.out.println("Digite o número do mês: ");
        int mes = Integer.parseInt(read.nextLine());

        if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
            System.out.printf("O mês %d possui 30 dias!\n", mes);
        } else if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
            System.out.printf("O mês %d possui 31 dias!\n", mes);
        } else if (mes == 2) {
            System.out.println("O mês 2 possui 28 dias!");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
