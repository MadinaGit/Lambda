public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            //при обработке запроса выявляется арифметическая ошибка, так как на ноль делить нельзя (переменная b = 1-1 = 0), для решения можно использовать цикл try-catch
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listener1 = System.out::println;
        Worker worker = new Worker(listener, listener1);
        worker.start();
    }
}
