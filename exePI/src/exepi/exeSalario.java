package exepi;

import java.util.Scanner;

public class exeSalario {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String nome;
        int horas;
        double valor, salario;

        System.out.println("=== PROGRAMA DE CÁLCULO DE SALÁRIO ===");
        System.out.println("");
        System.out.println("Digite o nome do funcionário: ");
        nome = read.next();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = read.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        valor = read.nextDouble();

        salario = horas * valor;

        System.out.println("O funcionário " + nome + " trabalhou " + horas + " horas por R$ " + valor
                + " a hora e deve receber R$ " + salario + ".");
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
