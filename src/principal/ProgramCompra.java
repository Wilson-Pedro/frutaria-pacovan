package principal;

import model.bean.CompraFruta;
import model.dao.CompraDAO;

public class ProgramCompra {

	public static void main(String[] args) {
		
		CompraFruta compraFruta = new CompraFruta("206.140.740-58", 100.0, 9, true);
		
		CompraDAO dao = new CompraDAO();
		//dao.create(compraFruta);
		
		System.out.println();
		
		String cpf = "806.146.340-57";
		
		CompraFruta compra = dao.buscarCompraNaoFinalizada(cpf);
		System.out.println(compra);
		
		System.out.println();
		
		boolean compra2 = dao.existeCompraNaoFinalizadoComCpf(cpf);
		System.out.println(compra2);
		
		System.out.println();
		
		CompraFruta compraFruta2 = new CompraFruta("735.560.410-49", 300.0, 30, false);
		dao.update(compraFruta2);
	}
}
