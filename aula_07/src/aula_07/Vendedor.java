package aula_07;

public class Vendedor extends Funcionarioex02{
	
	private String nivel;
	
	public Vendedor(String nome, int idade, String departamento, String funcao, float salario, String nivel) {

		super(nome, idade, departamento, funcao, salario);
		float comissao = 0;
		switch(nivel.toLowerCase()) {
		 case "junior" -> comissao = 1.02f;
		 case "pleno" -> comissao = 1.08f;
		 case "senior" -> comissao = 1.14f;
		}
		super.setSalario(salario*comissao);
		this.nivel = nivel;
		
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}
	
