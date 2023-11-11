package principal;

import java.util.List;

import model.bean.Cliente;
import model.dao.ClienteDAO;

public class ProgramCliente {

	public static void main(String[] args) {
		ClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente("Julio", "914.711.610-20", "(98) 3851-1099", "Rua das Melancias");
		//dao.create(cliente);
		
		System.out.println();
		List<Cliente> clientes = dao.buscarTodos();
		clientes.forEach(System.out::println);
		
		System.out.println();
		//dao.deletePorId(5);
		Cliente cli = dao.buscarClientePorId(6);
		System.out.println(cli);
		
		dao.update(cliente, 6);
	}
}
