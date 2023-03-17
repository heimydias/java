package aula_03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade, sexo, esporte, contador = 0, futebolF = 0, maiores18v = 0;
		char continua = 'S';
		
		while(continua == 'S') {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o sexo (1-M/2-F/3-Outro): ");
			sexo = leia.nextInt();
			
			System.out.println("Digite o esporte (1-Futebol/2-Volei/3-Basquete): ");
			esporte = leia.nextInt();
			
			contador ++;
			
			if(sexo == 2  && esporte == 1)
				futebolF ++;
			
			if(idade >= 18  && esporte == 2)
				maiores18v ++;
			
			System.out.println("Deseja continuar (s/n): ");
			continua = leia.next().toUpperCase().charAt(0);
			
		}

		System.out.println("Total de fichas preenchida: " + contador);
		
	}

}
