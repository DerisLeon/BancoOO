import java.time.LocalDate;
import java.time.LocalTime;

public class Entrega {
    private String hora;
    private String data;
    private int numVen;
    private Venda venda;
    private Veiculo veiculo;
    private Motorista motorista;

    public Entrega() {
        super();
    }

    public Entrega(String hora, String data, int numVen, Venda venda, Veiculo veiculo, Motorista motorista) {
        this.hora = hora;
        this.data = data;
        this.numVen = numVen;
        this.venda = venda;
        this.veiculo = veiculo;
        this.motorista = motorista;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumVen() {
        return numVen;
    }

    public void setNumVen(int numVen) {
        this.numVen = numVen;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Entrega{" +
                "hora='" + hora + '\'' +
                ", data='" + data + '\'' +
                ", numVen=" + numVen +
                ", venda=" + venda +
                ", veiculo=" + veiculo +
                ", motorista=" + motorista +
                '}';
    }
}