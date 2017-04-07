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
                System.out.printf("A soma entre %.2f e %.2f é: %.2f",num1,num2,soma);
                break;
            case "-":
                subtracao = num1 - num2;
                System.out.printf("A subtração entre %.2f e %.2f é: %.2f",num1,num2,subtracao);
                break;
            case "*":
                multiplicacao = num1 * num2;
                System.out.printf("A multiplicação entre %.2f e %.2f é: %.2f",num1,num2,multiplicacao);
                break;
            case "/":
                divisao = num1 / num2;
                System.out.printf("A divisão entre %.2f e %.2f é: %.2f",num1,num2,divisao);
                break;
            default:
                System.out.println("Operação inválida.");
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
