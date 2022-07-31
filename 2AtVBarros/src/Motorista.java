public class Motorista {
    private int codMotorista;
    private String cpf;
    private String cnh;
    private String nome;
    private String endereco;

    public Motorista() {
        super();
    }

    public Motorista(int codMotorista, String cpf, String cnh, String nome, String endereco) {
        this.codMotorista = codMotorista;
        this.cpf = cpf;
        this.cnh = cnh;
        this.nome = nome;
        this.endereco = endereco;
    }
    public int getCodMotorista() {
        return codMotorista;
    }

    public void setCodMotorista(int codMotorista) {
        this.codMotorista = codMotorista;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
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
        return "\nCódigo do motorista: " + codMotorista + "\nCPF: " + cpf + "\n" +
                "CNH: " + cnh + "\nNome do Motorista: " + nome + "\n" +
                "Endereço de Entrega: " + endereco + "\n\n";
    }
}
