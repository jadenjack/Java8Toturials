import java.util.ArrayList;
import java.util.List;

public class MethodReferencesMain {
    public static void main(String[] args){
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
        names.forEach(name -> System.out.println(name + " is in names"));

        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.forEach(number -> System.out.println((int)number + 10));
    }
}
