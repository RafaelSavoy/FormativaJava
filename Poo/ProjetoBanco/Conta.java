package ProjetoBanco;

import javax.swing.JOptionPane;

public class Conta {
    private String tipo;
    private String nome;
    private double saldo;
    private int numeroConta;
    private double saldoDevedor;

    public Conta(int numeroConta, String tipo, String nome) {
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.nome = nome;
        this.saldoDevedor = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoDevedor() {
        return this.saldoDevedor;
    }

    public void setSaldoDevedor(double value) {
        this.saldoDevedor = value;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            JOptionPane.showMessageDialog(null, "Você não pode sacar mais do que o seu saldo");
        } else if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Você não pode sacar um valor negativo");
        } else {
            setSaldo(this.getSaldo() - valor);
        }
    }

    public void depositar(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Você não pode depositar um valor negativo");
        } else {
            setSaldo(this.getSaldo() + valor);
        }
    }
}
