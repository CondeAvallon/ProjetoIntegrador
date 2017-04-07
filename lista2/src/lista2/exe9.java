package lista2;

import java.util.Scanner;

public class exe9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== VERIFICANDO CPF ===\n");

        System.out.println("Digite o seu CPF: ");
        double cpf = Double.parseDouble(read.nextLine());

        int calc1 = (int) ((cpf / 100) / 100000000);
        int digito1 = calc1;
        int calc2 = (int) ((cpf / 100) / 10000000);
        int digito2 = (calc2 % (digito1 * 10));
        int calc3 = (int) ((cpf / 100) / 1000000);
        int digito3 = calc3 % (calc2);
        int calc4 = (int) ((cpf / 100) / 100000);
        int digito4 = calc4 % (calc3);
        int calc5 = (int) ((cpf / 100) / 10000);
        int digito5 = calc5 % (calc4);
        int calc6 = (int) ((cpf / 100) / 1000);
        int digito6 = calc6 % (calc5);
        int calc7 = (int) ((cpf / 100) / 100);
        int digito7 = calc7 % (calc6);
        int calc8 = (int) ((cpf / 100) / 10);
        int digito8 = calc8 % (calc7);
        int calc9 = (int) ((cpf / 100));
        int digito9 = calc9 % (calc8);
        long calc10 = (long) (cpf / 10);
        long digito10 = (long) calc10 % (calc9);
        long calc11 = (long) cpf;
        long digito11 = (long) calc11 % calc10;

        int mult1 = digito1 * 10;
        int mult2 = digito2 * 9;
        int mult3 = digito3 * 8;
        int mult4 = digito4 * 7;
        int mult5 = digito5 * 6;
        int mult6 = digito6 * 5;
        int mult7 = digito7 * 4;
        int mult8 = digito8 * 3;
        int mult9 = digito9 * 2;

        int soma = (mult1 + mult2 + mult3 + mult4 + mult5 + mult6 + mult7 + mult8 + mult9);
        int resto = soma % 11;
        int resultado = 11 - resto;

        System.out.println("");

        switch (resultado) {
            default:
                if (resultado < 10) {
                    if (resultado == digito10) {
                        System.out.println("Passo 1 completo.");
                    } else {
                        System.out.println("CPF inválido!");
                    }
                } else if (resultado >= 10) {
                    if (digito10 == 0) {
                        System.out.println("Passo 1 completo.");
                    } else {
                        System.out.println("CPF inválido!");
                    }
                }
                break;
        }

        int segundaMult = digito1 * 11;
        int segundaMult2 = digito2 * 10;
        int segundaMult3 = digito3 * 9;
        int segundaMult4 = digito4 * 8;
        int segundaMult5 = digito5 * 7;
        int segundaMult6 = digito6 * 6;
        int segundaMult7 = digito7 * 5;
        int segundaMult8 = digito8 * 4;
        int segundaMult9 = digito9 * 3;
        int segundaMult10 = (int) digito10 * 2;

        int soma2 = segundaMult + segundaMult2 + segundaMult3 + segundaMult4 + segundaMult5 + segundaMult6 + segundaMult7 + segundaMult8 + segundaMult9 + segundaMult10;
        int resto2 = soma2 % 11;
        int resultado2 = 11 - resto2;

        switch (resultado2) {
            default:
                if (resultado2 < 10) {
                    if (resultado2 == digito11) {
                        System.out.println("Passo 2 completo. \nCPF válido!");
                    }
                } else if (resultado2 >= 10) {
                    if (digito11 == 0) {
                        System.out.println("Passo 2 completo. \nCPF válido!");
                    } else {
                        System.out.println("Passo 2 incompleto. CPF inválido!");
                    }

                }

        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
