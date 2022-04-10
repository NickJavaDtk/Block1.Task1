package Study.lyumbda.task1;

public class Main {
    public static void main(String[] args)  {
        Calculator calc = Calculator.instance.get( );
        int a, b, c = 0;
        try {
            a = calc.plus.apply(1, 2);
            b = calc.minus.apply(1, 1);
            c = calc.devide.apply(a, b);
        } catch (Exception e) {
            e.printStackTrace( );
        } finally {
            calc.println.accept(c);
        }
    }
}
