import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsMain {
    public static void main(String[] args){

        FilterExample();
        ForeachExample();
        MapAndDistinctExample();
        SortExample();
        ParallelProcessingExample();
        CollectorExample();
        StatisticsExample();
    }

    private static void StatisticsExample() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }

    private static void CollectorExample() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        String mergedString = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.joining());
    }

    private static void ParallelProcessingExample() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.parallelStream().filter(string->!string.isEmpty()).count();
    }

    private static void SortExample() {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }

    private static void MapAndDistinctExample() {
        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        List<Integer> squaresList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
    }

    private static void ForeachExample() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    private static void FilterExample() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        long count = strings.stream().count();
        long filteredCount = strings.stream().filter(string->!string.isEmpty()).count();
    }
}
