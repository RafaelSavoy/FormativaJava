package ProjetoBanco;

public class Conta {
    String nome;
    int numeroConta;
    String tipoConta;
    double saldo;

    public Conta(String nome, int numeroConta, String tipoConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
