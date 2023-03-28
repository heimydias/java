package aula_07;

public class Gerente extends Funcionarioex02{
	
	private TipoGerente tipo;

	public Gerente(String nome, int idade, String departamento, String funcao, float salario, TipoGerente tipo) {
		super(nome, idade, departamento, funcao, salario);
		this.tipo = tipo;
	}

	public TipoGerente getTipo() {
		return tipo;
	}

	public void setTipo(TipoGerente tipo) {
		this.tipo = tipo;
	}
		
    public void visualizar() {
    	System.out.println("Nome: " + this.getNome());
    	System.out.println("Idade: " + this.getIdade());
    	System.out.println("Departamento: " + this.getDepartamento());
    	System.out.println("Funcao: " + this.getFuncao());
    	System.out.println("Salario: " + this.getSalario());
    	System.out.println("Tipo: " + this.getTipo().toString().toLowerCase());
    	System.out.println();
}
	

}
