package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Pilhaex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<>();
		
		int opcao = 0;
		String livro;
		
		do {
			
			System.out.println("1- Adicionar livro na Pilha");
			System.out.println("2- Listar todos os livoros");
			System.out.println("3- Retire um livro da Pilha");
			System.out.println("6- Sair");
			
			opcao = leia.nextInt();
			leia.nextLine();
			
			if (opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida!\nEscolha uma das opções abaixo:");
                continue;
		 }
			switch(opcao) {
			case 0:
				System.out.println("Programa finalizado");
				break;
			case 1:
				System.out.println("Adicionar livro na Pilha");
				System.out.println("Digite o nome do livro: ");
				pilha.push(leia.nextLine());
				System.out.println("Livro adicionado a Pilha!");
				break;
			case 2:
				System.out.println("Listar todos os livros");
				if (pilha.isEmpty()) {
				System.out.println("Não existe o livro na Pilha!");
				}else {
				for(var livros: pilha)
					System.out.println(livros);
				}
				break;			
			case 3:
				System.out.println("Retire um livro da Pilha");
				System.out.println("Digite o nome do livro: ");
				livro = leia.nextLine();
				pilha.remove(livro);
				break;
			}
		
		}while(opcao != 0);

}

}
