package exepi;

import java.util.Random;
import java.util.Scanner;

public class exeWar {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random dados = new Random();

        System.out.println("=== BEM-VINDO À GUERRA !!! ===");
        System.out.println("");

        System.out.println("Escolha com quantas unidades você irá atacar! (máx.3)");
        int ataque = read.nextInt();

        System.out.println("Escolha com quantas unidades você irá se defender (máx.3)");
        int defesa = read.nextInt();

        System.out.println("");
        System.out.println("A batalha se inicia!");
        System.out.println("");

        if ((ataque == 1) && (defesa == 1)) {
            int dado1atk = dados.nextInt(6) + 1;
            System.out.println("O atacante atacou com força: " + dado1atk);
            int dado2def = dados.nextInt(6) + 1;
            System.out.println("O defensor defendeu com força: " + dado2def);
            if (dado1atk > dado2def) {
                System.out.println("O atacante ganhou!");
            } else if (dado2def > dado1atk) {
                System.out.println("O defensor ganhou!");
            }
        } else if ((ataque == 2) && (defesa == 1)) {
            int dado1atk = dados.nextInt(6) + 1;
            System.out.print("O atacante atacou força: " + dado1atk);
            int dado2atk = dados.nextInt(6) + 1;
            System.out.println(" e " + dado2atk);
            int dado3def = dados.nextInt(6) + 1;
            System.out.println("O defensor defendeu com força: " + dado3def);
            if ((dado1atk > dado3def) || (dado2atk > dado3def)) {
                System.out.println("O atacante ganhou!");
            } else if ((dado3def >= dado1atk) && (dado3def >= dado2atk)) {
                System.out.println("O defensor ganhou!");
            }

        } else if ((ataque == 3) && (defesa == 1)) {
            int dado1atk = dados.nextInt(6) + 1;
            System.out.print("O atacante atacou com força: " + dado1atk);
            int dado2atk = dados.nextInt(6) + 1;
            System.out.print(", " + dado2atk);
            int dado3atk = dados.nextInt(6) + 1;
            System.out.println(" e " + dado3atk);
            int dado1def = dados.nextInt(6) + 1;
            System.out.println("O defensor defendeu com força: " + dado1def);
            if ((dado1atk > dado1def) || (dado2atk > dado1def) || (dado3atk) > (dado1def)) {
                System.out.println("O atacante ganhou!");
            } else if ((dado1def >= dado1atk) || (dado1def >= dado2atk) || (dado1def >= dado3atk)) {
                System.out.println("O defensor ganhou!");
            }

        } else if ((ataque == 2) && (defesa == 2)) {
            int dado1atk = dados.nextInt(6) + 1;
            System.out.print("O atacante atacou com força: " + dado1atk);
            int dado2atk = dados.nextInt(6) + 1;
            System.out.println(" e " + dado2atk);
            int dado1def = dados.nextInt(6) + 1;
            System.out.print("O defensor defendeu com força: " + dado1def);
            int dado2def = dados.nextInt(6) + 1;
            System.out.println(" e " + dado2def);

            if (((dado1atk > dado1def) && (dado1atk > dado2def)) && ((dado2atk > dado1def) && (dado2atk > dado2def))) {
                System.out.println("O atacante ganhou e destruiu duas unidades inimigas!");
            } 
        }
    }

}
