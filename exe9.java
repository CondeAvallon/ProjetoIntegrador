
package lista1;

import java.util.Scanner;

public class exe9 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        String cadastro;
        float horas,valor,salario;
      
        
        System.out.println("Digite o número do cadastro do funcionário: ");
        cadastro = read.next();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = read.nextFloat();
        System.out.println("Digite o valor que o funcionário recebe por hora trabalhada: ");
        valor = read.nextFloat();
             
        salario = valor*horas;
        
        System.out.println("O funcionário "+cadastro+" receberá o salário de "+salario+" este mês.");
                
        }
        
        
    }
    

