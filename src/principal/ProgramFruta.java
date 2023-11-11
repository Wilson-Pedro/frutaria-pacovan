package principal;

import model.bean.Fruta;
import model.dao.FrutaDAO;

public class ProgramFruta {

	public static void main(String[] args) {
		
		FrutaDAO dao = new FrutaDAO();
		
		Fruta fruta = new Fruta();
		fruta.setNome("Banana");
		fruta.setValor(2.0);
		fruta.setEstoque(50);
		
		Fruta fruta2 = new Fruta();
		fruta2.setNome("Maçã");
		fruta2.setValor(3.0);
		fruta2.setEstoque(60);
		
		Fruta pintomba = new Fruta();
		pintomba.setNome("Pintomba");
		pintomba.setValor(1.0);
		pintomba.setEstoque(40);
		
//		dao.create(pintomba);
//		dao.update(pintomba);
//		dao.update(pintomba, 10);
//		dao.deletePorNome("Pintomba");
	}
}
