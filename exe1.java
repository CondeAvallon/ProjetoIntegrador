
package lista1;

import java.util.Scanner;


public class exe1 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        //declaracao das variavaies
        float number1, number2, result;
        
        //insercao dos dados pelo usuario
        System.out.println("Digite um número: ");
        number1 = read.nextFloat();
        System.out.println("Digite um outro número: ");
        number2 = read.nextFloat();
        
        //calculo da multiplicacao
        result = number1*number2;
        
        //impressao do resultado
        System.out.println("O resultado da multiplicação entre eles é: "+result);
        
        
        
    }
    
}
