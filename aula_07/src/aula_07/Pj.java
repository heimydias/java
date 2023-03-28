package aula_07;

public class Pj extends Clienteex01{
	
	private String cnpj;
	
	public Pj(String nome, int idade, String cidade, String telefone, String cnpj) {
		super(nome, idade, cidade, telefone);
		this.cnpj = cnpj;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

    public void visualizar() {
    	System.out.println("Razão Social: " + this.getNome());
    	System.out.println("Idade: " + this.getIdade());
    	System.out.println("Cidade: " + this.getCidade());
    	System.out.println("Telefone: " + this.getTelefone());
    	System.out.println("CNPJ n.º: " + this.getCnpj());
    	System.out.println();
    }
	
	

}
