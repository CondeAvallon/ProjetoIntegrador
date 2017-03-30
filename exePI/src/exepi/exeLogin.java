package exepi;

import java.util.Scanner;

public class exeLogin {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o seu login: ");
        String login = read.next();
        System.out.println("Digite a sua senha: ");
        String senha = read.next();

        boolean autorizado = login.equals("guilherme") && senha.equals("0f5")
                || login.equals("jair") && senha.equals("0706");
        if (autorizado) {
            System.out.println("Usuário logado.");
        } else {
            System.out.println("Login ou senha incorretos.");
        }
    }
}
