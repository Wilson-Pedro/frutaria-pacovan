package principal;

import model.bean.Fruta;
import model.dao.FrutaDAO;

public class Program {

	public static void main(String[] args) {
		
		Fruta fruta = new Fruta();
		fruta.setNome("Banana");
		fruta.setValor(2.50);
		fruta.setEstoque(50);
		
		Fruta fruta2 = new Fruta();
		fruta2.setNome("Maçã");
		fruta2.setValor(3.00);
		fruta2.setEstoque(60);
		
		FrutaDAO dao = new FrutaDAO();
		dao.create(fruta2);
	}
}
