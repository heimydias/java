package aula_07;

public class Testafuncionario {

	public static void main(String[] args) {

		Funcionarioex02 cf = new Funcionarioex02("Andresa Marçal" , 26, "RH" , "Assistente" , 2000.00f);
		cf.visualizar();
		
		Funcionarioex02 cf2 = new Funcionarioex02("Deiziane Rodrigues" , 21, "T.I" , "Assistente" , 3000.00f);
		cf2.visualizar();
		
		Gerente go = new Gerente("Patricia Mamba", 45, "Comercial", "Gerente", 3500.00f, TipoGerente.OPERACIONAL);
		go.visualizar();
		
		Gerente ga = new Gerente("Maria Gomes", 33, "CEO", "Gerente", 5000.00f, TipoGerente.ADMINISTRATIVO);
		ga.visualizar();
		
		Vendedor v1 = new Vendedor("Julia Maria", 22, "Comercial", "Vendedora", 1000.00f, "junior");
		v1.visualizar();
		
		Vendedor v2 = new Vendedor("Ursula Pedrosa", 28, "Comercial", "Vendedora", 1000.00f, "senior");
		v2.visualizar();

	}

}

