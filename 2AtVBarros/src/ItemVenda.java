public class ItemVenda {
    private Produto produto;
    private Venda venda;
    private double valorUnitario;
    private int quantidade;

    public ItemVenda() {
        super();
    }

    public ItemVenda(Produto produto, Venda venda, double valorUnitario, int quantidade) {
        this.produto = produto;
        this.venda = venda;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "produto=" + produto +
                ", venda=" + venda +
                ", valorUnitario=" + valorUnitario +
                ", quantidade=" + quantidade +
                '}';
    }
}
