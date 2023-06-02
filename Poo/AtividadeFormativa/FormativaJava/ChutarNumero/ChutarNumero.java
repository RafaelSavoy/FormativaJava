package FormativaJava.ChutarNumero;

import java.util.Random;
import java.util.Scanner;

public class ChutarNumero {
    int numeroEscolhido;
    int tentativas = 1;
    boolean acertou = false;
    Scanner sc = new Scanner(System.in);

    public ChutarNumero() {
        Random rand = new Random();
        this.setNumeroEscolhido((int) Math.floor(rand.nextInt((1000 - 0) + 1) + 0));
        System.out.println("==========================================================================");
        System.out.println("Começou o Adivinha Número, dê um palpite até acertar um número de 1 a 1000");
        System.out.println("==========================================================================");
    }

    public void comecarJogo() {
        while (this.isAcertou() == false) {
            int palpite = this.pedirPalpite();

            if (palpite == this.numeroEscolhido) {
                System.out.println("Parabéns, você acertou o número com " + this.getTentativas() + " tentativas.");
                this.finalizarJogo();
            } else {
                String maiorOuMenor = "";
                if (palpite > numeroEscolhido){
                    maiorOuMenor = "menor";
                }else{
                    maiorOuMenor = "maior";
                }
                System.out.println("Você errou, o número certo é " + maiorOuMenor);
            }
            setTentativas(this.tentativas + 1);
        }
    }

    public void finalizarJogo() {
        setAcertou(true);
        sc.close();
    }

    public int pedirPalpite() {
        System.out.println(this.tentativas + ". Insira o seu palpite: ");

        int palpite = sc.nextInt();

        return palpite;
    }

    public int getNumeroEscolhido() {
        return numeroEscolhido;
    }

    public void setNumeroEscolhido(int numeroEscolhido) {
        this.numeroEscolhido = numeroEscolhido;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public boolean isAcertou() {
        return acertou;
    }

    public void setAcertou(boolean acertou) {
        this.acertou = acertou;
    }

}
