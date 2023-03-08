package question1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class question1 {
    public static void main(String[] args) {
        Consumer<String> showInfo = x -> System.out.println(x);
        showInfo.accept("Consumer interface implementation using lambdas.");
        Supplier<Double> showValue = () -> Math.random();
        System.out.println("Random value generated is "+10*showValue.get());
        Predicate<Integer> showAnswer = x -> x%5==0;
        System.out.println("Number is divisible by 5 ? : " + showAnswer.test(15));
        Function<Integer,Double> showConversion = x -> x*5.20;
        System.out.println("Number is converted to decimal by multiplying with 5.20 : "+showConversion.apply(10));
    }
}
