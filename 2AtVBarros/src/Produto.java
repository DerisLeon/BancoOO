public class Produto {

    private int codPro;
    private double custo;
    private String descricao;
    private double preco;
    private String nome;

    public Produto() {
        super();
    }

    public Produto(int codPro, double custo, String descricao, double preco, String nome) {
        this.codPro = codPro;
        this.custo = custo;
        this.descricao = descricao;
        this.preco = preco;
        this.nome = nome;
    }

    public int getCodPro() {
        return codPro;
    }

    public void setCodPro(int codPro) {
        this.codPro = codPro;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codPro=" + codPro +
                ", custo=" + custo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}
