package principal;

import model.bean.Cliente;
import model.dao.ClienteDAO;

public class ProgramCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(1, "Pedro", "414.766.910-70", "(98) 2851-0097", "Rua das Goiabas");
		ClienteDAO dao = new ClienteDAO();
		dao.create(cliente);
	}
}
