package exepi;

import java.util.Scanner;

public class exeSalario2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = read.next();
        System.out.println("Digite o nível do funcionário: ");
        int nivel = read.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horas = read.nextInt();

        if (nivel == 1) {
            double salario = 15.00 * horas;
            System.out.println("O funcionário " + nome + " trabalhou " + horas + " horas por R$ 15,00 a hora e deve receber R$ " + salario);
        } else if (nivel == 2) {
            double salario = 18.00 * horas;
            System.out.println("O funcionário " + nome + " trabalhou " + horas + " horas por R$ 18,00 a hora e deve receber R$ " + salario);
        } else if (nivel == 3) {
            double salario = 22.00 * horas;
            System.out.println("O funcionário " + nome + " trabalhou " + horas + " horas por R$ 22,00 a hora e deve receber R$ " + salario);
        } else if (nivel == 4) {
            double salario = 27.00 * horas;
            System.out.println("O funcionário " + nome + " trabalhou " + horas + " horas por R$ 27,00 a hora e deve receber R$ " + salario);
        } else if (nivel == 5) {
            double salario = 33.00 * horas;
            System.out.println("O funcionário " + nome + " trabalhou " + horas + " horas por R$ 33,00 a hora e deve receber R$ " + salario);
        }
    }

}
