package lista3;

import java.util.Scanner;

public class exe6 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== TURMA DO BARULHO ===\n");

        int i = 1, maior = 0, idade;
        String nome, sexo, nomemaior = null, sexomaior = null;

        do {
            System.out.println("Digite o nome do aluno " + i);
            nome = read.nextLine();

            System.out.println("Digite a idade do aluno " + i);
            idade = Integer.parseInt(read.nextLine());

            System.out.println("Digite o sexo do aluno " + i);
            sexo = read.nextLine();

            System.out.println("=============================");

            i++;

            if (idade > maior) {
                maior = idade;
                nomemaior = nome;
                sexomaior = sexo;
            }
        } while (i <= 5);

        System.out.println(nomemaior.toUpperCase() + ", do sexo " + sexomaior + ", é o(a) aluno(a) mais velho(a), com " + maior + " anos.");

    }

}
