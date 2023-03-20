package aula_04;

import java.util.Scanner;

public class Matrizex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int sPrincipal = 0;
		int sSecundaria = 0;
		String dPrincipal = "";
		String dSecundaria = "";
		
		for (int iLinha = 0; iLinha < matriz.length; iLinha ++) {
			
			for(int iColuna = 0; iColuna < matriz.length; iColuna++) {
				
				System.out.print("Digite um número: ");
				matriz[iLinha][iColuna] = leia.nextInt();
			}
		}
		
		for (int contador = 0; contador < matriz.length; contador++) {
			
			dPrincipal += matriz[contador][contador] + "";
			sPrincipal += matriz[contador][contador];
			
			dSecundaria += matriz[contador][matriz.length - 1 - contador] + "";
			sSecundaria += matriz[contador][contador];
		}
		
		System.out.println("\nElementos da Diagonal Principal: ");
		System.out.println(dPrincipal);
		
		System.out.println("\nElementos da Diagonal Secundaria: ");
		System.out.println(dSecundaria);
		
		System.out.println("\nSoma de todos elementos da Diagonal Principal: ");
		System.out.println(sPrincipal);
		
		System.out.println("\nMédia de todos elementos da Diagonal Secundaria: ");
		System.out.println(sSecundaria);
	}

}
