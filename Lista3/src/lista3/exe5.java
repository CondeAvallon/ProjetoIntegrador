package lista3;

public class exe5 {
    
    public static void main(String[] args) {
        
        System.out.println("=== DE 100 A 1 ===\n");
        
        for (int i = 100;i > 0;i--){
            
            int resto = i % 2;
            if (resto == 0){
                System.out.println(i);
            }
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }
    
}
