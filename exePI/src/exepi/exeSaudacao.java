package exepi;

import java.util.Scanner;

public class exeSaudacao {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = read.next();

        if (nome.equals("")) {
            System.out.println("Olá, mundo!");
        } else {
            System.out.println("Olá, " + nome);
        }
    }
}
