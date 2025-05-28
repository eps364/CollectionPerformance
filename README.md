# CollectionPerformance

## Comparativo simples de ArrayList e HashSet

### ArrayList<>()

Uma implementação de lista baseada em um array redimensionável, que mantém a ordem de inserção dos elementos e permite elementos duplicados. É eficiente para acesso aleatório rápido, mas pode ser mais lento para operações de adição e remoção quando a lista é grande, devido à necessidade de redimensionamento e deslocamento dos elementos.
ArrayList quando precisar de uma coleção ordenada com acesso rápido

### HashSet<>()

Uma implementação de conjunto baseada em uma tabela hash, que não mantém nenhuma ordem específica e não permite elementos duplicados. É geralmente mais rápido para operações de adição, remoção e verificação de existência de elementos, devido à sua implementação baseada em tabela hash. 
Quando precisar de uma coleção sem duplicadas e com operações rápidas de adição e remoção.

## Melhor Performace

Para o código mencionado, a melhor performance se deu para o HashSet.
ArrayList possui a menor performance segundo o código utilizado.

## Output de uma das execuções

| Collection  | Tempo (milisegundos) | Elementos |
|-------------|----------------------|-----------|
| ArrayList   | 203                  | 30000     |
| ArrayList   | 668                  | 50000     |
| ArrayList   | 3316                 | 100000    |
| ArrayList   | 11086                | 150000    |
| ArrayList   | 62733                | 200000    |
| HashSet     | 4                    | 30000     |
| HashSet     | 6                    | 50000     |
| HashSet     | 4                    | 100000    |
| HashSet     | 2                    | 150000    |
| HashSet     | 18                   | 200000    |
| TreeSet     | 16                   | 30000     |
| TreeSet     | 11                   | 50000     |
| TreeSet     | 1016                 | 100000    |
| TreeSet     | 26                   |  150000   |     
| TreeSet     | 25                   | 200000    |     
