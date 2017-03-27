package exepi;

import java.util.Scanner;

public class exeIMC {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = read.next();
        System.out.println("Digite o seu peso: ");
        double peso = read.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = read.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println(nome + " está com Índice de Massa Corporal " + imc + "(Abaixo do peso).");
        } else if ((imc >= 18.5) && (imc < 25)) {
            System.out.println(nome + " está com Índice de Massa Corporal " + imc + "(Peso normal).");
        } else if ((imc >= 25) && (imc < 30)) {
            System.out.println(nome + " está com Índice de Massa Corporal " + imc + "(Acima do peso).");
        } else if (imc > 30) {
            System.out.println(nome + " está com Índice de Massa Corporal " + imc + "(Obesidade).");
        }
    }

}
