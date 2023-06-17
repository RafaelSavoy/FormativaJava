package ProjetoBanco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banco {
    ArrayList<Conta> contas;
    Conta contaAtual;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void mostrarContas() {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Contas do Banco:\n\n");

        for (Conta conta : contas) {
            mensagem.append("Número da Conta: ").append(conta.getNumeroConta());
            mensagem.append(" | Titular: ").append(conta.getNome());
            mensagem.append(" | Tipo: ").append(conta.getTipo()).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString(), "Contas do Banco", JOptionPane.PLAIN_MESSAGE);
    }

    public void criarConta() {
        String[] tiposConta = { "Pessoa Física (PF)", "Pessoa Jurídica (PJ)" };
        int tipoSelecionado = JOptionPane.showOptionDialog(null, "Selecione o tipo de conta:", "Criar Conta",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tiposConta, tiposConta[0]);

        String nome = JOptionPane.showInputDialog("Digite o nome do titular:");

        if (tipoSelecionado == 0) {
            String cpf = JOptionPane.showInputDialog("Digite o CPF do titular:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do titular:"));

            ContaPF novaConta = new ContaPF(contas.size() + 1, nome, cpf, idade);
            contas.add(novaConta);
        } else if (tipoSelecionado == 1) {
            String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do titular:");

            ContaPJ novaConta = new ContaPJ(contas.size() + 1, nome, cnpj);
            contas.add(novaConta);
        }

        JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
    }

    public Conta buscarContaPorNome(String nome) {
        for (Conta conta : contas) {
            if (conta.getNome().equalsIgnoreCase(nome)) {
                return conta;
            }
        }
        return null;
    }

    public Conta buscarPorNumeroConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void acessarConta(int opcao) {
        Conta conta = null;

        if (opcao == 1) {
            String nomeTitular = JOptionPane.showInputDialog("Digite o nome do titular da conta:");
            conta = buscarContaPorNome(nomeTitular);
        } else if (opcao == 2) {
            int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
            conta = buscarPorNumeroConta(numeroConta);
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
            return;
        }

        if (conta != null) {
            boolean sair = false;

            while (!sair) {
                String[] opcoes = { "Depósito", "Saque", "Empréstimo", "Verificar Saldo", "Sair da Conta" };
                int opcaoSelecionada = JOptionPane.showOptionDialog(null, conta.getNome() + "\nSelecione uma opção:",
                        "Conta " + conta.getNumeroConta(), JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                        opcoes, opcoes[0]);

                switch (opcaoSelecionada) {
                    case 0:
                        double valorDeposito = Double
                                .parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                        conta.depositar(valorDeposito);
                        break;
                    case 1:
                        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                        conta.sacar(valorSaque);
                        break;
                    case 2:
                        double valorEmprestimo = Double
                                .parseDouble(JOptionPane.showInputDialog("Digite o valor do empréstimo:"));

                        if (conta.getSaldoDevedor() != 0) {
                            JOptionPane.showMessageDialog(null,
                                    "Cabra safado, você já deve R$" + conta.getSaldoDevedor());
                            break;
                        }
                        double limite = 0;
                        if (conta instanceof ContaPF) {
                            limite = conta.getSaldo() * 10;
                        } else if (conta instanceof ContaPJ) {
                            limite = conta.getSaldo() * 15;
                        }

                        if (valorEmprestimo > limite) {
                            JOptionPane.showMessageDialog(null,
                                    "Você não pode sacar mais que o seu limite: R$" + limite);
                        } else {
                            conta.depositar(valorEmprestimo);
                            conta.setSaldoDevedor(valorEmprestimo);
                        }
                        break;
                    case 3:
                        double saldo = conta.getSaldo();
                        JOptionPane.showMessageDialog(null, "Saldo da conta: " + saldo);
                        break;
                    case 4:
                        sair = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma conta encontrada");
        }
    }

}
