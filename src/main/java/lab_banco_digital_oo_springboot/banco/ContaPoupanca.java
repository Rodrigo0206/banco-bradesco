package lab_banco_digital_oo_springboot.banco;


public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupan�a ===");
        super.imprimirInfosComuns();
    }

    @Override
    public Cliente getCliente() {
        return null;
    }
}
