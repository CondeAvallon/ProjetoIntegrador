package lista2;

import java.util.Scanner;

public class exe10 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        double num1,num2,soma,subtracao,multiplicacao,divisao;
        String operacao;
        
        System.out.println("=== CALCULADORA! ===\n");
        
        System.out.println("Digite um número: ");
        num1 = Double.parseDouble(read.nextLine());
        System.out.println("Digite outro número: ");
        num2 = Double.parseDouble(read.nextLine());
        System.out.println("Escolha uma operação (+, -, * ou /): ");
        operacao = read.nextLine();
        
        switch (operacao){
            case "+":
                soma = num1 + num2;
                System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);
                break;
            case "-":
                subtracao = num1 - num2;
                System.out.println("A subtração entre " + num1 + " e " + num2 + " é: " + subtracao);
                break;
            case "*":
                multiplicacao = num1 * num2;
                System.out.println("A multiplicação entre " + num1 + " e " + num2 + " é: " + multiplicacao);
                break;
            case "/":
                divisao = num1 / num2;
                System.out.println("A divisão entre " + num1 + " e " + num2 + " é: " + divisao);
                break;
                
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
