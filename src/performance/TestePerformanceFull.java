package performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformanceFull {

	public static void main(String[] args) {
		Integer[] valores = { 30000, 50000, 100000, 150000, 200000 };

		Arrays.stream(valores).forEach(valor -> {
			//System.out.println("Iniciando com " + valor + " elementos...");

			Collection<Integer> testeArrayList = new ArrayList<>();
			Collection<Integer> testeHashSet = new HashSet<>();
			
			PerformanceArrayList(testeArrayList, valor);
			PerformanceHashSet(testeHashSet, valor);

		});

	}
	
	private static void PerformanceArrayList(Collection<Integer> testeArrayList, Integer valor) {
		//System.out.println("Iniciando PerformanceArrayList com " + valor + " elementos...");
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < valor; i++) {
			testeArrayList.add(i);
		}
		for (int i = 0; i < valor; i++) {
			testeArrayList.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Performance com ArrayList | \tTempo gasto: " + tempo + " milisegundos para " + valor + " elementos");

    }
	
	private static void PerformanceHashSet(Collection<Integer> testeHashSet, Integer valor) {
		//System.out.println("Iniciando PerformanceHashSet com " + valor + " elementos...");
		long inicio = System.currentTimeMillis();

		for (int i = 0; i < valor; i++) {
			testeHashSet.add(i);
		}
		for (int i = 0; i < valor; i++) {
			testeHashSet.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Performance com HashSet |Tempo gasto: " + tempo + " milisegundos para " + valor + " elementos");
	}
}
