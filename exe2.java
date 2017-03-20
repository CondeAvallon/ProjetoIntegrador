
package lista1;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        //declaracao das variaveis
        double number1, number2, result;
        
        //insercao dos dados pelo usuario
        System.out.println("Digite um número: ");
        number1 = read.nextFloat();
        System.out.println("Digite um expoente: ");
        number2 = read.nextFloat();
        
        //calculo da exponenciacao
        result = Math.pow (number1,number2);
        
        //impressao do calculo
        System.out.println("O resultado do cálculo é: ");
        System.out.println(result);
        
    }
    
    
}
