package FormativaJava.CriadorDeMatriz;

import java.util.Random;
import java.util.Scanner;

public class CriadorDeMatriz {
    int[][] matriz;

    public CriadorDeMatriz() {
        criarMatriz();
        preencherMatriz();
        mostrarMatriz();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        mudarMatriz();
    }

    public void criarMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Insira o numero de colunas: ");
        int colunas = sc.nextInt();
        this.setMatriz(linhas, colunas);

    }

    public void preencherMatriz() {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) Math.floor(rand.nextInt((9 - 0) + 1) + 0);
            }
        }
    }

    public void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" |");
        }
    }

    public void mudarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else if (i < j) {
                    matriz[i][j] = 2;
                }
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" |");
        }
    }

    public void setMatriz(int linhas, int colunas) {
        this.matriz = new int[colunas][linhas];
    }

}
