package cassino;

import java.util.Scanner;
import static Cassino.coresCassino.cor;
import static Cassino.coresCassino.fundo;
import static Cassino.coresCassino.limpaTela;
import static Cassino.coresCassino.negrito;
import static Cassino.coresCassino.reset;

public class Cassino {

    public static double total;

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int jogo;
        boolean sair = true;
        boolean try1 = true;

        cor ("azul");
        System.out.println("===========   SEJA BEM-VINDO AO CASSINO SENAC!  ===========\n");
        System.out.println("");
        while (try1) {
            try {
                System.out.println("Digite a quantidade de dinheiro disponível (mínimo $ 100)");
                total = Double.parseDouble(read.nextLine());
                System.out.println("Saldo: $" + total);
                try1 = false;
            } catch (NumberFormatException ex) {
                System.out.println("");
                System.err.println("*** Digite um valor válido! ***");
            }
        }

        while (sair) {
            try {
                System.out.println("");
                System.out.println("=======================  M E N U  =========================\n");
                System.out.println("Qual jogo gostaria de jogar? \n1-BlackJack / 2-Roleta / 3-Sair");
                jogo = Integer.parseInt(read.nextLine());
                System.out.println("");
                switch (jogo) {
                    case 1:
                        blackjack.blackJack();
                        break;
                    case 2:
                        Roleta.roleta();
                        break;
                    case 3:
                        System.out.println("==========================================");
                        System.out.println("Obrigado por ter visitado o CASSINO SENAC!");
                        System.out.println("Saldo Final: $" + total + "!");
                        sair = false;
                        break;
                    default:
                        System.out.println("");
                        System.err.println("*** Digite um valor válido! ***");
                }
            } catch (NumberFormatException ex) {
                System.err.println("*** Entrada inválida! ***");
            }

        }

    }

}