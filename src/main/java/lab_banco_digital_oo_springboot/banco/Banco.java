package lab_banco_digital_oo_springboot.banco;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor // Cria o construtor sem parâmetros
@AllArgsConstructor // Cria o construtor com todos os parâmetros
@ToString // Gera o método toString()
public class Banco {

    private String nome;
    private List<Conta> contas;

    // Método para contar os clientes
    public int contarClientes() {
        Set<Cliente> clientes = new HashSet<>(); // Usamos um HashSet para garantir que sejam clientes únicos
        for (Conta conta : contas) {
            clientes.add(conta.getCliente());
        }
        return clientes.size();
    }
}
