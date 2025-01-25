package performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestePerformanceComp {

	public static void main(String[] args) {
		Integer[] valores = {30000,50000,100000,150000,200000};
		
		Arrays.stream(valores).forEach(valor -> {
			System.out.println("Iniciando com " + valor + " elementos...");
			long inicio = System.currentTimeMillis();
			Collection<Integer> teste = new ArrayList<>(); 
			// Collection<Integer> teste = new HashSet<>();
			for (int i = 0; i < valor; i++) {
				teste.add(i);
			}
			for (int i = 0; i < valor; i++) {
				teste.contains(i);
			}
			long fim = System.currentTimeMillis();
			long tempo = fim - inicio;
			System.out.println("Tempo gasto: " + tempo + "milisegundos para " + valor + " elementos");
			
		});

	}

}
