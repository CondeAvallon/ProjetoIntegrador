package cassino;

import java.util.Random;
import java.util.Scanner;

public class Cassino {

    //public static double dinheiro;
    public static double total;
    public static boolean gameOver = false;

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int jogo;
        boolean sair = true;
        boolean try1 = true;

        System.out.println("=== SEJA BEM-VINDO AO CASSINO SENAC! ===\n");

        while (try1) {
            try {
                System.out.println("Digite a quantidade de dinheiro disponível (mínimo $ 100)");
                total = Double.parseDouble(read.nextLine());
                try1 = false;
            } catch (NumberFormatException ex) {
                System.out.println("Digite um valor válido!");
            }
        }

        while (sair) {
            try {
                System.out.println("Qual jogo gostaria de jogar? 1-BlackJack / 2-Caça Níquel / 3-Sair");
                jogo = Integer.parseInt(read.nextLine());

                switch (jogo) {
                    case 1:
                        blackJack();
                        break;
                    case 2:
                        break;
                    case 3:
                        System.out.println("Obrigado por ter visitado o CASSINO SENAC!");
                        System.out.println("Saldo Final: " + total);
                        sair = false;
                        break;
                    default:
                        System.out.println("Digite um valor válido!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Digite um valor válido!");
            }

        }

    }

    public static void blackJack() {

        Random rnd = new Random();
        Scanner read = new Scanner(System.in);

        double aposta = 0;
        boolean continuar = true;
        boolean try3 = true;
        boolean try4 = true;

        System.out.println("=== BLACKJACK! ===\n");

        int[] cartas = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int soma = 0, somaBanca = 0;
        double ganhou;

        System.out.println("OK! Vamos começar!");

        while (continuar) {
            while (try3) {
                try {
                    System.out.println("Quanto você gostaria de apostar?");
                    aposta = Double.parseDouble(read.nextLine());

                    if (aposta > total) {
                        System.out.println("*** Você não possui dinheiro suficiente! ***");
                    } else {
                        try3 = false;
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Digite um valor válido!");
                }
            }
            total -= aposta;
            System.out.println("Saldo: " + total);
            ganhou = aposta * 2;

            int carta1 = (cartas[rnd.nextInt(cartas.length)]);
            int carta2 = (cartas[rnd.nextInt(cartas.length)]);
            
            System.out.println("===============================");
            System.out.println("Você recebeu duas cartas! ");
            System.out.println(carta1 + " e " + carta2);
            soma = carta1 + carta2;
            System.out.println("Totalizando: " + soma);
            System.out.println("===============================");

            while (soma < 21) {
                try {
                    System.out.println("Gostaria de pegar mais uma carta? 1-Sim / 2-Não");
                    int comprarCarta = Integer.parseInt(read.nextLine());
                    System.out.println("================================================");

                    if (comprarCarta == 1) {
                        int novaCarta = (cartas[rnd.nextInt(cartas.length)]);
                        System.out.println("Nova carta: " + novaCarta);
                        soma += novaCarta;
                        System.out.println("Totalizando: " + soma);
                        if (soma == 21) {
                            System.out.println("Parabéns!!! Você conseguiu 21 e ganhou $" + ganhou + "!");
                            total += aposta * 2;
                            System.out.println("Saldo: " + total);
                        } else if (soma > 21) {
                            //System.out.println("Totalizando: " + soma);
                            System.out.println("Explodiu! Tente novamente!");
                            System.out.println("Saldo: " + total);
                        }
                    } else if (comprarCarta == 2) {
                        System.out.println("Vez da banca!");
                        int carta1Banca = (cartas[rnd.nextInt(cartas.length)]);
                        int carta2Banca = (cartas[rnd.nextInt(cartas.length)]);
                        somaBanca = carta1Banca + carta2Banca;
                        System.out.println("Cartas da banca totalizaram: " + somaBanca);

                        while (somaBanca < 16 || (somaBanca < soma && somaBanca < 21)) {
                            int novaCartaBanca = (cartas[rnd.nextInt(cartas.length)]);
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
                            System.out.println("Banca explodiu! Você ganhou $" + ganhou);
                            total += aposta * 2;
                            System.out.println("Saldo: " + total);
                            break;
                        }

                        if (soma >= somaBanca) {
                            System.out.println("Parabéns! Você ganhou $" + ganhou);
                            total += aposta * 2;
                            System.out.println("Saldo: " + total);
                            break;
                        } else if (somaBanca > soma && somaBanca <= 21) {
                            System.out.println("Você perdeu! Tente novamente!");
                            System.out.println("Saldo: " + total);
                            break;
                        }

                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Digite um valor válido!");
                }

            }

            if (total <= 0) {
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

}