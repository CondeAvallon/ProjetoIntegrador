
package autonomiacarro;

import java.util.Scanner;


public class autonomiaCarro {

  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        //declaracao das variaveis
        float litros, km, result;
        
        //insercao de dados pelo usuario: litros e kilometros
        System.out.println("Digite quantos litros você abastece: ");
        litros = read.nextFloat();
        System.out.println("Digite quantos kilometros o seu carro faz com esses litros: ");
        km = read.nextFloat();
        
        //calculo das variaveis
        result = km/litros;
        
        //impressao do calculo
        System.out.println("O seu carro está fazendo "+result+"/km por litro.");
    }
    
}
