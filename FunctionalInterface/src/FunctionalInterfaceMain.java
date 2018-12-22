import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceMain {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Print All numbers");
        eval(list, n->true);

        System.out.println("Print even numbers");
        eval(list, n->n%2==0);

        System.out.println("Print prime numbers");
        eval(list, n->isPrimeNumber(n));
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate){
        for(Integer n : list){
            if(predicate.test(n)){
                System.out.println(n + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int n){
        if(n<=1){
            return false;
        }
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
