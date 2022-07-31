public class Vendedor {
    private int codVdd;
    private String cpf;
    private double comissao;
    private String nome;
    private String endereco;

    public Vendedor() {
        super();
    }

    public Vendedor(int codVdd, String cpf, double comissao, String nome, String endereco) {
        this.codVdd = codVdd;
        this.cpf = cpf;
        this.comissao = comissao;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCodVdd() {
        return codVdd;
    }

    public void setCodVdd(int codVdd) {
        this.codVdd = codVdd;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codVdd=" + codVdd +
                ", cpf='" + cpf + '\'' +
                ", comissao=" + comissao +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
