package cassino;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class s {

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
                System.out.println("==============================================================");
                System.out.println("Qual jogo gostaria de jogar? 1-BlackJack / 2-Roleta / 3-Sair");
                jogo = Integer.parseInt(read.nextLine());

                switch (jogo) {
                    case 1:
                        blackJack();
                        break;
                    case 2:
                        roleta();
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
        double recompensa;

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
            recompensa = aposta * 2;

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
                            System.out.println("Parabéns!!! Você conseguiu 21 e ganhou $" + recompensa + "!");
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
                            System.out.println("Banca explodiu! Você ganhou $" + recompensa);
                            total += aposta * 2;
                            System.out.println("Saldo: " + total);
                            break;
                        }

                        if (soma >= somaBanca) {
                            System.out.println("Parabéns! Você ganhou $" + recompensa);
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

    public static void roleta() {

        Random rnd = new Random();
        Scanner read = new Scanner(System.in);

        String[][] roleta = new String[13][3];
        int x = 0, interna, resultado = 0;
        double aposta = 0, recompensa = 0;
        boolean continuar = true;
        boolean ganhou = false;
        int [] jogadaDireta = new int[10];
        int [] jogadaSplit = new int[10];
        int [] jogadaStreet = new int[10];
        int [] jogadaCorner = new int[10];

        System.out.println("=== ROLETA! ===\n");

        
        System.out.println("        Interna   ");
        for (int linha = 1; linha < 13; linha++) {
            if (linha == 0 || linha == 1 || linha == 2 || linha == 3 || linha == 4 || linha == 5 || linha == 6 || linha == 7 || linha == 8 || linha == 9) {
                System.out.print(" " + (linha) + " - ");
            } else {
                System.out.print(linha + " - ");
            }
            for (int coluna = 0; coluna < 3; coluna++) {
                x++;
                if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6 || x == 7 || x == 8) {
                    roleta[linha][coluna] = "  " + x + " ";
                } else {
                    roleta[linha][coluna] = "  " + x;
                }
                System.out.print(roleta[linha][coluna]);
                if (x == 12 || x == 24) {
                    System.out.println("");
                    System.out.print("       ----------");
                } else if (x == 18) {
                    System.out.println("");
                    System.out.print("       ----------");
                }
            }
            System.out.println("");

        }
        System.out.println("");
        System.out.println("Externa: Pares, Impares, Preto, Vermelho, 1ª dúzia, 2ª dúzia, 3ª dúzia, 1ª metade, 2ª metade");
        System.out.println("");
        
        int i = 0;
        int z = 0;
        int y = 0;
        int m = 0;

        while (continuar){
        System.out.println("Quanto quer apostar?");
        aposta = Double.parseDouble(read.nextLine());

        total = total - aposta;

        System.out.println("Você gostaria de apostar na parte 1-Interna ou 2-Externa?");
        int parte = Integer.parseInt(read.nextLine());

        resultado = rnd.nextInt(36) + 1;
        
        if (parte == 1) {
            System.out.println("=======================================");
            System.out.println("Qual tipo de aposta gostaria de fazer?");
            System.out.println("");
            System.out.println("1 - *Direta* 1 número (35:1)\n2 - *Split* 2 números (17:1)\n3 - *Sreet* 3 números (11:1)\n4 - *Corner* 4 números (8:1)\n5 - *Six Line* (5:1)");
            interna = Integer.parseInt(read.nextLine());
            switch (interna) {
                case 1:
                    System.out.println("Em qual número você quer apostar?");
                    jogadaDireta[i] = Integer.parseInt(read.nextLine());
                    System.out.println(Arrays.toString(jogadaDireta));
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Em quais números você quer apostar?");
                    jogadaSplit[y] = Integer.parseInt(read.nextLine());
                    System.out.println("e");
                    y++;
                    jogadaSplit[y] = Integer.parseInt(read.nextLine());
                    System.out.println("");
                    if (jogadaSplit[y-1] + 1 != jogadaSplit[y] && jogadaSplit[y] + 3 != jogadaSplit[y+1]){
                        System.out.println("Jogada inválida!");
                    }
                    System.out.println(Arrays.toString(jogadaSplit));
                    y++;
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Em quais números você quer apostar?");
                    jogadaStreet[z] = Integer.parseInt(read.nextLine());
                    System.out.println("e");
                    z++;
                    jogadaStreet[z] = Integer.parseInt(read.nextLine());
                    System.out.println("e");
                    z++;
                    jogadaStreet[z] = Integer.parseInt(read.nextLine());
                    if (jogadaStreet[z-2] + 1 != jogadaStreet[z-1] && jogadaStreet[z-1] + 1 != jogadaStreet[z]){
                        System.out.println("Jogada Inválida!");
                    }
                    System.out.println(Arrays.toString(jogadaStreet));
                    z++;
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Em quais números você quer apostar?");
                    jogadaCorner[m] = Integer.parseInt(read.nextLine());
                    System.out.println("e");
                    m++;
                    jogadaCorner[m] = Integer.parseInt(read.nextLine());
                    System.out.println("e");
                    m++;
                    jogadaCorner[m] = Integer.parseInt(read.nextLine());
                    System.out.println("e");
                    m++;
                    jogadaCorner[m] = Integer.parseInt(read.nextLine());
                    if (jogadaCorner[m-3] + 1 != jogadaCorner[m-2] && jogadaCorner[m-2] + 2 != jogadaCorner[m-1] && jogadaCorner[m-1] + 1 != jogadaCorner[m]){
                        System.out.println("Jogada inválida!");
                    }
                    System.out.println(Arrays.toString(jogadaCorner));
                    m++;
                    break;
                    
            }
            
        }
            i++;
            System.out.println("Gostaria de continuar apostando? 1-Sim / 2-Não");
            int sair = Integer.parseInt(read.nextLine());
            if (sair == 2){
                continuar = false;
            }
            
        }
        System.out.println("=======================");
        System.out.println("A roleta está girando!");
        System.out.println("=======================");
        read.nextLine();
        System.out.println("O resultado foi " + resultado + "!");
        for (i = 0; i < jogadaDireta.length; i++){
            if (jogadaDireta[i] == resultado){
                recompensa = aposta * 35;
                System.out.println("Parabéns (direta)! Você ganhou $" + recompensa + "!");
            } else if (jogadaSplit[i] == resultado){
                System.out.println("Parabéns! (split)");
                recompensa = aposta * 17;
            } else if (jogadaStreet[i] == resultado){
                System.out.println("Parabéns! (street)");
                recompensa = aposta * 11;
            } else if (jogadaCorner[i] == resultado){
                System.out.println("Parabén! (corner)");
                recompensa = aposta * 8;
            } 
            
        } 
        if (recompensa == 0){
                System.out.println("Não acertou! Tente novamente!");
            }
    }

}