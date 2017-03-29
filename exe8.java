
package lista1;

import java.util.Scanner;


public class exe8 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //declaracao das variaveis
        float num1,num2,num3,num4,soma,mediaArit;
        
        //insercao dos dados pelo usuario: 4 numeros
        System.out.println("Digite um número:");
        num1 = read.nextFloat();
        System.out.println("Digite um segundo número: ");
        num2 = read.nextFloat();
        System.out.println("Digite um terceiro número: ");
        num3 = read.nextFloat();
        System.out.println("Digite um quarto número: ");
        num4 = read.nextFloat();
        
        //calculo da soma dos numeros e da media aritmetica
        soma = num1+num2+num3+num4;
        mediaArit = soma/4;
        
        //impressao do resultado da media aritmetica
        System.out.println("A Média Aritmética dos números é: "+mediaArit);
        
    }
    
}
