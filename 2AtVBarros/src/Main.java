import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Database database = new Database();
        database.criarDatabase();
        
        //LISTAR TODOS CLIENTES CADASTRADOS
        List<Cliente> clienteList = database.exibirTodosClientes();
        for (Cliente c : clienteList){
            System.out.printf(String.valueOf(c));
        }
        
        //LISTAR TODOS MOTORISTAS CADASTRADOS
        List<Motorista> motoristaList = database.exibirTodosMotoristas();
        for (Motorista m : motoristaList){
            System.out.printf(String.valueOf(m));
        }
      
        
        System.out.println("---------------------------------------------");
        System.out.println("             DATABASE ATUALIZADA!            ");
        System.out.println("---------------------------------------------");
        
        
        //DELETAR CLIENTE
        int codCli = 1;
        database.deletarCliente(codCli);
        clienteList = database.exibirTodosClientes();
        for (Cliente cl1 : clienteList){
        System.out.println("CLIENTE DE CODIGO 1 DELETADO!!!"); 
        System.out.print(cl1);
        }
       
        //ATUALIZAR MOTORISTA
        int codMotorista = 1;
        String nnome = "Hackjesse";
        String ncpf = "47827487284";
        String ncnh = "43284783747";
        database.atualizarMotorista(codMotorista, nnome, ncpf, ncnh);
        motoristaList = database.exibirTodosMotoristas();
        for (Motorista mt : motoristaList){
        System.out.print(mt);
        }
    }
}
