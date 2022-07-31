public class Cliente {
    private int codCli;
    private String nome;
    private String telefone;
    private String endereco;
    private String cep;
    private String email;

    public Cliente() {
        super();
    }

    public Cliente(int codCli, String nome, String telefone, String endereco, String cep, String email) {
        this.codCli = codCli;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
    }

    public Cliente(Object o, int i) {
    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nCódigo do cliente: " + codCli +  "\nCliente: " + nome + "\n" +
                "Telefone: " + telefone + "\n" + "Endereço: " + endereco + "\n" +
                "CEP: " + cep + "\n" + "E-mail: " + email + "\n\n";
    }
}
