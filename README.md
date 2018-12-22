Java8 Tutorials

출처
https://www.tutorialspoint.com/java8

1. Sort
2. Lambda Expression
3. Method References
	ex) names.foreach(System.out::println)
	ex) numbers.foreach(n -> sout(n));
4. Functional Interfaces
	- eval(List<Integer> list, Predicate<Integer> predicate)
	- eval(list, n->n%2==0)
	- eval(list, n->isPrimeNumber(n))
5. Default Method
	ex) car implements FourWheelers, Vehicle
6. Streams
	- Filter
	- Foreach
	- MapAndDistinct
	- Sort
	- ParallelProcessing
	- Collector
	- Statistics
7. Optional Class
	- ofNullable(value)
	- isPresent()
	- ofElse(new Integer(0))