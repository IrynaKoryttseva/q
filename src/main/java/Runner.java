class Main {
    public static void main(String[]args){
        //actions with array
        int [] number = {4,-200,0,0,21,45,-34};
        ArrayActions arrayActions = new ArrayActions();
        arrayActions.sortArraySelectionsAsc(number);
        arrayActions.sortArraySelectionsDesc(number);
        arrayActions.sortArrayBubbleAsc(number);
        arrayActions.sortArrayBubbleDesc(number);
        arrayActions.findMinAndMaxAndswapMinAndMax(number);
        //actions with text
        String text = "Hello world!";
        TextActions textActions = new TextActions();
        textActions.swapTextString(text);
        textActions.swapTextArray(text);
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
