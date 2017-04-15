package lista3;

public class exe8 {

    public static void main(String[] args) {

        System.out.println("=== MÉDIA ARITMÉTICA ===\n");

        //entradas
        int resto, soma = 0, qtd = 0, media;

        //processamento
        for (int i = 13; i < 73; i++) {

            resto = i % 2;
            if (resto == 0) {
                System.out.println(i);
                soma += i;
                qtd += 1;
            }
        }
        media = soma / qtd;

        //saidas
        System.out.println("");
        System.out.println("Soma: " + soma);
        System.out.println("Qtd de termos: " + qtd);
        System.out.println("Média Aritmética: " + media);
        System.out.println("");
        System.out.println("=== FIM ===");

    }

}
