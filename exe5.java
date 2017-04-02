
package lista1;

import java.util.Scanner;


public class exe5 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //declaracao das variaveis
        int l,area;
        
        //inservao de dados pelo usuario
        System.out.println("Digite o valor de um dos lados do quadrado: ");
        l = read.nextInt();
        
        //calculo da area, lado*lado
        area = l*l;
        
        //impressao dos resultados
        System.out.println("A área do quadrado é de: "+area+" m².");
    }
    
}
