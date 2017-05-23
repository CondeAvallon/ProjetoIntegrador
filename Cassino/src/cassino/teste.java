package cassino;

import java.util.Random;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int[][] aposta = new int[37][37];
        int[] jogadaDireta = new int[37];
        int[] jogadaSplit = new int[37];
        int[] jogadaStreet = new int[37];
        int[] jogadaCorner = new int[37];
        int[] jogadaSixLine = new int[20];
        int total;
        boolean continuar = true;
        int[] valor = new int[37];
        int jogada = 0;
        int tipo;
        int x = 0;
        int v = 0;

        int roleta = 21;
        int recompensa = 0;

        while (continuar) {
            System.out.println("Quanto deseja apostar? ");
            valor[v] = Integer.parseInt(input.nextLine());

            System.out.println("Qual tipo de aposta:");
            System.out.println("1 - Direta (1 número)");
            System.out.println("2 - Split (2 números)");
            System.out.println("3 - Street (3 números)");
            System.out.println("4 - Corner (4 números)");
            System.out.println("5 - SixLine (6 números)");
            tipo = Integer.parseInt(input.nextLine());

            switch (tipo) {
                case 1:
                    System.out.println("Em qual número quer apostar? ");
                    jogadaDireta[x] = Integer.parseInt(input.nextLine());
                    aposta[jogadaDireta[x]][valor[v]] = jogada;
                    if (roleta == jogadaDireta[x]) {
                        recompensa = valor[v];
                    }
                    x++;
                    v++;
                    break;
                case 2:
                    
            }
            
            System.out.println("Continuar apostando (1) ou Sair (2)?");
            int sair = Integer.parseInt(input.nextLine());
            if (sair == 1) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
        System.out.println("a roleta está girando");
        for (int i = 0; i < jogadaDireta.length; i++) {
            if (jogadaDireta[i] == roleta) {
                int premio = recompensa * 35;
                //total = total + premio;
                System.out.println("Parabéns (direta)! Você ganhou $" + premio + "!");
            }
        }
    }

}
