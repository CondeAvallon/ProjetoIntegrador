
package trianguloretangulo1;

import java.util.Scanner;


public class TrianguloRetangulo1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double cateto1, cateto2, hipotenusa;

        System.out.println("=== PROGRAMA PARA CÁLCULO DA HIPOTENUSA ===");
        System.out.println("");
        System.out.println("Digite o valor de um dos catetos: ");
        cateto1 = read.nextDouble();
        System.out.println("Digite o valor do outro cateto: ");
        cateto2 = read.nextDouble();

        hipotenusa = Math.hypot(cateto1, cateto2);

        System.out.println("O valor da hipotenusa deste triângulo retângulo é: " + hipotenusa);
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
