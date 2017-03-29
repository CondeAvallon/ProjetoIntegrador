
package lista1;

import java.util.Scanner;


public class exe4 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //declaracao de variaveis
        int number1, number2;

        //insercao de dados pelo usuario
        System.out.println("Digite um número: ");
        number1 = read.nextInt();
        System.out.println("Digite um outro número: ");
        number2 = read.nextInt();

        //variavel +1 (consecutivos)
        number1 = number1 + 1;
        number2 = number2 + 1;

        //impressao dos resultados
        System.out.println("Os números consecutivos são: " + number1 + "," + number2);
        
    
    }
    
}
