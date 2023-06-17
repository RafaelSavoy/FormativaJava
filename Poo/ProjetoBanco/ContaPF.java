package ProjetoBanco;

public class ContaPF extends Conta {
    private String cpf;
    private int idade;

    // Construtor
    public ContaPF(int id, String nome, String cpf, int idade) {
        super(id, "PF", nome);
        this.cpf = cpf;
        this.idade = idade;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
}