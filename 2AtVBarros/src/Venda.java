public class Venda {
    private int numVenda;
    private double valorTotal;
    private Vendedor vendedor;
    private Cliente cliente;

    public Venda() {
        super();
    }

    public Venda(int numVenda, double valorTotal, Vendedor vendedor, Cliente cliente) {
        this.numVenda = numVenda;
        this.valorTotal = valorTotal;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    public int getNumVenda() {
        return numVenda;
    }

    public void setNumVenda(int numVenda) {
        this.numVenda = numVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "numVenda=" + numVenda +
                ", valorTotal=" + valorTotal +
                ", vendedor=" + vendedor +
                ", cliente=" + cliente +
                '}';
    }
}
