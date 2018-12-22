import java.util.Optional;

public class OptionalClassMain {
    public static void main(String[] args){
        Integer value1 = null;
        Integer value2 = new Integer(10);

        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);

        System.out.println(sum(a,b));
    }
    public static Integer sum(Optional<Integer> a, Optional<Integer> b){
        System.out.println("present of a : " + a.isPresent());
        System.out.println("present of b : " + b.isPresent());

        Integer value1 = a.orElse(new Integer(0));
        Integer value2 = b.orElse(new Integer(0));
        return value1 + value2;
    }
}
