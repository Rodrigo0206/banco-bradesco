package lab_banco_digital_oo_springboot.banco;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        // Criando uma instância do banco
        Banco banco = new Banco();
        banco.setNome("Banco Exemplo");

        // Criando contas
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        // Adicionando as contas ao banco
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(poupanca);
        banco.setContas(contas);

        // Realizando operações bancárias
        cc.depositar(100);
        cc.transferir(100, poupanca);

        // Imprimindo os extratos
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Contando e imprimindo o número de clientes
        System.out.println("Número de clientes: " + banco.contarClientes());
    }
}
