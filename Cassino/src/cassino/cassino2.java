package cassino;

import java.util.Random;
import java.util.Scanner;

public class cassino2 {
    
    //public static double dinheiro;
    public static double total;
    

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        
        int jogo;
        boolean sair = true;

        System.out.println("=== SEJA BEM-VINDO AO CASSINO SENAC! ===\n");

        
        System.out.println("Digite a quantidade de dinheiro disponível (mínimo $ 100)");
        total = Double.parseDouble(read.nextLine());

        while (sair) {
            System.out.println("Qual jogo gostaria de jogar? 1-BlackJack / 2-Caça Níquel / 3-Sair");
            jogo = Integer.parseInt(read.nextLine());

            switch (jogo){
                case 1:
                    blackJack();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Obrigado por ter visitado o CASSINO SENAC!");
                System.out.println("Saldo total: " + total);
                sair = false;
                
                    
            }
            
            
        }

    }

    public static void blackJack() {

        Random rnd = new Random();
        Scanner read = new Scanner(System.in);

        double aposta;
        boolean continuar = true;

        System.out.println("=== BLACKJACK! ===\n");

        int[] cartas = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int soma = 0, somaBanca = 0;
        double ganhou;

        System.out.println("OK! Vamos começar!");

        while (continuar) {
            System.out.println("Quanto você gostaria de apostar?");
            aposta = Double.parseDouble(read.nextLine());
            total -= aposta;

            ganhou = aposta * 2;

            int carta1 = (cartas[rnd.nextInt(cartas.length)]);
            int carta2 = (cartas[rnd.nextInt(cartas.length)]);

            System.out.println("Você recebeu duas cartas! ");
            System.out.println(carta1 + " e " + carta2);
            soma = carta1 + carta2;
            System.out.println("Totalizando: " + soma);

            while (soma < 21) {
                System.out.println("Gostaria de pegar mais uma carta? 1-Sim / 2-Não");
                int comprarCarta = Integer.parseInt(read.nextLine());

                if (comprarCarta == 1) {
                    int novaCarta = (cartas[rnd.nextInt(cartas.length)]);
                    System.out.println("Nova carta: " + novaCarta);
                    soma += novaCarta;
                    System.out.println("Totalizando: " + soma);
                    if (soma == 21) {
                        System.out.println("Parabéns!!! Você conseguiu 21 e ganhou $" + ganhou + "!");
                        total += aposta * 2;
                    } else if (soma > 21) {
                        //System.out.println("Totalizando: " + soma);
                        System.out.println("Explodiu! Tente novamente!");
                    }
                } else if (comprarCarta == 2) {
                    System.out.println("Vez da banca!");
                    int carta1Banca = (cartas[rnd.nextInt(cartas.length)]);
                    int carta2Banca = (cartas[rnd.nextInt(cartas.length)]);
                    somaBanca = carta1Banca + carta2Banca;
                    System.out.println("Cartas da banca totalizaram: " + somaBanca);


                    while (somaBanca < 16) {
                        int novaCartaBanca = (cartas[rnd.nextInt(cartas.length)]);
                        System.out.println("Nova carta da banca: " + novaCartaBanca);
                        somaBanca += novaCartaBanca;
                        System.out.println("Totalizando: " + somaBanca);
                        if (somaBanca == 21) {
                            System.out.println("Banca conseguiu 21! Você perdeu, tente novamente!");
                            break;
                        }
                    }

                    if (somaBanca > 21) {
                        System.out.println("Banca explodiu! Você ganhou $" + ganhou);
                        break;
                    }

                    if (soma >= somaBanca) {
                        System.out.println("Parabéns! Você ganhou $" + ganhou);
                        total += aposta * 2;
                        break;
                    } else if (somaBanca > soma && somaBanca <= 21) {
                        System.out.println("Você perdeu! Tente novamente!");
                        break;
                    }

                }

            }

            System.out.println("===============================================================");
            System.out.println("Gostaria de jogar BlackJack (1) novamente ou quer jogar outro jogo ou sair (2)?");
            int escolherJogo = Integer.parseInt(read.nextLine());

            if (escolherJogo == 2) {
                continuar = false;
            }
        }

    }

}