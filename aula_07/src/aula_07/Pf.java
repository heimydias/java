package aula_07;

public class Pf extends Clienteex01{
	
	private String cpf;
	
	public Pf(String nome, int idade, String cidade, String telefone, String cpf) {
		super(nome, idade, cidade, telefone);
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
    public void visualizar() {
    	System.out.println("Nome: " + this.getNome());
    	System.out.println("Idade: " + this.getIdade());
    	System.out.println("Cidade: " + this.getCidade());
    	System.out.println("Telefone: " + this.getTelefone());
    	System.out.println("CPF n.º: " + this.getCpf());
    	System.out.println();
    }
}
