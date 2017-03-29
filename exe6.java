
package lista1;

import java.util.Scanner;


public class exe6 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        double a,b,c,areatri,areacirc,areatrap,areaquad,arearet,periret;
        
        System.out.println("Digite um número decimal A: ");
        a = read.nextDouble();
        System.out.println("Digite um número decimal B: ");
        b = read.nextDouble();
        System.out.println("Digite um número decimal C: ");
        c = read.nextDouble();
        
        areatri = (a*c)/2;
        System.out.println("A área do triângulo retângulo é: "+areatri);
        
        areacirc = (3.14159*(c*c));
        System.out.println("A área do círculo é: "+areacirc);
        
        areatrap = (c*(a+b))/2;
        System.out.println("A área do trapézio é: "+areatrap);
        
        areaquad = b*b;
        System.out.println("A área do quadrado é: "+areaquad);
        
        arearet = a*b;
        System.out.println("A área do retângulo é: "+arearet);
        
        periret = 2*(a+b);
        System.out.println("O perimetro do retângulo é: "+periret);
        
        
    }
    
}
