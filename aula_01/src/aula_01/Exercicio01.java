package aula_01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float salario, abono;
		String nome;
		
		System.out.println("Digite o nome e sobrenome do funcionário: ");
		nome = leia.nextLine();
		
		System.out.print("Digite o salário: \nR$ ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o abono: \nR$ ");
		abono = leia.nextFloat();
		
		
		
		System.out.println("Funcionário: " + nome);
		System.out.println("Novo salário: R$ " + (salario + abono));
		
		leia.close();

	}

}
