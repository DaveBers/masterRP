package masterRP.cadastros.bancos;

public class Banco {
    private String nome;
    private String codigo;

    public Banco(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
