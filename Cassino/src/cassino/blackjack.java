package cassino;

import java.util.Random;
import java.util.Scanner;
import static Cassino.coresCassino.cor;
import static Cassino.coresCassino.fundo;
import static Cassino.coresCassino.limpaTela;
import static Cassino.coresCassino.negrito;
import static Cassino.coresCassino.reset;

public class blackjack {
    
    static Random rnd = new Random();

    public static void blackJack() {

        
        Scanner read = new Scanner(System.in);

        double aposta = 0;
        boolean continuar = true;
        boolean try3 = true;
        boolean try4 = true;

        System.out.println("======================= BLACKJACK! =======================\n");

        int[] baralho = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int soma = 0, somaBanca = 0;
        double ganhou;

        System.out.println("OK! Vamos começar!\n");

        while (continuar) {
            while (try3) {
                try {
                    System.out.println("Quanto você gostaria de apostar?");
                    aposta = Double.parseDouble(read.nextLine());

                    if (aposta > Cassino.total) {
                        System.err.println("*** Você não possui dinheiro suficiente! ***");
                        System.out.println("");
                    } else {
                        try3 = false;
                    }

                } catch (NumberFormatException ex) {
                    System.err.println("*** Entrada inválida!! ***");
                    System.out.println("");
                }
            }
            Cassino.total -= aposta;
            System.out.println("Saldo: " + Cassino.total);
            ganhou = aposta * 2;
            
            

            int carta1 = geraCarta(baralho);
            int carta2 = geraCarta(baralho);

            System.out.println("===============================");
            System.out.println("Você recebeu duas cartas! ");
            imprimirCartas(carta1);
            imprimirCartas(carta2);
            System.out.println(carta1 + " e " + carta2);
            if (carta1 == 1) {
                System.out.println("Você tirou um Às! Quer que ele valha 1 ou 11?");
                int as = Integer.parseInt(read.nextLine());
                if (as == 1) {
                    carta1 = 1;
                } else if (as == 11) {
                    carta1 = 11;
                }
            } else if (carta2 == 1) {
                System.out.println("Você tirou um Às! Quer que ele valha 1 ou 11?");
                int as = Integer.parseInt(read.nextLine());
                if (as == 1) {
                    carta2 = 1;
                } else if (as == 11) {
                    carta2 = 11;
                }
            }
            soma = carta1 + carta2;
            System.out.println("===============================");
            System.out.println("Totalizando: " + soma);
            if (soma == 21) {
                            System.out.println("Parabéns!!! Você conseguiu 21 e ganhou $" + ganhou + "!");
                            Cassino.total += aposta * 2;
                            System.out.println("Saldo: " + Cassino.total);
            }
            
            while (soma < 21) {
                try {
                    System.out.println("Gostaria de pegar mais uma carta? 1-Sim / 2-Não");
                    int comprarCarta = Integer.parseInt(read.nextLine());
                    System.out.println("================================================");

                    if (comprarCarta == 1) {
                        int novaCarta = (geraCarta(baralho));
                        System.out.println("Nova carta: " + novaCarta);
                        if (novaCarta == 1) {
                            System.out.println("Você tirou um Às! Quer que ele valha 1 ou 11?");
                            int as = Integer.parseInt(read.nextLine());
                            if (as == 1) {
                                novaCarta = 1;
                            } else if (as == 11) {
                                novaCarta = 11;
                            }
                        } 
                        soma += novaCarta;
                        System.out.println("Totalizando: " + soma);
                        if (soma == 21) {
                            System.out.println("Parabéns!!! Você conseguiu 21 e ganhou $" + ganhou + "!");
                            Cassino.total += aposta * 2;
                            System.out.println("Saldo: " + Cassino.total);
                        } else if (soma > 21) {
                            //System.out.println("Totalizando: " + soma);
                            System.out.println("Explodiu! Tente novamente!");
                            System.out.println("Saldo: " + Cassino.total);
                        }
                    } else if (comprarCarta == 2) {
                        System.out.println("Vez da banca!");
                        System.out.println("- Pressione enter -");
                        read.nextLine();
                        int carta1Banca = geraCarta(baralho);
                        int carta2Banca = geraCarta(baralho);
                        somaBanca = carta1Banca + carta2Banca;
                        System.out.println("Cartas da banca totalizaram: " + somaBanca);

                        while (somaBanca < 16 || (somaBanca <= soma && somaBanca < 21)) {
                            int novaCartaBanca = geraCarta(baralho);
                            System.out.println("Nova carta da banca: " + novaCartaBanca);
                            somaBanca += novaCartaBanca;
                            System.out.println("Totalizando: " + somaBanca);
                            System.out.println("====================================");
                            if (somaBanca == 21) {
                                System.out.println("Banca conseguiu 21! Você perdeu, tente novamente!");
                                //System.out.println("Saldo: " + total);
                                break;
                            }
                        }

                        if (somaBanca > 21) {
                            System.out.println("Banca explodiu! Você ganhou $" + ganhou + "!");
                            Cassino.total += aposta * 2;
                            System.out.println("Saldo: " + Cassino.total);
                            break;
                        }

                        if (soma >= somaBanca) {
                            System.out.println("Parabéns! Você ganhou $" + ganhou);
                            Cassino.total += aposta * 2;
                            System.out.println("Saldo: " + Cassino.total);
                            break;
                        } else if (somaBanca > soma && somaBanca <= 21) {
                            System.out.println("Você perdeu! Tente novamente!");
                            System.out.println("Saldo: " + Cassino.total);
                            break;
                        }

                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Digite um valor válido!");
                }

            }

            if (Cassino.total <= 0) {
                System.out.println("*** Seu dinheiro acabou! Game over! *** ");
                //gameOver = true;
                System.exit(0);
            }

            try4 = true;

            System.out.println("===============================================================");
            while (try4) {
                try {
                    System.out.println("Gostaria de jogar BlackJack (1) novamente ou quer jogar outro jogo ou sair (2)?");
                    int escolherJogo = Integer.parseInt(read.nextLine());

                    try3 = true;

                    if (escolherJogo == 2) {
                        try4 = false;
                        continuar = false;
                    } else if (escolherJogo == 1) {
                        continuar = true;
                        try4 = false;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Digite um valor válido!");

                }
            }

        }

    }
    
    static int geraCarta(int [] baralho){
        int carta = (baralho[rnd.nextInt(baralho.length)]);
        return carta;
    }
    
    static void imprimirCartas (int a){
        switch (a){
            case 1:
                System.out.println(" ----------");
                System.out.println("| A        |");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println("|    ÀS    |");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println("|        A |");
                System.out.println(" ----------");
                break;
            case 2: 
                System.out.println(" ----------");
                System.out.println("| 2        |");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println("|   DOIS   |");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println("|        2 |");
                System.out.println(" ----------");
                break;
        }
}

}

