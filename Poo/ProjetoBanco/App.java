package ProjetoBanco;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();

        while (true) {
            String[] opcoes = { "Mostrar Contas", "Criar conta", "Acessar conta por nome",
                    "Acessar conta por numero da conta",
                    "Sair" };

            StringBuilder mensagem = new StringBuilder();

            mensagem.append("Selecione uma opção:\n");

            for (int i = 0; i < opcoes.length; i++) {
                mensagem.append(i + 1).append(". ").append(opcoes[i]).append("\n");
            }

            int opcaoSelecionada = Integer.parseInt(
                    JOptionPane.showInputDialog(null, mensagem.toString(), "Banco", JOptionPane.PLAIN_MESSAGE));

            switch (opcaoSelecionada) {
                case 1:
                    banco.mostrarContas();
                    break;
                case 2:
                    banco.criarConta();
                    break;
                case 3:
                    banco.acessarConta(1);
                    break;
                case 4:
                    banco.acessarConta(2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }
}
