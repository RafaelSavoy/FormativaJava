package FormativaJava.MatrizAleatoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrizAleatoria {
    public void vetor() {
        Random rd = new Random();
        int tamanhoVetor = rd.nextInt(1000) + 1;
        int[] vetor = new int[tamanhoVetor];
        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();
        int paresEmImpares = 0;
        int imparesEmPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares.add(vetor[i]);
                if (i % 2 != 0) {
                    paresEmImpares++;
                }
            } else {
                impares.add(vetor[i]);
                if (i % 2 != 0) {
                    imparesEmPares++;
                }
            }
        }

        System.out.println(" ");
        System.out.print("Impares: | ");
        impares.forEach(item -> System.out.print(item + " "));
        System.out.println('|');
        System.out.println(" ");
        System.out.print("Pares: | ");
        pares.forEach(item -> System.out.print(item + " "));
        System.out.println('|');
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Impares em casas pares " + imparesEmPares);
        System.out.println("Pares em casas impares " + paresEmImpares);

    }
}
