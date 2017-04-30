
import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String pos1 = " ", pos2 = " ", pos3 = " ", pos4 = " ", pos5 = " ", pos6 = " ", pos7 = " ", pos8 = " ", pos9 = " ";
        System.out.println("=== JOGO DA VELHA ===\n");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            System.out.println("Qual será sua jogada? X ou O:");
            String j = read.nextLine();
            j = j.toUpperCase();

            if (j.equals("X") || j.equals("O")) {

                System.out.println("Escolha onde quer jogar: ");
                int tabuleiro = Integer.parseInt(read.nextLine());

                switch (tabuleiro) {
                    case 1:
                        if (pos1.equals(" ")) {
                            pos1 = j;
                        } else {
                            System.out.println("*** Local ocupado! Jogue novamente! ***");
                            i--;
                        }
                        break;
                    case 2:
                        if (pos2.equals(" ")) {
                            pos2 = j;
                        } else {
                            System.out.println("*** Local ocupado! Jogue novamente! ***");
                            i--;
                        }
                        break;
                    case 3:
                        if (pos3.equals(" ")) {
                            pos3 = j;
                        } else {
                            System.out.println("*** Local ocupado! Jogue novamente! ***");
                            i--;
                        }
                        break;
                    case 4:
                        if (pos4.equals(" ")) {
                            pos4 = j;
                        } else {
                            System.out.println("*** Local ocupado! Jogue novamente! ***");
                            i--;
                        }
                        break;
                    case 5:
                        if (pos5.equals(" ")) {
                            pos5 = j;
                        } else {
                            System.out.println("*** Local ocupado! Jogue novamente! ***");
                            i--;
                        }
                        break;
                    case 6:
                        if (pos6.equals(" ")) {
                            pos6 = j;
                        } else {
                            System.out.println("*** Local ocupado! Jogue novamente! ***");
                            i--;
                        }
                        break;
                    case 7:
                        if (pos7.equals(" ")) {
                            pos7 = j;
                        } else {
                            System.out.println("*** Local ocupado! Jogue novamente! ***");
                            i--;
                        }
                        break;
                    case 8:
                        if (pos8.equals(" ")) {
                            pos8 = j;
                        } else {
                            System.out.println("*** Local ocupado! Jogue novamente! ***");
                            i--;
                        }
                        break;
                    case 9:
                        if (pos9.equals(" ")) {
                            pos9 = j;
                        } else {
                            System.out.println("*** Local ocupado! Jogue novamente! ***");
                            i--;
                        }
                        break;

                }
                System.out.println("");
                System.out.println(" " + pos1 + " | " + pos2 + " | " + pos3 + " ");
                System.out.println("---+---+---");
                System.out.println(" " + pos4 + " | " + pos5 + " | " + pos6 + " ");
                System.out.println("---+---+---");
                System.out.println(" " + pos7 + " | " + pos8 + " | " + pos9 + " ");
                System.out.println("");

                if (pos1.equals("X") && pos2.equals("X") && pos3.equals("X")) {
                    System.out.println("Jogador X ganhou!");
                    break;
                } else if (pos1.equals("X") && pos4.equals("X") && pos7.equals("X")) {
                    System.out.println("Jogador X ganhou!");
                    break;
                } else if (pos7.equals("X") && pos8.equals("X") && pos9.equals("X")) {
                    System.out.println("Jogador X ganhou!");
                    break;
                } else if (pos3.equals("X") && pos6.equals("X") && pos9.equals("X")) {
                    System.out.println("Jogador X ganhou!");
                    break;
                } else if (pos1.equals("X") && pos5.equals("X") && pos9.equals("X")) {
                    System.out.println("Jogador X ganhou!");
                    break;
                } else if (pos3.equals("X") && pos5.equals("X") && pos7.equals("X")) {
                    System.out.println("Jogador X ganhou!");
                    break;
                } else if (pos2.equals("X") && pos5.equals("X") && pos8.equals("X")) {
                    System.out.println("Jogador X ganhou!");
                    break;
                } else if (pos1.equals("O") && pos2.equals("O") && pos3.equals("O")) {
                    System.out.println("Jogador O ganhou!");
                    break;
                } else if (pos1.equals("O") && pos4.equals("O") && pos7.equals("O")) {
                    System.out.println("Jogador O ganhou!");
                    break;
                } else if (pos7.equals("O") && pos8.equals("O") && pos9.equals("O")) {
                    System.out.println("Jogador O ganhou!");
                    break;
                } else if (pos3.equals("O") && pos6.equals("O") && pos9.equals("O")) {
                    System.out.println("Jogador O ganhou!");
                    break;
                } else if (pos1.equals("O") && pos5.equals("O") && pos9.equals("O")) {
                    System.out.println("Jogador O ganhou!");
                    break;
                } else if (pos3.equals("O") && pos5.equals("O") && pos7.equals("O")) {
                    System.out.println("Jogador O ganhou!");
                    break;
                } else if (pos2.equals("O") && pos5.equals("O") && pos8.equals("O")) {
                    System.out.println("Jogador O ganhou!");
                    break;
                }
                if (i == 8) {
                    System.out.println("Empate!");
                }
            } else {
                System.out.println("Código inválido! Jogue novamente!");
                i--;
            }
        }

    }
}
