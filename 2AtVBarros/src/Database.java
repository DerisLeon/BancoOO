import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private ObjectContainer database = null;

    private void abrirDB() {
        database = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "BancoOO");
    }
    private void fecharDB(){
        database.close();
    }

    public void cadastrarCliente (Cliente cliente){
        abrirDB();
        database.store(cliente);
        System.out.println("Cliente cadastrado.");
        fecharDB();
    }
    public void cadastrarEntrega (Entrega entrega){
        abrirDB();
        database.store(entrega);
        System.out.println("Entrega cadastrada.");
        fecharDB();
    }
    public void cadastrarItemVenda (ItemVenda itemVenda){
        abrirDB();
        database.store(itemVenda);
        System.out.println("Item de venda cadastrado.");
        fecharDB();
    }
    public void cadastrarMotorista (Motorista motorista){
        abrirDB();
        database.store(motorista);
        System.out.println("Motorista cadastrado.");
        fecharDB();
    }
    public void cadastrarProduto (Produto produto){
        abrirDB();
        database.store(produto);
        System.out.println("Produto cadastrado");
        fecharDB();
    }
    public void cadastrarVeiculo (Veiculo veiculo){
        abrirDB();
        database.store(veiculo);
        System.out.println("Veiculo cadastrado.");
        fecharDB();
    }
    public void cadastrarVenda (Venda venda){
        abrirDB();
        database.store(venda);
        System.out.println("Venda cadastrada.");
        fecharDB();
    }
    public void cadastrarVendedor (Vendedor vendedor){
        abrirDB();
        database.store(vendedor);
        System.out.println("Vendedor cadastrado.");
        fecharDB();
    }
    
    //DELETAR CLIENTE
    public void deletarCliente(int codCli){
      abrirDB();  
      Cliente cliente = new Cliente();
      cliente.setCodCli(codCli);
      ObjectSet result = database.queryByExample(cliente);
      Cliente cresult = (Cliente) result.next();
      database.delete(cresult);
      fecharDB();
    }
    
    //ATUALIZAR MOTORISTA
    public void atualizarMotorista(int codMotorista, String nnome, String ncpf, String ncnh){
      abrirDB();  
      Motorista motorista = new Motorista();
      motorista.setCodMotorista(codMotorista);
      ObjectSet result = database.queryByExample(motorista);
      Motorista mresult = (Motorista) result.next();
      mresult.setNome(nnome);
      mresult.setCpf(ncpf);
      mresult.setCnh(ncnh);
      database.store(mresult);
      fecharDB();
    }
    
    //LISTAR TODOS CLIENTES CADASTRADOS
    public List<Cliente> exibirTodosClientes (){
        abrirDB();
        ObjectSet listCliente = database.queryByExample(Cliente.class);
        List<Cliente> cliente = new ArrayList<>();
        for (Object c: listCliente) {
            cliente.add((Cliente) c);
        }
        fecharDB();
        return cliente;
    }
    
    //LISTAR TODOS MOTORISTAS CADASTRADOS
    public List<Motorista> exibirTodosMotoristas (){
        abrirDB();
        ObjectSet listMotorista = database.queryByExample(Motorista.class);
        List<Motorista> motorista = new ArrayList<>();
        for (Object m: listMotorista) {
            motorista.add((Motorista) m);
        }
        fecharDB();
        return motorista;
    }
    
    // APÓS EXECUTAR UMA VEZ, COMENTE ESTA PARTE, PARA NÃO CRIAR OBJETOS REPETIDOS!!!
    public void criarDatabase () {
        abrirDB();

        Cliente cliente1 = new Cliente(1, "Barros", "76767-767676", "Rua do Viciado em Java", "58220-000", "barros@email.com");
        database.store(cliente1);
        
        Cliente cliente2 = new Cliente(2, "Gustavo", "187282-83817", "Rua Tartaruga Ninja", "58220-000", "gustavo@email.com");
        database.store(cliente2);
        
        
        Vendedor vendedor = new Vendedor(1, "663273", 3, "Marcos", "Rua do grau");
        database.store(vendedor);
        
        Produto produto = new Produto(1, 145.00, "Pizza gourmet", 3.00, "Coca-Cola");
        database.store(produto);
        
        Venda venda = new Venda(1, 12, vendedor, cliente1);
        database.store(venda);
        
        ItemVenda itemVenda = new ItemVenda(produto, venda, 10, 1);
        database.store(itemVenda);
        
        Veiculo veiculo = new Veiculo("GBA-1717", 4);
        database.store(veiculo);
        
        Motorista motorista = new Motorista(1, "90323290", "2329042", "Marcos", "Napoleao afogado");
        database.store(motorista);
        
        Entrega entrega = new Entrega("18:30h", "17/11/2021", 1, venda, veiculo, motorista);
        database.store(entrega);

        System.out.println("DATABASE CRIADA!");
        fecharDB();
    }
}
