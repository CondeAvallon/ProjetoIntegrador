package lista2;

import java.util.Scanner;

public class exe5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== PLANEJANDO A VIAGEM! ===");
        System.out.println("");

        String mes;

        System.out.println("Digite o mês que planeja viajar: ");
        mes = read.next();
        System.out.println("");

        switch (mes) {

            case "março":
            case "abril":
            case "maio":
            case "agosto":
            case "setembro":
            case "outubro":
            case "novembro":
                System.out.println("Este mês é de baixa temporada!");
                break;
            case "janeiro":
            case "fevereiro":
            case "junho":
            case "julho":
            case "dezembro":
                System.out.println("Este mês é de alta temporada!");
                break;
            default:
                System.out.println("Mês inválido.");

        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
