package actions.mathMethod;

public class MathActions {
    public void factorialC(int a) {
        int result = 1;
        if (a > 0){
            for (int i = 1; i <= a; i++) {
                result = result * i;
            }
            System.out.println(result);

        } else {
            System.out.println("Factorial can not be negative");
        }
    }

    public int factorialR(int a) {
        int result;
        if (a == 1) return 1;
        result = factorialR(a - 1) * a;
        return result;
    }

    public int fibonacci(int a) {
        if (a == 0) return 0;
        else if (a <= 2) return 1;
        int result = fibonacci(a - 1) + fibonacci(a - 2);
        return result;
    }

    public void fibonacciC(int a) {
        int elm1 = 0;
        int elm2 = 1;
        int elm3 = 0;
        System.out.print(elm1 + " " + elm2);
        for (int i = 0; i <= a; i++) {
            elm3 = elm1 + elm2;
            System.out.print(" " + elm3);
            elm1 = elm2;
            elm2 = elm3;
        }
        System.out.println();
        System.out.println(elm3);
    }
}

