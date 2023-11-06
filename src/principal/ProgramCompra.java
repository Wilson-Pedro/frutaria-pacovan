package principal;

import model.bean.CompraFruta;
import model.dao.CompraDAO;

public class ProgramCompra {

	public static void main(String[] args) {
		
		CompraFruta compraFruta = new CompraFruta("206.140.740-58", 100.0, 9, true);
		
		CompraDAO compraDAO = new CompraDAO();
		compraDAO.create(compraFruta);
	}
}
