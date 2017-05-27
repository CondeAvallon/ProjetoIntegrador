package cassino;

import java.util.Random;
import java.util.Scanner;

public class s {

     public static void roleta() {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int [][] aposta = new int [10][10];
        int[] jogadaDireta = new int[37];
        int[] jogadaSplit = new int[37];
        int[] jogadaStreet = new int[37];
        int[] jogadaCorner = new int[37];
        int[] jogadaSixLine = new int[20];
        boolean continuar = true;
        int[] valor = new int[37];
        int tipo = 0;
        int x = 0;
        boolean try1 = true;
        boolean try2 = true;

        int roleta = 21;
        int recompensa = 0;

        while (continuar) {
            while(try1){
            try {
            System.out.println("Quanto deseja apostar?\n");
            valor[x] = Integer.parseInt(input.nextLine());
            System.out.println("");
            try1 = false;
            } catch (NumberFormatException ex){
                System.out.println(" --- Entrada inválida! ---");
            }
        }
            try1 = true;
            while (try2){
                try{
            System.out.println("Qual tipo de aposta:\n");
            System.out.println("1 - Direta (1 número)");
            System.out.println("2 - Split (2 números)");
            System.out.println("3 - Street (3 números)");
            System.out.println("4 - Corner (4 números)");
            System.out.println("5 - SixLine (6 números)\n");
            tipo = Integer.parseInt(input.nextLine());
            try2 = false;
                } catch (NumberFormatException ex){
                    System.out.println(" --- Entrada inválida! ---");
                } 
            }
            try2 = true;
            System.out.println("");
            int y = 0;

            switch (tipo) {
                case 1:
                    mesaRoleta();
                    System.out.println("Em qual número quer apostar?");
                        jogadaDireta[y] = Integer.parseInt(input.nextLine());
                        aposta [tipo][valor[y]] = jogadaDireta[y];
                        y++;
                    break;
                case 2:
                    mesaRoleta();
                    System.out.println("Em quais números quer apostar?");
                    for (int i = 0; i < 2; i++) {
                        jogadaSplit[i] = Integer.parseInt(input.nextLine());
                        if (i != 1) {
                            System.out.println("e");
                        } else {
                            System.out.print("");
                        }
                        if (roleta == jogadaSplit[i]) {
                            recompensa = valor[x];
                        }
                    }
                    break;
                case 3:
                    mesaRoleta();
                    System.out.println("Em quais números quer apostar?");
                    for (int i = 0; i < 3; i++) {
                        jogadaStreet[i] = Integer.parseInt(input.nextLine());
                        if (i != 2) {
                            System.out.println("e");
                        } else {
                            System.out.print("");
                        }
                        if (roleta == jogadaStreet[i]) {
                            recompensa = valor[x];
                        }
                    }
                    break;
                case 4:
                    mesaRoleta();
                    System.out.println("Em quais números quer apostar?");
                    for (int i = 0; i < 4; i++) {
                        jogadaCorner[i] = Integer.parseInt(input.nextLine());
                        if (i != 3) {
                            System.out.println("e");
                        } else {
                            System.out.print("");
                        }
                        if (roleta == jogadaCorner[i]) {
                            recompensa = valor[x];
                        }
                    }
                    break;
                case 5:
                    mesaRoleta();
                    System.out.println("Em quais números quer apostar?");
                    for (int i = 0; i < 6; i++) {
                        jogadaSixLine[i] = Integer.parseInt(input.nextLine());
                        if (i != 5) {
                            System.out.println("e");
                        } else {
                            System.out.print("");
                        }

                        if (roleta == jogadaSixLine[i]) {
                            recompensa = valor[x];
                        }
                    }
                    break;

            }
            
            for (int i = 0;i < jogadaDireta.length;i++){
                if (jogadaDireta[i] == roleta){
                recompensa = valor[i] * 35;
                    System.out.println(recompensa);
                }
            }

            System.out.println("Continuar apostando (1) ou Sair (2)?");
            int sair = Integer.parseInt(input.nextLine());
            if (sair == 1) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
        System.out.println(" === A ROLETA ESTÁ GIRANDO!!! ===");
        System.out.println("Pressione Enter.");
        input.nextLine();
        System.out.println("O número sorteado pela roleta foi: " + roleta + "!");
        System.out.println("");

        for (int i = 0;i < jogadaDireta.length;i++){
                if (jogadaDireta[i] == roleta){
                recompensa = valor[i] * 35;
                    System.out.println(recompensa);
                }
            }
        for (int i = 0; i < jogadaDireta.length; i++) {
            if (jogadaDireta[i] == roleta) {
                int premio = recompensa * 35;
                //total = total + premio;
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Direta e ganhou $" + premio + "!");
            }
        }
        for (int i = 0; i < jogadaSplit.length; i++) {
            if (jogadaSplit[i] == roleta) {
                int premio = recompensa * 17;
                //total = total + premio;
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Split e ganhou $" + premio + "!");
            }
        }
        for (int i = 0; i < jogadaStreet.length; i++) {
            if (jogadaStreet[i] == roleta) {
                int premio = recompensa * 11;
                //total = total + premio;
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Street e ganhou $" + premio + "!");
            }
        }
        for (int i = 0; i < jogadaCorner.length; i++) {
            if (jogadaCorner[i] == roleta) {
                int premio = recompensa * 8;
                //total = total + premio;
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Corner e ganhou $" + premio + "!");
            }
        }
        for (int i = 0; i < jogadaSixLine.length; i++) {
            if (jogadaSixLine[i] == roleta) {
                int premio = recompensa * 4;
                //total = total + premio;
                System.out.println("Parabéns! Você acertou o número **" + roleta + "** com aposta Six Line e ganhou $" + premio + "!");
            }
        }
        if (recompensa == 0){
            System.out.println("Você não acertou! Tente novamente!");
        }
    }
    
    static void mesaRoleta(){
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
}
