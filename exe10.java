
package lista1;

import java.util.Scanner;

public class exe10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //declaracao das variaveis
        String vendedor;
        double salario, vendas, comissao, total;

        //insercao dos dados pelo usuario: vendedor,salario e vendas
        System.out.println("Digite o nome do vendedor: ");
        vendedor = read.next();
        System.out.println("Digite o salário fixo do vendedor: ");
        salario = read.nextFloat();
        System.out.println("Digite o total de vendas do vendedor: ");
        vendas = read.nextFloat();

        //calculo da comissao e do total
        comissao = vendas * (0.15);
        total = salario + comissao;

        //impressao do salario total do vendedor
        System.out.println("O vendedor " + vendedor + " receberá este mês o total de: " + total);
        
        
        
        
    }
    
}
