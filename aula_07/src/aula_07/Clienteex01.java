package aula_07;

public class Clienteex01 {

	//atributos
    private String nome;
    private int idade;
    private String sexo;
    private String cidade;
    private String telefone;


    //metodo
    public Clienteex01(String nome, int idade, String sexo, String cidade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cidade = cidade;
        this.telefone = telefone;
    }
    
  //metodo GET e SET
    public String getNome() {
        return nome;
        
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
}


    public int getIdade() {
    	return idade;
}


    public void setIdade(int idade) {
    	this.idade = idade;
}


    public String getSexo() {
    	return sexo;
}


    public void setSexo(String sexo) {
    	this.sexo = sexo;
}


    public String getCidade() {
    	return cidade;
}


    public void setCidade(String cidade) {
    	this.cidade = cidade;
    }

    public String getTelefone() {
    	return telefone;
}


    public void setTelefone(String telefone) {
    	this.telefone = telefone;
}

    //metodo visualizar
    public void visualizar() {
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Idade: " + this.idade);
    	System.out.println("sexo: " + this.sexo);
    	System.out.println("Cidade: " + this.cidade);
    	System.out.println("Telefone: " + this.telefone);
}
}

