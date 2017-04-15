package lista3;

import java.util.Scanner;

public class exe19 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("=== SENHA ===\n");

        int i = 0;
        String senha, senhacorreta = "2002";

        while (i < 3) {
            System.out.println("Digite a senha: ");
            senha = read.nextLine();
            if (senha.equals(senhacorreta)) {
                System.out.println("Acesso Permitido.");
                break;
            } else {
                System.out.println("Senha inválida.");
                if (i == 2) {
                    System.err.println("Conta Bloqueada.");
                }
            }
            i++;
        }
        System.out.println("");
        System.out.println("=== FIM ===");
    }

}
