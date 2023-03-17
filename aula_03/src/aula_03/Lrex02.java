package aula_03;

import java.util.Scanner;

public class Lrex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero; 
		int par = 0;
		int impar = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d° numero: ", i + 1);
			numero = leia.nextInt();
		if(numero % 2 == 0)
			par ++;
			
		else if (numero % 2 != 0)
			impar ++;
		}
		
		System.out.println("Total de número pares: " + par);
		System.out.println("Total de número impares: " + impar);
		
	}

}
