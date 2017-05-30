package cassino;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Roleta {

    static Scanner input = new Scanner(System.in);

    public static void roleta() {

        Random rnd = new Random();

        int[] jogadaDireta = new int[37];
        int[] jogadaSplit = new int[37];
        int[] jogadaStreet = new int[37];
        int[] jogadaCorner = new int[37];
        int[] jogadaSixLine = new int[37];
        boolean continuarJogo = true;
        boolean continuar = true;
        int[] valor = new int[37];
        int tipo = 0;
        int x = 0;
        int direta = 0;
        int split = 0;
        int street = 0;
        int corner = 0;
        int sixLine = 0;
        boolean try1 = true;
        boolean try2 = true;

        int roleta = 21;
        int[] recompensa = new int[10];
        int[] premio = new int[10];

        while (continuarJogo) {
            while (continuar) {
                while (try1) {
                    try {
                        System.out.println("");
                        System.out.println("=======================");
                        System.out.println("Quanto deseja apostar?");
                        valor[x] = Integer.parseInt(input.nextLine());
                        if (valor[x] > Cassino.total){
                            System.err.println("*** Você não possui saldo suficiente! ***");
                            try1 = true;
                        } else {
                        Cassino.total -= valor[x];
                        System.out.println("Saldo: $" + Cassino.total);
                        try1 = false;
                        }
                    } catch (NumberFormatException ex) {
                        System.err.println("*** Entrada inválida! ***");
                    }
                }
                try1 = true;
                while (try2) {
                    try {
                        System.out.println("=======================");
                        System.out.println("Qual tipo de aposta:\n");
                        System.out.println("1 - Direta (1 número)");
                        System.out.println("2 - Split (2 números)");
                        System.out.println("3 - Street (3 números)");
                        System.out.println("4 - Corner (4 números)");
                        System.out.println("5 - SixLine (6 números)\n");
                        tipo = Integer.parseInt(input.nextLine());
                        if (tipo >= 1 && tipo <= 5) {
                            try2 = false;
                        } else {
                            System.err.println("*** Digite um número válido! ***");
                        }
                    } catch (NumberFormatException ex) {
                        System.err.println("*** Entrada inválida! ***");
                    }
                }
                try2 = true;
                System.out.println("");

                switch (tipo) {
                    case 1:
                        verificaAposta (jogadaDireta,recompensa,valor,direta,roleta,x,1,1,0);
                        direta++;
                        break;
                    case 2:
                        verificaAposta(jogadaSplit,recompensa,valor,split,roleta,x,2,2,1);
                        split = split + 2;
                        break;
                    case 3:
                        verificaAposta (jogadaStreet,recompensa,valor,street,roleta,x,3,3,2);
                        street = street + 3;
                        break;
                    case 4:
                        verificaAposta (jogadaCorner,recompensa,valor,corner,roleta,x,4,4,3);
                        corner = corner + 4;
                        break;
                    case 5:
                        verificaAposta (jogadaSixLine,recompensa,valor,sixLine,roleta,x,5,6,5);
                        sixLine = sixLine + 6;
                        break;
                }
                x++;

                System.out.println("");
                System.out.println("======================================");
                System.out.println("Continuar apostando (1) ou Parar (2)?");
                int sair = Integer.parseInt(input.nextLine());
                if (sair == 2) {
                    continuar = false;
                }
            }
            System.out.println("");
            System.out.println(" === A ROLETA ESTÁ GIRANDO!!! ===");
            System.out.println("Pressione Enter.");
            input.nextLine();
            System.out.println("==================================================");
            System.out.println("O número sorteado pela roleta foi: " + roleta + "!");
            System.out.println("");

            verificaPremio(jogadaDireta, jogadaSplit, jogadaStreet, jogadaCorner, jogadaSixLine, roleta, premio, recompensa);
            int totalPremio = 0;
            for (int i = 0; i < recompensa.length; i++) {
                totalPremio += premio[i];
            }
            Cassino.total += totalPremio;

            if (totalPremio == 0) {
                System.out.println(" *** Você não acertou! Tente novamente! *** ");
                System.out.println("Saldo: $" + Cassino.total);
            } else {
                System.out.println("Total do prêmio: $" + totalPremio);
                System.out.println("Saldo: $" + Cassino.total);
            }

            limpaVetor(jogadaDireta, jogadaSplit, jogadaStreet, jogadaCorner, jogadaSixLine, premio, recompensa);

            int continua = continuarJogo();
            if (continua == 2) {
                continuarJogo = false;
            } else {
                continuar = true;
            }

        }
    }
    
    static void verificaAposta (int [] jogada, int [] recompensa, int [] valor, int tipo, int roleta, int x, int y, int w, int z){
        boolean try6 = true;
                        while (try6) {
                            try {
                                mesaRoleta();
                                System.out.println("Em quais números quer apostar?");
                                for (int i = 0; i < w; i++) {
                                    jogada[tipo] = Integer.parseInt(input.nextLine());
                                    if (jogada[tipo] >= 0 && jogada[tipo] <= 36) {
                                        if (i != z) {
                                            System.out.println("e");
                                        } else {
                                            System.out.print("");
                                        }
                                        if (roleta == jogada[tipo]) {
                                            recompensa[y] = valor[x];
                                        }
                                        tipo++;
                                        try6 = false;
                                    } else {
                                        System.out.println("*** Número Inválido! ***");
                                        try6 = true;
                                        break;
                                    }
                                }
                            } catch (NumberFormatException ex) {
                                System.out.println("*** Entrada inválida! ***");
                                try6 = true;
                            }
                        }
    }

    static void mesaRoleta() {
        System.out.println("========================================================");
        System.out.println("    1ª DUZIA  -  2ª DUZIA  -  3ª DUZIA  -  1ª METADE          ");
        System.out.println("");
        System.out.println("    3   6   9   12   15   18   21   24   27   30   33");
        System.out.println("0   2   5   8   11   14   17   20   23   26   29   32");
        System.out.println("    1   4   7   10   13   16   19   22   25   28   31");
        System.out.println("");
        System.out.println("    PARES - IMPARES - VERMELHOS - PRETOS - 2ª METADE                             ");
        System.out.println("=======================================================");
        System.out.println("");
    }

    static void verificaPremio(int[] a, int[] b, int[] c, int[] d, int[] e, int roleta, int[] premio, int[] recompensa) {
        int p = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == roleta) {
                premio[p] = recompensa[1] * 35;
                //Cassino.total += premio[p];
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Direta e ganhou $" + premio[p] + "!");
                p++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == roleta) {
                premio[p] = recompensa[2] * 17;
                //Cassino.total += premio[p];
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Split e ganhou $" + premio[p] + "!");
                p++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == roleta) {
                premio[p] = recompensa[3] * 11;
                //Cassino.total += premio[p];
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Street e ganhou $" + premio[p] + "!");
                p++;
            }
        }
        for (int i = 0; i < d.length; i++) {
            if (d[i] == roleta) {
                premio[p] = recompensa[4] * 8;
                //Cassino.total += premio[p];
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Corner e ganhou $" + premio[p] + "!");
                p++;
            }
        }
        for (int i = 0; i < e.length; i++) {
            if (e[i] == roleta) {
                premio[p] = recompensa[5] * 5;
                //Cassino.total += premio[p];
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Six Line e ganhou $" + premio[p] + "!");
                p++;
            }
        }
    }

    static int continuarJogo() {
        System.out.println("");
        boolean try1 = true;
        int continuar = 0;
        while (try1){
            try{
        System.out.println("==========================================");
        System.out.println("Deseja continuar neste jogo(1) ou sair(2)?");
        continuar = Integer.parseInt(input.nextLine());
        try1 = false;
            } catch (NumberFormatException ex){
                System.out.println("");
                System.err.println("*** Entrada inválida! ***");
            }
        }
        return continuar;
    }

    static void limpaVetor(int[] a, int[] b, int[] c, int[] d, int[] e, int[] f, int[] g) {
        Arrays.fill(a, 0);
        Arrays.fill(b, 0);
        Arrays.fill(c, 0);
        Arrays.fill(d, 0);
        Arrays.fill(e, 0);
        Arrays.fill(f, 0);
        Arrays.fill(g, 0);
    }
}
