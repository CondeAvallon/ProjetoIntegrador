
package lista1;

import java.util.Scanner;


public class exe3 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //declaracao das variaveis
        double number1,number2,sqr1,sqr2,result;
    
        //insercao dos dados pelo usuario
        System.out.println("Digite um número: ");
        number1 = read.nextFloat();
        //variavel lida ao quadrado
        sqr1 = Math.sqrt (number1);
        System.out.println("Ao quadrado: "+sqr1);
        System.out.println("Digite um outro número: ");
        number2 = read.nextFloat();
        sqr2 = Math.sqrt (number2);
        System.out.println("Ao quadrado: "+sqr2);
        
        //soma dos quadrados das variaveis
        result = sqr1+sqr2;
        
        //impressao do resultado
        System.out.println("A soma dos quadrados é: "+result);
        
    }
    
}
