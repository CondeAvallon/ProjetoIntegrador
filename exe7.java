
package lista1;

import java.util.Scanner;


public class exe7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //declaracao das variaveis
        double cateto1, cateto2, sqr1, sqr2, hipotenusa;

        //insercao dos dados pelo usuario: catetos
        System.out.println("Digite o valor de um dos catetos: ");
        cateto1 = read.nextDouble();
        System.out.println("Digite o valor do outro cateto: ");
        cateto2 = read.nextDouble();

        //calculo dos catetos ao quadrado
        sqr1 = Math.pow(cateto1, 2);
        sqr2 = Math.pow(cateto2, 2);

        //calculo da hipotenusa: raiz de sqr1 + sqr2
        hipotenusa = Math.sqrt(sqr1 + sqr2);

        //impressao do valor da hipotenusa
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
        
    }
    
}
