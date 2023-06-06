package Elevador;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(25, 10);
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;
        while (rodando) {

            elevador.mostrarOpcoes();

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    elevador.entrarPessoa();
                    break;
                case 2:
                    elevador.sairPessoa();
                    break;
                case 3:
                    elevador.setAndarAtual(
                            Integer.parseInt(JOptionPane.showInputDialog("Escolha o andar atual: ")));
                    break;
                case 4:
                    rodando = false;
                    break;
                default:
                    break;
            }
        }
    }
}
