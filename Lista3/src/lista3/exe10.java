package lista3;

public class exe10 {
    
    public static void main(String[] args) {
        
        System.out.println("=== SOMA DAS FRAÇÕES ===\n");
        
        //entrada
        double soma = 1;
        
        //processamento
        for (double i = 2;i <= 20;i++){
            
            soma = soma + (1 / i);
        }
        
        //saída
        System.out.println("A soma das frações é : " + soma);
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
