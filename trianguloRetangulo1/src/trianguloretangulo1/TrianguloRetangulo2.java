package trianguloretangulo1;

import java.util.Scanner;


public class TrianguloRetangulo2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //declaracao das variaveis
        double cateto1, cateto2, hipotenusa,perimetro;

        //insercao dos dados pelo usuario: catetos
        System.out.println("=== PROGRAMA PARA CÁLCULO DO PERÍMETRO ===");
        System.out.println("");
        System.out.println("Digite o valor de um dos catetos: ");
        cateto1 = read.nextDouble();
        System.out.println("Digite o valor do outro cateto: ");
        cateto2 = read.nextDouble();

        //calculo da hipotenusa e do perimetro
        hipotenusa = Math.hypot(cateto1,cateto2);
        perimetro = cateto1+cateto2+hipotenusa;
        
        //impressao do valor do perimetro
        System.out.println("O valor do perímetro do triângulo retângulo é: "+perimetro);
        System.out.println("");
        System.out.println("=== FIM ===");
        

    }
}
