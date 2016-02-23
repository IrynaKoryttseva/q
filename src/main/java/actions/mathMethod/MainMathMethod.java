package actions.mathMethod;

class MainMathMethod {
    public static void main(String[]args){
        //actions with math
        int num = 5;
        MathActions mathActions = new MathActions();
        mathActions.factorialC(num);
        mathActions.factorialR(num);
        System.out.println("factorial "+num+" equal = "+mathActions.factorialR(num));
        mathActions.fibonacci(num);
        System.out.println("fibonacci "+num+" equal = "+mathActions.fibonacci(num));
        mathActions.fibonacciC(num);

    }
}
