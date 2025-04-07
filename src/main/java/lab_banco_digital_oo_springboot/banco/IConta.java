package lab_banco_digital_oo_springboot.banco;


public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

    Cliente getCliente();
}
