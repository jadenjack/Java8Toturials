public class LambdaMain {

    public static void main(String[] args){

        MathOperation add = (int a, int b) -> a+b;
        MathOperation sub = (a,b)->a-b;
        MathOperation mul = (int a, int b) -> {return a*b;};
        MathOperation div = (int a, int b) -> a/b;

        System.out.println("10 + 5 = " + operate(10, 5, add));
        System.out.println("10 - 5 = " + operate(10, 5, sub));
        System.out.println("10 x 5 = " + operate(10, 5, mul));
        System.out.println("10 / 5 = " + operate(10, 5, div));

        GreetingService gs = message ->
                System.out.println("Hello " + message);
        gs.sayMessage("World");

    }
    private static int operate(int a, int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}

