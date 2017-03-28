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
                System.out.println("O atacante ganhou e destruiu a unidade inimiga!");
            } else if (dado2def > dado1atk) {
                System.out.println("O defensor ganhou e destruiu a unidade inimiga!");
            }
        } else if ((ataque == 2) && (defesa == 1)) {
            int dado1atk = dados.nextInt(6) + 1;
            System.out.print("O atacante atacou força: " + dado1atk);
            int dado2atk = dados.nextInt(6) + 1;
            System.out.println(" e " + dado2atk);
            int dado1def = dados.nextInt(6) + 1;
            System.out.println("O defensor defendeu com força: " + dado1def);
            if ((dado1atk > dado1def) || (dado2atk > dado1def)) {
                System.out.println("O atacante ganhou e destruiu a unidade inimiga!");
            } else if ((dado1def >= dado1atk) && (dado1def >= dado2atk)) {
                System.out.println("O defensor ganhou e destruiu uma unidade inimiga!");
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
            } else if (((dado1atk > dado1def) && (dado1atk > dado2def)) && ((dado2atk <= dado1def) && (dado2atk <= dado2def))){
                System.out.println("Cada exército perdeu uma unidade!");
            } else if (((dado1atk <= dado1def) || (dado1atk <= dado2def)) && ((dado2atk > dado1def) || (dado2atk > dado2def))) {
                System.out.println("Cada exército perdeu uma unidade!");
            } else if (((dado1atk <= dado1def) && (dado1atk <= dado2def)) && ((dado2atk <= dado1def) && (dado2atk <= dado2def))) {
                System.out.println("O defensor ganhou e destruiu duas unidades inimigas!");
            }
        } else if ((ataque == 1) && (defesa == 2)){
            int dado1atk = dados.nextInt(6)+1;
            System.out.println("O atacante atacou com força: "+dado1atk);
            int dado1def = dados.nextInt(6)+1;
            System.out.print("O defensor defendeu com força: "+dado1def);
            int dado2def = dados.nextInt(6)+1;
            System.out.println(" e "+dado2def);
            
            if ((dado1atk > dado1def) && (dado1atk > dado2def)){
                System.out.println("O atacante ganhou e destruiu uma unidade inimiga!");
            } else if ((dado1def >= dado1atk) || (dado2def >= dado1atk)){
                System.out.println("O defensor ganhou e destruiu a unidade inimiga!");
            }
        } else if ((ataque == 1) && (defesa == 3)){
            int dado1atk = dados.nextInt(6)+1;
            System.out.println("O atacante atacou com força: "+dado1atk);
            int dado1def = dados.nextInt(6)+1;
            System.out.print("O defensor defendeu com força: "+dado1def);
            int dado2def = dados.nextInt(6)+1;
            System.out.print(", "+dado2def);
            int dado3def = dados.nextInt(6)+1;
            System.out.println(" e "+dado3def);
            
            if ((dado1atk > dado1def) && (dado1atk > dado2def) && (dado1atk > dado3def)){
                System.out.println("O atacante ganhou e destruiu 1 unidade inimiga!");
            } else if ((dado1atk <= dado1def) || (dado1atk <= dado2def) || (dado1atk <= dado3def)){
                System.out.println("O defensor ganhou e destruiu a unidade inimiga!");
            }
        } else if ((ataque == 3) && (defesa == 3)){
            int dado1atk = dados.nextInt(6)+1;
            System.out.print("O atacante atacou com força: "+dado1atk);
            int dado2atk = dados.nextInt(6)+1;
            System.out.print(", "+dado2atk);
            int dado3atk = dados.nextInt(6)+1;
            System.out.println(" e "+dado3atk);
            int dado1def = dados.nextInt(6)+1;
            System.out.print("O defensor defendeu com força: "+dado1def);
            int dado2def = dados.nextInt(6)+1;
            System.out.print(", "+dado2def);
            int dado3def = dados.nextInt(6)+1;
            System.out.println(" e "+dado3def);
            
           double maxatk = Math.max (dado1atk, Math.max (dado2atk,dado3atk));
           double meioatk = Math.min(Math.max(dado1atk,dado2atk),dado3atk);
           double maxdef = Math.max (dado1def, Math.max (dado2def,dado3def));

           double minatk = Math.min (dado1atk, Math.min (dado2atk,dado3atk));
           double meiodef = Math.min(Math.max(dado1def,dado2def),dado3def);
           double mindef = Math.min (dado1def, Math.min (dado2def,dado3def));
           
            System.out.println("Ataque max: "+maxatk);
            System.out.println("Ataque meio: "+meioatk);
            System.out.println("Ataque min: "+minatk);
            System.out.println("Deesa max: "+maxdef);
            System.out.println("Defesa meio: "+meiodef);
            System.out.println("Defesa min: "+mindef);


          if ((maxatk > maxdef) && (meioatk > meiodef) && (minatk > mindef)){
              System.out.println("Ataque ganha!");
          } else if ((maxatk > maxdef) && (meioatk > meiodef) && (minatk <= mindef)){
              System.out.println("Ataque 2, Defesa 1.quatro");
          } else if ((maxatk > maxdef) && (meioatk <= meiodef) && (minatk <= mindef)){
            System.out.println("Ataque 1, Defesa 2.um");
          } else if ((maxatk <= maxdef) && (meioatk > meiodef) && (minatk > mindef)){
              System.out.println("Ataque 2, Defesa 1.cinco");
          } else if ((maxatk <= maxdef) && (meioatk > meiodef) && (minatk <= mindef)){
              System.out.println("Ataque 1, Defesa 2.dois");
          } else if ((maxatk <= maxdef) && (meioatk <= meiodef) && (minatk > mindef)){
              System.out.println("Ataque 1, Defesa 2");
          } else if ((maxatk > maxdef) && (meioatk <= meiodef) && (minatk > mindef)){
              System.out.println("Ataque 2, Defesa 1.tres");
          } else if ((maxatk <= maxdef) && (meioatk <= meiodef) && (minatk <= mindef)){
              System.out.println("Defesa ganha!");
          } else if ((maxatk == maxdef) && (meioatk == meiodef) && (minatk == mindef)){
              System.out.println("Defesa ganha!");
          }
            
           
            
        }
    }

}
