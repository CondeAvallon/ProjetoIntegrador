package lista2;

import java.util.Scanner;

public class exe4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int mes, ano, bis;

        System.out.println("=== DESCOBRINDO OS DIAS DOS MESES! ===");
        System.out.println("");
        System.out.print("Digite o número do mês: ");
        mes = Integer.parseInt(read.nextLine());
        System.out.println("Digite o ano: ");
        ano = Integer.parseInt(read.nextLine());
        System.out.println("");

        bis = ano % 4;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("O mês " + mes + " possui 31 dias.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("O mês " + mes + " possui 30 dias.");
            case 2:
                if (bis == 0) {
                    System.out.println("O mês 2 tem 29 dias neste ano pois este é bissexto.");
                } else {
                    System.out.println("O mês 2 possui 28 dias.");
                }
        }

    }

}
