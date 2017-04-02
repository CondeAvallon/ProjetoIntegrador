package exepi;

import java.util.Scanner;

public class exeCombustivel {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== COMPARAÇÃO DE COMBUSTÍVEL ===");
        System.out.println("");

        System.out.println("Digite quantos km/l o seu carro faz com gasolina: ");
        double gasolina = Double.parseDouble(read.nextLine());
        System.out.println("E com álcool?");
        double alcool = Double.parseDouble(read.nextLine());
        System.out.println("Qual o preço da gasolina por litro?");
        double precogas = Double.parseDouble(read.nextLine());
        System.out.println("E o preço do álcool por litro?");
        double precoalc = Double.parseDouble(read.nextLine());

        double kmgas = gasolina / precogas;
        double kmalc = alcool / precoalc;

        System.out.println("");

        if (kmgas > kmalc) {
            System.out.println("Veredito: O seu carro é mais eficiente usando gasolina.");
        } else {
            System.out.println("Veredito: O seu carro é mais eficiente usando álcool.");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
