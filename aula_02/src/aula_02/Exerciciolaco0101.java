package aula_02;

import java.util.Scanner;

public class Exerciciolaco0101 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valora, valorb, valorc, resultado;
		
		System.out.println("Digite o primeiro valor (A): ");
		valora = leia.nextInt();
		System.out.println("Digite o segundo valor (B): ");
		valorb = leia.nextInt();
		System.out.println("Digite o terceiro valor (C): ");
		valorc = leia.nextInt();
		
		resultado = (valora + valorb);
		System.out.println("O resultado é: " + resultado);
		
		if (resultado < valorc)
			System.out.println("C é maior que A e B");
		else if (resultado > valorc)
			System.out.println("C é menor que A e B");
		else if (resultado == valorc)
			System.out.println("C é igual A e B");
		
		leia.close();
	}

}
