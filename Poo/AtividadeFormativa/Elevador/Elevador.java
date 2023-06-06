package Elevador;

import javax.swing.JOptionPane;

public class Elevador {
    int andares;
    int lotacao;
    int pessoas = 0;
    int andarAtual;

    public Elevador(int andares, int lotacao) {
        this.andares = andares;
        this.lotacao = lotacao;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual > this.andares) {
            System.out.println("Insira um andar entre 0 a " + this.andares);
        } else if (andarAtual == this.getAndarAtual()) {
            System.out.println("Você já está no andar " + andarAtual);
        } else {
            this.andarAtual = andarAtual;
            System.out.println("Agora você está no andar " + this.andarAtual);
        }
    }

    public int entrarPessoa() {
        int quantidadeAtual = this.pessoas + 1;
        if (quantidadeAtual > lotacao) {
            JOptionPane.showMessageDialog(null, "Capacidade máxima atingida");
        } else {
            setPessoas(quantidadeAtual);
        }
        return this.pessoas;
    }

    public int sairPessoa() {
        if (this.pessoas < 1) {
            JOptionPane.showMessageDialog(null, "Não tem ninguém para sair");
        } else {
            setPessoas(this.pessoas - 1);
        }
        return this.pessoas;
    }

    public void mostrarOpcoes() {
        System.out.println("===============Elevador==============");
        System.out.println("Andar atual: " + this.andarAtual);
        System.out.println("Pessoas no elevador: " + this.pessoas + "/" + this.lotacao);
        System.out.println("1. Entrar pessoa");
        System.out.println("2. Sair pessoa");
        System.out.println("3. Escolher andar");
        System.out.println("4. Encerrar");
        System.out.println("=====================================");
        System.out.print("Escolha uma opção: ");
    }

}
