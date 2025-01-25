package performance;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		Collection<Integer> teste = new ArrayList<>(); 
		// Collection<Integer> teste = new HashSet<>();
		int total = 300000;
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}
}