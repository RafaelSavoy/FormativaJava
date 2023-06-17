package ProjetoBanco;

public class ContaPJ extends Conta {
    private String cnpj;

    // Construtor
    public ContaPJ(int id, String nome, String cnpj) {
        super(id, "PJ", nome);
        this.cnpj = cnpj;
    }

    // Getter
    public String getCnpj() {
        return cnpj;
    }
}