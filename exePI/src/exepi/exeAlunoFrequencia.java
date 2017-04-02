package exepi;

import java.util.Scanner;

public class exeAlunoFrequencia {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE MÉDIA DO ALUNO ===");
        System.out.println("");

        System.out.println("Nota da primeira prova: ");
        double p1 = Double.parseDouble(read.nextLine());
        System.out.println("Nota da segunda prova: ");
        double p2 = Double.parseDouble(read.nextLine());
        System.out.println("Digite quantas aulas o aluno participou: ");
        double aulas = Double.parseDouble(read.nextLine());
        //totalAulas = 20;
        double frequenciaAprov = 20 * 0.75; //15

        System.out.println("");

        double media1 = (p1 + p2) / 2;
        System.out.println("A média de notas do aluno é: " + media1);
        System.out.println("");

        boolean passou = (media1 >= 6.0);
        if (passou) {
            if ((aulas >= 15) && (aulas >= 6.0)) {
                System.out.println("Aluno aprovado por notas e frequência!");
            }
        } else {
            System.out.println("Média insuficiente. Faça a prova substitutiva!");
            System.out.println("");
            System.out.println("=== Após a prova substitutiva ===");
            System.out.println("");
            System.out.println("Digite a nota da terceira prova: ");
            double p3 = Double.parseDouble(read.nextLine());
            double notamin = Math.min(p1, p2);
            if (notamin == p1) {
                double media2 = ((p2 + p3) / 2);
                if (media2 > 6.0) {
                    System.out.println("A nova média do aluno é: 6.0!");
                    if (aulas >= 15) {
                        System.out.println("Aluno aprovado por notas e frequência!");
                    }

                } else {
                    System.out.println("A nova média do aluno é: " + media2 + "!");
                    System.out.println("Média insuficiente!");
                }
            } else if (notamin == p2) {
                double media2 = ((p1 + p3) / 2);
                if (media2 > 6.0) {
                    System.out.println("A nova média do aluno é: 6.0!");
                    if (aulas >= 15){
                    System.out.println("Aluno aprovado por notas e frequência!");
                    }
                } else {
                    System.out.println("A nova média do aluno é: " + media2 + "!");
                    System.out.println("Média insuficiente!");
                }
            }

        } 
        if (aulas < 15){
                System.out.println("Frequência insuficiente. Aluno reprovado!");
        }
        
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
