package performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class TestPerformance {

	public static void main(String[] args) {
		Integer[] valores = { 30000, 50000, 100000, 150000, 200000,300000, 500000, 1000000 };
		Collection<Integer> arrayListTest = new ArrayList<>();
		Collection<Integer> hashSetTest = new HashSet<>();
		Collection<Integer> hashTreeSet = new TreeSet<>();

		Arrays.stream(valores).forEach(valor -> {
			CollectionPerformance(arrayListTest, valor);
			CollectionPerformance(hashSetTest, valor);
			CollectionPerformance(hashTreeSet, valor);
		});

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

