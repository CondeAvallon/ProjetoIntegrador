package lista2;

import java.util.Scanner;

public class exe6 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int dia;

        System.out.println("=== DIAS DA SEMANA! ===");
        System.out.println("");

        System.out.print("Digite o número do dia da semana: ");
        dia = Integer.parseInt(read.nextLine());

        switch (dia) {
            case 1:
                System.out.println("Domingo. Fim de semana!");
                break;
            case 2:
                System.out.println("Segunda-feira. Dia de semana!");
                break;
            case 3:
                System.out.println("Terça-feira. Dia de semana!");
                break;
            case 4:
                System.out.println("Quarta-feira. Dia de semana!");
                break;
            case 5:
                System.out.println("Quinta-feira. Dia de semana!");
                break;
            case 6:
                System.out.println("Sexta-feira. Dia de semana!");
                break;
            case 7:
                System.out.println("Sábado. Fim de semana!");
                break;
            default:
                System.out.println("Dia inválido!");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
