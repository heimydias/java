package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		int vetorInteiro[] = {4, 5, 7, 6, 10, 1, 3, 2, 9, 8};
		
		float[] vetorFloat = new float[5];
		
		/*System.out.println("Tamanho do vetro: " + vetorFloat.length);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		for (int contador = 0; contador < vetorInteiro.length; contador ++) {
			if (vetorInteiro[contador] == numero)
			System.out.println("Posição [" + contador + "] = " + vetorInteiro[contador]);
		}
		
		for (int contador = 0; contador < vetorFloat.length; contador ++) {
			System.out.println("\nDigite um valor para a posição [" + contador + "]: ");
			vetorFloat[contador] = leia.nextFloat();
		}*/
		
		for (float vfloat : vetorFloat) {
			System.out.println(vfloat);
		}
		
		Arrays.sort(vetorInteiro);
		
		for (int vInt : vetorInteiro) {
			System.out.println(vInt);
		}
	}

}