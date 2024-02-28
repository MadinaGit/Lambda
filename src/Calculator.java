import java.util.function.*;

class Calculator {
    public interface Supplier<T> {
        T get();
    }

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;


    BinaryOperator<Integer> divide = (x, y) -> y == 0 ? 0 : x / y;
    //используем в методе divide тернарный оператор для предотвращения ошибки деления на 0
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
