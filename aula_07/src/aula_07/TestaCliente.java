package aula_07;

public class TestaCliente {

	public static void main(String[] args) {
		
		Clienteex01 tc = new Clienteex01("Jamille Farias" , 18, "São Paulo" , "(11) 98856-0234");
		tc.visualizar();
		
		Clienteex01 tc1 = new Clienteex01("Heimy Dias" , 19, "São Paulo" , "(11) 92251-7349");
		tc1.visualizar();
		
		Pf c1 = new Pf("Rafaely Hana", 30, "Curitiba", "(41) 3357-9988", "450.876.993-76");
		c1.visualizar();
		
		Pj c2 = new Pj("Biquine de Bolinhas Ltda Me", 3, "Gonçalves", "(35) 2480-9915", "01.092.846/0001-27");
		c2.visualizar();

	}

}
