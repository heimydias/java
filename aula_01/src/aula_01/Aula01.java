package aula_01;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		double numero1, numero2;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma: " + (numero1 + numero2));
		System.out.println("Subtração: " + (numero1 - numero2));
		System.out.println("Multiplicação: " + (numero1 * numero2));
		System.out.println("Divisão: " + (numero1 / numero2));
		System.out.println("Potência: " + (Math.pow(numero1, numero2)));
		System.out.println("Raíz Quadrada: " + (Math.sqrt(numero1)));
		
		System.out.println("Nome: " + nome);
		
		leia.close();		

	}

}
