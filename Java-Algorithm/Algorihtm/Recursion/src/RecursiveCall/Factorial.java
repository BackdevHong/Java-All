package RecursiveCall;

public class Factorial {
    public int factorialFunc(int n) {
        if (n > 1) {
            return n * this.factorialFunc(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorialFunc(5));
    }

}
