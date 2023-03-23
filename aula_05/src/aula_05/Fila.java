package aula_05;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Brenda");
		fila.add("Guilherme");
		fila.add("Michelle");
		fila.add("Gabriel");
		fila.add("Julia");
		
		for(var elemento : fila)
			System.out.println(elemento);
		
		System.out.println("Retirando o 1° elemento da lista: ");
		fila.poll();
		System.out.println(fila);
		
		fila.add("Reynaldo");
		System.out.println(fila);
		
		System.out.println(fila.size());
		System.out.println(fila.contains("Reynaldo"));
		

	}

}
