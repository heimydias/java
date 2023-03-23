package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queueex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> filaB = new LinkedList<>();
		
		int opcao = 0;
		String nome;
		
		do {
			
			System.out.println("1- Adicionar cliente na Fila");
			System.out.println("2- Listar todos os clientes");
			System.out.println("3- Retire um cliente da Fila");
			System.out.println("0- Sair");
			
			opcao = leia.nextInt();
			
			 if (opcao < 0 || opcao > 3) {
	                System.out.println("Opção inválida!\nEscolha uma das opções abaixo:");
	                continue;
			 }
			switch(opcao) {
			case 0:
				System.out.println("Programa finalizado");
				break;
			case 1:
				System.out.println("Adicionar cliente na Fila");
				System.out.println("Digite o nome do cliente: ");
				filaB.add(leia.next());
				System.out.println("Cliente adicionado a Fila!");
				break;
			case 2:
				System.out.println("Listar todos os clientes");
				if (filaB.isEmpty()) {
					System.out.println("Não existem clientes na fila!");
				}else {
				for(var nomes: filaB)
					System.out.println(nomes);
				}
				break;			
			case 3:
				System.out.println("Retire um cliente da Fila");
				System.out.println("Digite o nome do cliente: ");
				nome = leia.next();
				filaB.remove(nome);
				break;
			}
			
		}while(opcao != 0);

	}

}
