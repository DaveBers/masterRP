package masterRP.cadastros.contaBancaria;

public class ContaBancaria {
    private String nome;
    private String numeroConta;

    public ContaBancaria(String nome, String numeroConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}