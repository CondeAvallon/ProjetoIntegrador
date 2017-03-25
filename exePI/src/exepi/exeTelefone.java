package exepi;

import java.util.Scanner;

public class exeTelefone {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double assinatura = 23.32, tarflocais, tarfurb, tarfnac, total;
        int locais, urb, nac;

        System.out.println("=== PROGRAMA DE CÁLCULO DE CONTA TELEFÔNICA ===");
        System.out.println("");
        System.out.println("Assinatura: R$ " + assinatura);
        System.out.println("Minutos gastos em ligações locais: ");
        locais = read.nextInt();
        System.out.println("Minutos gastos em ligações interurbanas: ");
        urb = read.nextInt();
        System.out.println("Minutos gastos em ligações internacionais: ");
        nac = read.nextInt();

        tarflocais = locais * 0.09;
        tarfurb = urb * 0.26;
        tarfnac = nac * 0.86;
        total = assinatura + tarflocais + tarfurb + tarfnac;

        System.out.println("O valor cobrado por ligações locais é de : R$ " + tarflocais);
        System.out.println("O valor cobrado por ligações interurbanas é de: R$ " + tarfurb);
        System.out.println("O valor cobrado por ligações internacionais é de: R$ " + tarfnac);
        System.out.println("O total da conta telefônica é de: R$ " + total);
        System.out.println("");
        System.out.println("=== FIM ===");

    }

}
