package lista3;

import java.util.Scanner;

public class exe20 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== TRANSAÇÕES BANCÁRIAS ===\n");

        int i = 0, operacao;
        double saldo, valor;

        System.out.println("Digite o seu saldo: ");
        saldo = Double.parseDouble(read.nextLine());

        double total = saldo;

        do {
            System.out.println("Digite o número da operação desejada: 1 - Depósito / 2 - Saque / 3 - Sair: ");
            operacao = Integer.parseInt(read.nextLine());
            if (operacao == 3) {
                break;
            } else if (operacao != 1 && operacao != 2 && operacao != 3){
                System.err.println("Operação inválida!");
                break;
            }

            System.out.println("Digite o valor desejado para a operação: ");
            valor = Double.parseDouble(read.nextLine());

            switch (operacao) {
                case 1:
                    total += + valor;
                    break;
                case 2:
                    total += - valor;
                    break;

            }

            i++;
        } while (operacao == 1 || operacao == 2);

        System.out.println("");
        System.out.println("Programa encerrado.");
        System.out.printf("Saldo atual: %.2f\n",total);
        if (total > 0) {
            System.out.println("CONTA PREFERENCIAL.");
        } else if (total < 0) {
            System.err.println("CONTA ESTOURADA.");
        } else {
            System.err.println("CONTA ZERADA.");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
