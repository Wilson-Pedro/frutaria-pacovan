package principal;

import model.bean.Fruta;
import model.dao.FrutaDAO;

public class ProgramFruta {

	public static void main(String[] args) {
		
		Fruta fruta = new Fruta();
		fruta.setNome("Banana");
		fruta.setValor(2.0);
		fruta.setEstoque(50);
		
		Fruta fruta2 = new Fruta();
		fruta2.setNome("Maçã");
		fruta2.setValor(3.0);
		fruta2.setEstoque(60);
		
		Fruta fruta3 = new Fruta();
		fruta3.setNome("Pintomba");
		fruta3.setValor(1.0);
		fruta3.setEstoque(20);
		
		FrutaDAO dao = new FrutaDAO();
		dao.create(fruta3);
		dao.deletePorNome("Pintomba");
	}
}
