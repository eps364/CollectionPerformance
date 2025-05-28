package performance;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class TestPerformance {

	public static void main(String[] args) {
		Integer[] valores = { 30000, 50000, 100000, 150000, 200000, 300000, 500000 };
		Collection<Integer> arrayListTest = new ArrayList<>();
		Collection<Integer> hashSetTest = new HashSet<>();
		Collection<Integer> treeSetTest = new TreeSet<>();

		Instant initial = Instant.now();
		Arrays.stream(valores).forEach(valor -> {
			CollectionPerformance(arrayListTest, valor);
			CollectionPerformance(hashSetTest, valor);
			CollectionPerformance(treeSetTest, valor);
		});
		Instant fim = Instant.now();
		Duration duration = Duration.between(initial, fim);
		System.out.println("Tempo: " + duration.toMillis() + " ms");

	}

	private static void CollectionPerformance(Collection<Integer> teste, Integer valor) {
		long inicio = System.currentTimeMillis();

		for (int i = 0; i < valor; i++)
			teste.add(i);
		for (int i = 0; i < valor; i++)
			teste.contains(i);

		System.out.println(String.format("%-10s | \tTempo: %-10d milisegundos para \t%-10d elementos.",
				getCollectionType(teste), (System.currentTimeMillis() - inicio), valor));
	}

	private static String getCollectionType(Collection<Integer> teste) {
		return teste.getClass().getSimpleName();
	}
}