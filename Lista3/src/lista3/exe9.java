package lista3;

import java.util.Scanner;

public class exe9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== MÉDIA DA SALA ===\n");

        //entradas
        int i = 0, qtd, soma = 0, media;

        System.out.println("Digite a quantidade de alunos na sala: ");
        qtd = Integer.parseInt(read.nextLine());
        System.out.println("=========================================");

        //processamento
        while (i < qtd) {
            i++;
            System.out.println("Digite a nota do aluno " + i);
            int nota = Integer.parseInt(read.nextLine());

            soma += nota;
        }

        media = soma / qtd;

        //saída
        System.out.println("");
        System.out.println("Media da Sala: " + media);
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
